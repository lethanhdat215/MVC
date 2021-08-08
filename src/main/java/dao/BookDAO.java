package dao;

import java.util.List;

import entity.Book;
public interface BookDAO {
    public List<Book> findAll();
    public boolean save(Book book);
    public boolean merge(Book book);
    public boolean delete(int bookId);
    public Book findById(int bookId);

}
