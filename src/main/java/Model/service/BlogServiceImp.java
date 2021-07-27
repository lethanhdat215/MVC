package Model.service;

import Model.Dao.BlogDAOImp;
import Model.entity.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImp implements BlogService {
    @Autowired
    private BlogDAOImp blogDAO;

    public List<Blog> finAll() {
        return blogDAO.finAll();
    }

    public boolean save(Blog blog) {
        return blogDAO.save(blog);
    }

    public boolean merge(Blog blog) {
        return blogDAO.merge(blog);
    }

    public boolean delete(int blogId) {
        return blogDAO.delete(blogId);
    }

    public Blog findByI(int blogId) {
        return blogDAO.findById(blogId);
    }
}
