package com.ufpb.crud.controllers;

import java.util.List;

import com.ufpb.crud.entities.User;
import com.ufpb.crud.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired //injeção de dependência
    private UserService service;

    @GetMapping
    public ResponseEntity<List<User>> findAllUsers(){
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findUserById(@PathVariable Long id){
        User user = service.findUserById(id);
        return ResponseEntity.ok().body(user);
    }
}
