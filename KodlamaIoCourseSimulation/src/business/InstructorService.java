package business;

import entities.Instructor;

import java.util.List;

public interface InstructorService {
    void add(Instructor instructor);
    void delete(Instructor instructor);
    void update(Instructor instructor);
    List<Instructor> getAll();
}
