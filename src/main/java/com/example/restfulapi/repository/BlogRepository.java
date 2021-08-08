package com.example.restfulapi.repository;

import com.example.restfulapi.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog,Long> {
    Iterable<Blog> findByCategoryId(Long categoryId);

}
