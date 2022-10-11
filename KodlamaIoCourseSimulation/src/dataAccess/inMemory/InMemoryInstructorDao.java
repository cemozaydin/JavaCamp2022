package dataAccess.inMemory;

import dataAccess.InstructorDao;
import entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class InMemoryInstructorDao implements InstructorDao {
    List<Instructor> instructors= new ArrayList<Instructor>();

    public InMemoryInstructorDao() {
        instructors.add(new Instructor(1,"Engin Demiroğ"));
        instructors.add(new Instructor(2,"Kerem Varış"));
        instructors.add(new Instructor(3,"Murat Kurtboğan"));
    }

    public void add(Instructor instructor)
    {
        instructors.add(instructor);
        //this.instructors.forEach(i-> System.out.println(i.getInstructorId() + " - " + i.getInstructorName()));
    }

    @Override
    public void update(Instructor instructor) {

    }

    @Override
    public void delete(Instructor instructor) {
            instructors.remove(instructor);
    }

    @Override
    public List<Instructor> getAll() {
        return instructors;
    }
}
