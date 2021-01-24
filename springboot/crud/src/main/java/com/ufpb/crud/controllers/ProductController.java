package com.ufpb.crud.controllers;

import java.util.List;

import com.ufpb.crud.entities.Product;
import com.ufpb.crud.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/products")
public class ProductController {
    
    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<Product>> findAllProducts(){
        List<Product> products = service.findAllProducts();
        return ResponseEntity.ok().body(products);
    }

    @GetMapping(value = "/{id}")    
    public ResponseEntity<Product> findProductById(@PathVariable Long id){
        Product product = service.findProductById(id);
        return ResponseEntity.ok().body(product);
    }
}
