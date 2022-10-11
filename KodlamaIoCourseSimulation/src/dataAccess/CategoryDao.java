package dataAccess;

import entities.Category;

import java.util.List;

public interface CategoryDao {
    void add(Category category);
    void update(Category category);
    void delete(Category category);
    List<Category> getAll();
}
