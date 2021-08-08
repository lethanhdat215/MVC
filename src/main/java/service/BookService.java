package service;


import entity.Book;

import java.util.List;

public interface BookService {
    public List<Book> findAll();
    public boolean save(Book book);
    public boolean merge(Book book);
    public boolean delete(int bookId);
    public Book findById(int bookId);
//
}
