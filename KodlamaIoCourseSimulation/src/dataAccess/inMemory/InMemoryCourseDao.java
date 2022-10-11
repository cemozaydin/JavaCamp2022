package dataAccess.inMemory;

import dataAccess.CourseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class InMemoryCourseDao implements CourseDao {

    List<Course> courses = new ArrayList<Course>();

    public InMemoryCourseDao() {
        courses.add(new Course(1,1,1,"C#","csharpCourseImagePath.jpg",1000,80));
        courses.add(new Course(2,1,1,"Java","javaCourseImagePath.jpg",1000,70));
        courses.add(new Course(3,1,2,"C++","cplusplusCourseImagePath.jpg",800,65));
        courses.add(new Course(4,1,2,"Angular","angularCourseImagePath.jpg",600,45));
        courses.add(new Course(5,1,2,"JScript","javascriptCourseImagePath.jpg",700,100));
    }

    @Override
    public void add(Course course) {
        courses.add(course);
    }

    @Override
    public void update(Course course) {

    }

    @Override
    public void delete(Course course) {
        courses.remove(course);
    }

    @Override
    public List<Course> getAll() {
        return courses;
    }
}
