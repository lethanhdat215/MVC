package service;

import dao.BookDAO;
import entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImp implements BookService{
    @Autowired
    private BookDAO bookDAO;
    public List<Book> findAll() {
        return bookDAO.findAll();
    }

    public boolean save(Book book) {
        return bookDAO.save(book);
    }

    public boolean merge(Book book) {
        return bookDAO.merge(book);
    }

    public boolean delete(int bookId) {
        return bookDAO.delete(bookId);
    }

    public Book findById(int bookId) {
        return bookDAO.findById(bookId);
    }

}
