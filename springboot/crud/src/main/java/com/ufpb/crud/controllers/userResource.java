package com.ufpb.crud.controllers;

import com.ufpb.crud.entities.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userResource {

    @RequestMapping(value = "/users")
    public ResponseEntity<User> findAll(){
        User u = new User((long) 1, "João", "joao@gmail.com", "99999", "12345");
        return ResponseEntity.ok().body(u);
    }
}
