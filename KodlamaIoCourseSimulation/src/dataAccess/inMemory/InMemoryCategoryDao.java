package dataAccess.inMemory;

import dataAccess.CategoryDao;
import entities.Category;

import java.util.ArrayList;
import java.util.List;

public class InMemoryCategoryDao implements CategoryDao {

    List<Category> categories = new ArrayList<Category>();

    public InMemoryCategoryDao() {
        categories.add(new Category(1,"Backend Programlama"));
        categories.add(new Category(2,"Frontend Programlama"));
    }

    @Override
    public void add(Category category) {
        categories.add(category);
    }

    @Override
    public void update(Category category) {

    }

    @Override
    public void delete(Category category) {
        categories.remove(category);
    }

    @Override
    public List<Category> getAll() {
        return categories;
    }
}
