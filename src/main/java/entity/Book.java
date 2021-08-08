package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Book")
public class Book {
    @Id
    @Column(name = "id")
    private int bookId;

    @Column(name = "name")
    private String bookName;

    @Column(name = "quantity")
    private int quantity;

    @Column(name ="code")
    private int maCode;

    public Book(int bookId, String bookName, int quantity, int maCode) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.quantity = quantity;
        this.maCode = maCode;
    }

    public Book() {

    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getMaCode() {
        return maCode;
    }

    public void setMaCode(int maCode) {
        this.maCode = maCode;
    }
}
