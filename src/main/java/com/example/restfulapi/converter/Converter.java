package com.example.restfulapi.converter;

import com.example.restfulapi.dto.DTO;
import com.example.restfulapi.model.Blog;
import org.springframework.stereotype.Component;

@Component
public class Converter {

    public Blog toBlog(DTO dto) {
        Blog blog =  new Blog();
        blog.setName(dto.getName());
        blog.setText(dto.getText());
        return blog;
    }

    public DTO toDTO(Blog blog) {
        DTO dto  =  new DTO();
        dto.setName(blog.getName());
        dto.setText(blog.getText());
        return dto;
    }
}
