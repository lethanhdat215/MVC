package com.example.restfulapi.service;

import com.example.restfulapi.dto.DTO;
import com.example.restfulapi.model.Blog;

import java.util.List;

public interface BlogService extends IGeneralService<Blog>{
    DTO save(DTO dto);
    Iterable<Blog> findByCategoryId(Long id);


}
