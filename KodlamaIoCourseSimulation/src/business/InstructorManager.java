package business;

import entities.Instructor;
import dataAccess.InstructorDao;

import java.util.List;

public class InstructorManager implements InstructorService{
    private InstructorDao instructorDao;

    public InstructorManager(InstructorDao instructorDao) {
        this.instructorDao = instructorDao;
    }

    @Override
    public void add(Instructor instructor) {
        this.instructorDao.add(instructor);
    }

    @Override
    public void delete(Instructor instructor) {
        this.instructorDao.delete(instructor);
    }

    @Override
    public void update(Instructor instructor) {

    }

    @Override
    public List<Instructor> getAll() {
        return instructorDao.getAll();
    }
}
