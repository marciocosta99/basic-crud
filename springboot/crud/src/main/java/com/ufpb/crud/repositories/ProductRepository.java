package com.ufpb.crud.repositories;

import com.ufpb.crud.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
