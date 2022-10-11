package dataAccess;

import dataAccess.inMemory.InMemoryCourseDao;
import entities.Course;

import java.util.List;

public class NHibernateCourseDao implements CourseDao{
    private InMemoryCourseDao inMemoryCourseDao;

    public NHibernateCourseDao(InMemoryCourseDao inMemoryCourseDao) {
        this.inMemoryCourseDao = inMemoryCourseDao;
    }

    @Override
    public void add(Course course) {
        this.inMemoryCourseDao.add(course);
        System.out.println("NHibernate kullanılarak kurs eklendi : " + course.getCourseName());
    }

    @Override
    public void update(Course course) {
        this.inMemoryCourseDao.update(course);
        System.out.println("NHibernate kullanılarak kurs güncellendi : " + course.getCourseName());
    }

    @Override
    public void delete(Course course) {
        this.inMemoryCourseDao.delete(course);
        System.out.println("NHibernate kullanılarak kurs silindi : " + course.getCourseName());
    }

    @Override
    public List<Course> getAll() {
        return this.inMemoryCourseDao.getAll();
    }

}
