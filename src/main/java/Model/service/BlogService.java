package Model.service;

import Model.Dao.BlogDAO;
import Model.entity.Blog;
import Model.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class BlogService implements IService<Blog,Integer> {
    @Autowired
    private BlogDAO blogDAO;

    public int countTotalRecords(){
        return blogDAO.countTotalRecords();
    }

    public List<Blog> getListBlog(int position, int limit) {
        return blogDAO.getListBlog(position,limit);
    }

    public List<Blog> finAll() {
        return blogDAO.finAll();
    }

    public boolean save(Blog blog) {
        return blogDAO.save(blog);
    }

    public boolean merge(Blog blog) {
        return blogDAO.merge(blog);
    }

    public boolean delete(Integer blogId) {
        return blogDAO.delete(blogId);
    }

    public Blog findById(Integer blogId) {
        return blogDAO.findById(blogId);
    }

    public List<Blog> finAllByName(String nameBlog) {
        return blogDAO.finAllByName(nameBlog);
    }

    public List<Blog> finByCate(Category category) {
        return blogDAO.finByCate(category);
    }


}
