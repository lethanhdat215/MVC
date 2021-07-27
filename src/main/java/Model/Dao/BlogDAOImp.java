package Model.Dao;

import Model.entity.Blog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BlogDAOImp implements BlogDAO{
    @Autowired
    private SessionFactory sessionFactory;

    public List<Blog> finAll() {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        List<Blog> listBlog = session.createQuery("from Blog ").list();
        session.getTransaction().commit();
        session.close();
        return listBlog;
    }

    public boolean save(Blog blog) {
        boolean check = false;
        Session session = null;
        try {
            session = sessionFactory.openSession();
            session.getTransaction().begin();
            session.save(blog);
            session.getTransaction().commit();
            check = true;
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return check;
    }

    public boolean merge(Blog blog) {
        boolean check = false;
        Session session = null;
        try {
            session = sessionFactory.openSession();
            session.getTransaction().begin();
            session.merge(blog);
            session.getTransaction().commit();
            check = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return check;
    }

    public boolean delete(int blogId) {
        Session session = null;
        boolean check = false;
        try {
            session = sessionFactory.openSession();
            session.getTransaction().begin();
            Blog blogDelete = findById(blogId);
            if (blogDelete != null) {
                session.delete(blogDelete);
            }
            session.getTransaction().commit();
            check = true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return check;
    }

    public Blog findById(int blogId) {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        Blog blog = (Blog) session.createQuery("from Blog where blogId = :blogId").setParameter("blogId", blogId).uniqueResult();
        session.getTransaction().commit();
        session.close();
        return blog;
    }
}
