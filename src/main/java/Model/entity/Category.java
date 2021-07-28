package Model.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

@Entity
@Data // thay cho getter setter constructor
@Table(name = "Category")
public class Category {
    @Id
    @Column(name = "categoryId")
    private int categoryId;
    @Column(name = "categoryName")
    private String categoryName;
//    @Column(name = "id")
//    private int blogId;

    @OneToMany(mappedBy = "category")
    private List<Blog> listBlog;

    public Category(int categoryId, String categoryName, int blogId, List<Blog> listBlog) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
//        this.blogId = blogId;

        this.listBlog = listBlog;
    }

    public Category() {

    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

//    public int getBlogId() {
//        return blogId;
//    }
//
//    public void setBlogId(int blogId) {
//        this.blogId = blogId;
//    }

    public List<Blog> getListBlog() {
        return listBlog;
    }

    public void setListBlog(List<Blog> listBlog) {
        this.listBlog = listBlog;
    }
}