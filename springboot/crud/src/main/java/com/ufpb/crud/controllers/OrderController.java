package com.ufpb.crud.controllers;

import java.util.List;

import com.ufpb.crud.entities.Order;
import com.ufpb.crud.services.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

    @Autowired //injeção de dependência
    private OrderService service;

    @GetMapping
    public ResponseEntity<List<Order>> findAllOrders(){
        List<Order> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findOrderById(@PathVariable Long id){
        Order order = service.findOrderById(id);
        return ResponseEntity.ok().body(order);
    }
}
