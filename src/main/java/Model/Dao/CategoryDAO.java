package Model.Dao;

import Model.entity.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class CategoryDAO implements DAO<Category,Integer> {
    @Autowired
    private SessionFactory sessionFactory;

    public List<Category> finAll() {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        List<Category> listCategory = session.createQuery("from Category ").list();
        session.getTransaction().commit();
        session.close();
        return listCategory;
    }

    public boolean save(Category category) {
        boolean check = false;
        Session session = null;
        try {
            session = sessionFactory.openSession();
            session.getTransaction().begin();
            session.save(category);
            session.getTransaction().commit();
            check = true;
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return check;
    }

    public boolean merge(Category category) {
        boolean check = false;
        Session session = null;
        try {
            session = sessionFactory.openSession();
            session.getTransaction().begin();
            session.merge(category);
            session.getTransaction().commit();
            check = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return check;
    }



    public boolean delete(Integer categoryId) {
        Session session = null;
        boolean check = false;
        try {
            session = sessionFactory.openSession();
            session.getTransaction().begin();
            Category categoryDelete = findById(categoryId);
            if (categoryDelete != null) {
                session.delete(categoryDelete);
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

    public Category findById(Integer categoryId) {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        Category category = (Category) session.createQuery("from Category where categoryId = :categoryId").setParameter("categoryId", categoryId).uniqueResult();
        session.getTransaction().commit();
        session.close();
        return category;
    }



    public List<Category> finAllByName(String nameBlog) {

        return null;
    }

    public List<Category> finByCate(Category category) {
        return null;
    }

    public List<Category> getListBlog(Integer position, Integer limit) {
        return null;
    }


}
