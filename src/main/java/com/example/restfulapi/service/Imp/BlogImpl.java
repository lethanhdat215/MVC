package com.example.restfulapi.service.Imp;

import com.example.restfulapi.converter.Converter;
import com.example.restfulapi.dto.DTO;
import com.example.restfulapi.model.Blog;
import com.example.restfulapi.model.Category;
import com.example.restfulapi.repository.BlogRepository;
import com.example.restfulapi.repository.CategoryRepository;
import com.example.restfulapi.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(rollbackFor = Exception.class)
public class BlogImpl implements BlogService {
    @Autowired
    private BlogRepository blogRepository;// tương tác với DB

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private Converter converter;

    @Override
    public Iterable<Blog> findAll() {
        return blogRepository.findAll();// trả về một Iterable blog cos trong DB
    }// hỗ trợ th:each trong thymeleaf

    @Override
    public Optional<Blog> findById(Long id) {
        return blogRepository.findById(id);
    }// check lại xem có tồn tại giá trị này ko isPresent()= boolean(true), get() trả lại Blog với id được nhận

    @Override
    public Blog save(Blog blog) {
        return blogRepository.save(blog);
    }// lưu Blog

    @Override
    public void remove(Long id) {
        blogRepository.deleteById(id);
    }// xóa


    @Override
    public DTO save(DTO dto) {
        Category category = categoryRepository.findOneByCode(dto.getCategoryCode());
        Blog blog = converter.toBlog(dto);
        blog.setCategory(category);
        blog = blogRepository.save(blog);
        return converter.toDTO(blog);
    }

    @Override
    public Iterable<Blog> findByCategoryId(Long id) {
        return blogRepository.findByCategoryId(id);
    }


}
