package dao;

import entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDAOImp implements BookDAO{
    @Autowired
    private SessionFactory sessionFactory;

    public List<Book> findAll() {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        List<Book> listBook = session.createQuery("from Book ").list();
        session.getTransaction().commit();
        session.close();
        return listBook;
    }

    public boolean save(Book book) {
        boolean check = false;
        Session session = null;
        try {
            session = sessionFactory.openSession();
            session.getTransaction().begin();
            session.save(book);
            session.getTransaction().commit();
            check = true;
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return check;
    }


    public boolean merge(Book book) {
        boolean check = false;
        Session session = null;
        try {
            session = sessionFactory.openSession();
            session.getTransaction().begin();
            session.merge(book);
            session.getTransaction().commit();
            check = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return check;
    }


    public boolean delete(int bookId) {
        Session session = null;
        boolean check = false;
        try {
            session = sessionFactory.openSession();
            session.getTransaction().begin();
            Book bookDelete = findById(bookId);
            if (bookDelete != null) {
                session.delete(bookDelete);
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

    public Book findById(int bookId) {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        Book book = (Book) session.createQuery("from Book where bookId = :bookId").setParameter("bookId", bookId).uniqueResult();
        session.getTransaction().commit();
        session.close();
        return book ;
    }





}
