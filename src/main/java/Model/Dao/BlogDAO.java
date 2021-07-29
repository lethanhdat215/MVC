package Model.Dao;

import Model.entity.Blog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import java.lang.Long;


//import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.*;


@Repository
public class BlogDAO implements DAO<Blog, Integer> {
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

    public boolean delete(Integer blogId) {
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


    public Blog findById(Integer blogId) {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        Blog blog = (Blog) session.createQuery("from Blog where blogId = :blogId").setParameter("blogId", blogId).uniqueResult();
        session.getTransaction().commit();
        session.close();
        return blog;
    }

   /* public Long countTotalRecords() {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        Query query = session.createQuery("select count(b.blogId) from Blog b");
        System.out.println(query);
  *//*   int result = (int) query.uniqueResult();*//*
        List<Blog> blogList = new ArrayList<Blog>();
        System.out.println(blogList);
        blogList= (List<Blog>)query.uniqueResult();
        System.out.println(blogList);
        session.getTransaction().commit();
        session.close();
        return  blogList.size();
    }*/

    public int countTotalRecords() { // lay tong so ban ghi
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        Query query = session.createQuery("select count(b.blogId) from Blog b");
        int result =(Integer) query.uniqueResult().hashCode(); //((Number)query.uniqueResult()).intValue();
        session.getTransaction().commit();
        session.close();
        return result;
    }

    public List<Blog> getListBlog(Integer position, Integer limit) { // lay ban ghi bat dau tu vi tri position và lay
        Session session = sessionFactory.openSession();//so ban ghi la limit
        session.getTransaction().begin();
        List<Blog> listBlog = session.createQuery("from Blog").setFirstResult(position).setMaxResults(limit).list();
        session.getTransaction().commit();
        session.close();
        return listBlog;
    }
}

