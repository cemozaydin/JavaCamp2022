package dataAccess;

import dataAccess.inMemory.InMemoryInstructorDao;
import entities.Instructor;

import java.util.List;

public class NHibernateInstructorDao implements InstructorDao{
    InMemoryInstructorDao inMemoryInstructorDao;

    public NHibernateInstructorDao(InMemoryInstructorDao inMemoryInstructorDao) {
        this.inMemoryInstructorDao = inMemoryInstructorDao;
    }

    @Override
    public void add(Instructor instructor) {
        this.inMemoryInstructorDao.add(instructor);
        System.out.println("NHibernate kullanılarak eğitmen eklendi : " + instructor.getInstructorName());
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("NHibernate kullanılarak eğitmen güncellendi : " + instructor.getInstructorName());
    }

    @Override
    public void delete(Instructor instructor) {
        this.inMemoryInstructorDao.delete(instructor);
        System.out.println("NHibernate kullanılarak eğitmen silindi : " + instructor.getInstructorName());
    }

    @Override
    public List<Instructor> getAll() {
        System.out.println("(NHibernate kullanılarak eğitmenler listelendi)");
        return this.inMemoryInstructorDao.getAll();
    }
}
