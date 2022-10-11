import business.*;
import core.logging.FileILogger;
import core.logging.ILogger;
import core.logging.MailILogger;
import dataAccess.*;
import dataAccess.inMemory.InMemoryCategoryDao;
import dataAccess.inMemory.InMemoryCourseDao;
import dataAccess.inMemory.InMemoryInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;


public class Main {
    public static void main(String[] args) throws Exception {

        ILogger[] loggers = {new MailILogger(), new FileILogger()};

        //
        // NHibernate ve JDBC kullanılarak <Instructor> class'ında yapılan çalışma
        //
        System.out.println("******************************************************");
        System.out.println("***************** EĞİTMEN MENÜSÜ *********************");
        System.out.println("******************************************************");

        InstructorService instructorManager = new InstructorManager(new JdbcInstructorDao(new InMemoryInstructorDao()));
        //InstructorService instructorManager = new InstructorManager(new NHibernateInstructorDao(new InMemoryInstructorDao()));

        System.out.println("*****  Ekleme *****");
        Instructor instractor1 = new Instructor();
        instractor1.setInstructorId(10);
        instractor1.setInstructorName("Cem Özaydın");

        instructorManager.add(instractor1);
        System.out.println();

        System.out.println("*****  Listeleme *****");
        instructorManager.getAll().forEach(i-> System.out.println(i.getInstructorId() + "." + i.getInstructorName()));
        System.out.println();

        System.out.println("*****  Silme ve Güncel Liste *****");
        instructorManager.delete(instractor1);
        System.out.println("\n>> Yeni Liste: ");
        instructorManager.getAll().forEach(i-> System.out.println("\t" + i.getInstructorId() + "." +  i.getInstructorName()));
        System.out.println();

        //
        // NHibernate ve JDBC kullanılarak <Category> class'ında yapılan çalışma
        //
        System.out.println("******************************************************");
        System.out.println("***************** KATEGORİ MENÜSÜ *********************");
        System.out.println("******************************************************");

        //CategoryService categoryManager = new CategoryManager(new JdbcCategoryDao(new InMemoryCategoryDao()));
        CategoryService categoryManager = new CategoryManager(new NHibernateCategoryDao(new InMemoryCategoryDao()), loggers);

        System.out.println("***** Ekleme *****");
        Category category1 = new Category();
        category1.setCategoryId(10);
        category1.setCategoryName("Mobil Programlama");

        categoryManager.add(category1);
        System.out.println();

        System.out.println("*****  Listeleme *****");
        categoryManager.getAll().forEach(c-> System.out.println(c.getCategoryId() + "." + c.getCategoryName()));
        System.out.println();

        System.out.println("***** Silme ve Güncel Liste *****");
        categoryManager.delete(category1);
        System.out.println("\n>> Yeni Liste : ");
        categoryManager.getAll().forEach(k-> System.out.println("\t" + k.getCategoryId() + "." + k.getCategoryName()));
        System.out.println();

        //
        // NHibernate ve JDBC kullanılarak <Course> class'ında yapılan çalışma
        //
        System.out.println("******************************************************");
        System.out.println("******************* KURS MENÜSÜ **********************");
        System.out.println("******************************************************");

        //CourseService courseManager = new CourseManager(new JdbcCourseDao(new InMemoryCourseDao()));
        CourseService courseManager = new CourseManager(new NHibernateCourseDao(new InMemoryCourseDao()),loggers);

        System.out.println("***** Ekleme *****");
        Course course1 = new Course();
        course1.setCourseId(10);
        course1.setCategoryId(1);
        course1.setInstructorId(1);
        course1.setCourseName("C# 2022");
        course1.setCourseImagePath("newCourseImagePath.jpg");
        course1.setPrice(10);
        course1.setProgressRate(25);

        courseManager.add(course1);
        System.out.println();

        System.out.println("*****  Listeleme *****");
        courseManager.getAll().forEach(s-> System.out.println(s.getCourseName() + " - " + s.getCourseImagePath() + " - " + s.getPrice() + " TL"));
        System.out.println();
    }
}
