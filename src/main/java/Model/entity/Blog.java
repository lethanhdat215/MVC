package Model.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Entity
@Data // thay cho getter setter constructor
@Table(name = "Blog")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator")
    @SequenceGenerator(name = "generator", sequenceName = "SEQUENCE_BLOG", allocationSize = 1)
    @Column(name = "id")
    private int blogId;

    @Column(name = "name")
    private String blogName;

    @Column(name = "context")
    private String blogText;

    @Column(name = "created")
    private Timestamp blogDate;
//    @Column(name = "categoryId")
//    private int categoryId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "categoryId", referencedColumnName = "categoryId" )
    private Category category;

    public Blog(int blogId, String blogName, String blogText, Timestamp blogDate, int categoryId, Category category) {
        this.blogId = blogId;
        this.blogName = blogName;
        this.blogText = blogText;
        this.blogDate = blogDate;
//        this.categoryId = categoryId;

        this.category = category;
    }

    public Blog() {

    }

    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public String getBlogText() {
        return blogText;
    }

    public void setBlogText(String blogText) {
        this.blogText = blogText;
    }

    public Timestamp getBlogDate() {
        return blogDate;
    }

    public void setBlogDate(Timestamp blogDate) {
        this.blogDate = blogDate;
    }

//    public int getCategoryId() {
//        return categoryId;
//    }
//
//    public void setCategoryId(int categoryId) {
//        this.categoryId = categoryId;
//    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}