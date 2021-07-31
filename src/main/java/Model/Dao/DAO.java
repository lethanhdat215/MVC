package Model.Dao;

import Model.entity.Blog;
import Model.entity.Category;

import java.util.List;

public interface DAO<obj,id>{
    public List<obj> finAll();
    public boolean save(obj obj);
    public boolean merge(obj obj);
    public boolean delete(id id);
    public obj findById (id  id);
    public List<obj> finAllByName(String nameBlog);
    public List<obj> finByCate(Category category);
    List<obj> getListBlog(id position, id limit);// position = vi tri bat dau lay //limit = so ban ghi lay



}
