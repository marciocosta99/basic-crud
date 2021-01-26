package com.ufpb.crud.services;

import java.util.List;
import java.util.Optional;

import com.ufpb.crud.entities.User;
import com.ufpb.crud.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired //injeção de dependência
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findUserById(Long id){
        Optional<User> user = repository.findById(id);
        return user.get();
    }

    public User insert(User obj){
        return repository.save(obj);
    }
}
