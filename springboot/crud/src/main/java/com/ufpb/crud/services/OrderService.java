package com.ufpb.crud.services;

import java.util.List;
import java.util.Optional;

import com.ufpb.crud.entities.Order;
import com.ufpb.crud.repositories.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    
    @Autowired //injeção de dependência
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findOrderById(Long id){
        Optional<Order> order = repository.findById(id);
        return order.get();
    }
}
