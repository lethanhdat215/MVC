package Model.service;

import Model.Dao.BlogDAO;
import Model.Dao.CategoryDAO;
import Model.entity.Blog;
import Model.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryService implements  IService <Category,Integer>{
    @Autowired
    private CategoryDAO categoryDAO;

    public List<Category> finAll() {
        return categoryDAO.finAll();
    }

    public boolean save(Category category) {
        return categoryDAO.save(category);
    }

    public boolean merge(Category category) {
        return categoryDAO.merge(category);
    }

    public boolean delete(Integer categoryId) {
        return categoryDAO.delete(categoryId);
    }

    public Category findById(Integer categoryId) {
        return categoryDAO.findById(categoryId);
    }
}
