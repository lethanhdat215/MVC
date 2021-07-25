package Model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Blog")
public class Blog {
    @Id
    @Column(name = "id")
    private int blogId;
    @Column(name = "name")
    private String blogName;
    @Column(name = "context")
    private String blogText;

    public Blog(int blogId, String blogName, String blogText) {
        this.blogId = blogId;
        this.blogName = blogName;
        this.blogText = blogText;
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
}
