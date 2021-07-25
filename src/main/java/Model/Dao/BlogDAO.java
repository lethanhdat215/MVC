package Model.Dao;

import Model.entity.Blog;
import java.util.List;

public interface BlogDAO {
    public List<Blog> finAll();
    public boolean save(Blog blog);
    public boolean merge(Blog blog);
    public boolean delete(int blogId);
    public Blog findById (int blogId);

}
