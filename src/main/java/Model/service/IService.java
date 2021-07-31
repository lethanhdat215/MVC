package Model.service;

import Model.entity.Blog;
import Model.entity.Category;

import java.util.List;

public interface IService<obj , id> {
    public List<obj> finAll();
    public boolean save(obj obj);
    public boolean merge(obj obj);
    public boolean delete(id id);
    public obj findById(id id);
    public List<obj> finAllByName(String nameBlog);
    public List<obj> finByCate(Category category);
}
