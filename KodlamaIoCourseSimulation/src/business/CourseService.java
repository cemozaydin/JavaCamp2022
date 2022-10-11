package business;

import entities.Course;

import java.util.List;

public interface CourseService {
    void add(Course course) throws Exception ;
    void delete(Course course);
    void update(Course course);
    List<Course> getAll();
}
