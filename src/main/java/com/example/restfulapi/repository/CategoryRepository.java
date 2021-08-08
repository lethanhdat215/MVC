package com.example.restfulapi.repository;

import com.example.restfulapi.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
    Category findOneByCode(String code);

}
