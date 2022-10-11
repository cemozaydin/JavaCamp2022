package dataAccess;

import dataAccess.inMemory.InMemoryCategoryDao;
import entities.Category;
import entities.Instructor;

import java.util.List;

public class NHibernateCategoryDao implements CategoryDao{

    private InMemoryCategoryDao inMemoryCategoryDao;

    public NHibernateCategoryDao(InMemoryCategoryDao inMemoryCategoryDao) {
        this.inMemoryCategoryDao = inMemoryCategoryDao;
    }

    @Override
    public void add(Category category) {
        this.inMemoryCategoryDao.add(category);
        System.out.println("NHibernate kullanılarak kategori eklendi : " + category.getCategoryName());
    }

    @Override
    public void update(Category category) {
        System.out.println("NHibernate kullanılarak kategori güncellendi : " + category.getCategoryName());
    }

    @Override
    public void delete(Category category) {
        this.inMemoryCategoryDao.delete(category);
        System.out.println("NHibernate kullanılarak kategori silindi : " + category.getCategoryName());
    }

    @Override
    public List<Category> getAll() {
        return this.inMemoryCategoryDao.getAll();
    }
}
