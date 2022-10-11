package dataAccess;

import dataAccess.inMemory.InMemoryCategoryDao;
import entities.Category;

import java.util.List;

public class JdbcCategoryDao implements CategoryDao{

    private InMemoryCategoryDao inMemoryCategoryDao;

    public JdbcCategoryDao(InMemoryCategoryDao inMemoryCategoryDao) {
        this.inMemoryCategoryDao = inMemoryCategoryDao;
    }

    @Override
    public void add(Category category) {
        this.inMemoryCategoryDao.add(category);
        System.out.println("JDBC kullanılarak kategori eklendi : " + category.getCategoryName());
    }

    @Override
    public void update(Category category) {
        System.out.println("JDBC kullanılarak kategori güncellendi : " + category.getCategoryName());
    }

    @Override
    public void delete(Category category) {
        this.inMemoryCategoryDao.delete(category);
        System.out.println("JDBC kullanılarak kategori silindi : " + category.getCategoryName());
    }

    @Override
    public List<Category> getAll() {
        return this.inMemoryCategoryDao.getAll();
    }
}
