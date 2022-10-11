package dataAccess;

import dataAccess.inMemory.InMemoryInstructorDao;
import entities.Instructor;

import java.util.List;

public class JdbcInstructorDao implements InstructorDao{
    InMemoryInstructorDao inMemoryInstructorDao;

    public JdbcInstructorDao(InMemoryInstructorDao inMemoryInstructorDao) {
        this.inMemoryInstructorDao = inMemoryInstructorDao;
    }

    @Override
    public void add(Instructor instructor) {
        this.inMemoryInstructorDao.add(instructor);
        System.out.println("JDBC kullanılarak eğitmen eklendi : " + instructor.getInstructorName());
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("JDBC kullanılarak eğitmen güncellendi : " + instructor.getInstructorName());
    }

    @Override
    public void delete(Instructor instructor) {
        this.inMemoryInstructorDao.delete(instructor);
        System.out.println("JDBC kullanılarak eğitmen silindi : " + instructor.getInstructorName());
    }

    @Override
    public List<Instructor> getAll() {
        return this.inMemoryInstructorDao.getAll();
    }
}
