package business;

import dataAccess.CategoryDao;
import entities.Category;

import java.util.List;
import core.logging.ILogger;

public class CategoryManager implements CategoryService{
    private CategoryDao categoryDao;
    private ILogger[] loggers;

    public CategoryManager(CategoryDao categoryDao, ILogger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers=loggers;
    }

    @Override
    public void add(Category category) throws Exception {

        boolean isExists = categoryDao.getAll().stream().anyMatch(c->c.getCategoryName()==category.getCategoryName());

        if (!isExists){
            this.categoryDao.add(category);

            for (ILogger logger: loggers) {
                logger.log(category.getCategoryName());
            }
        }
        else
        {
            throw  new Exception("HATA! Aynı isim ile yeni kategori ekleyemezsiniz.");
        }
    }

    @Override
    public void delete(Category category) {
        this.categoryDao.delete(category);
    }

    @Override
    public void update(Category category) {

    }

    @Override
    public List<Category> getAll() {
        return this.categoryDao.getAll();
    }
}
