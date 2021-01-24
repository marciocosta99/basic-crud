package com.ufpb.crud.repositories;

import com.ufpb.crud.entities.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
