package business;

import core.logging.ILogger;
import dataAccess.CourseDao;
import entities.Course;

import java.util.List;

public class CourseManager implements CourseService{
    private CourseDao courseDao;
    private ILogger[] loggers;

    public CourseManager(CourseDao courseDao, ILogger[] loggers) {
        this.courseDao = courseDao;
        this.loggers=loggers;
    }

    @Override
    public void add(Course course) throws Exception {

        for (Course item : courseDao.getAll()){
            if (item.getCourseName()==course.getCourseName()){
                throw new Exception("HATA! Kurs ismi daha önce kullanılmış.");
            }
        }

        if (course.getPrice()<=0){
            throw new Exception("HATA! Kurs ücreti 0'dan küçük olamaz");
        }

        this.courseDao.add(course);
        for(ILogger logger : loggers){
            logger.log(course.getCourseName());
        }
    }

    @Override
    public void delete(Course course) {
        this.courseDao.delete(course);
    }

    @Override
    public void update(Course course) {}

    @Override
    public List<Course> getAll() {
        return this.courseDao.getAll();
    }
}
