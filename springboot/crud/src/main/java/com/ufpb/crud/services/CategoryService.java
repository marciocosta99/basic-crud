package com.ufpb.crud.services;

import java.util.List;
import java.util.Optional;

import com.ufpb.crud.entities.Category;
import com.ufpb.crud.repositories.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    
    @Autowired //injeção de dependência
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findCategoryById(Long id){
        Optional<Category> category = repository.findById(id);
        return category.get();
    }
}
