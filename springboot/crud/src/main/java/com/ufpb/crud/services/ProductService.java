package com.ufpb.crud.services;

import java.util.List;
import java.util.Optional;

import com.ufpb.crud.entities.Product;
import com.ufpb.crud.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository repository;

    public List<Product> findAllProducts(){
        return repository.findAll();
    }

    public Product findProductById(Long id){
        Optional<Product> product = repository.findById(id);
        return product.get();
    }
}
