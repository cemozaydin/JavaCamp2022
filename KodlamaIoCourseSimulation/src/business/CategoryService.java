package business;

import entities.Category;

import java.util.List;

public interface CategoryService {
    void add(Category category) throws Exception;
    void delete(Category category);
    void update(Category category);
    List<Category> getAll();
}
