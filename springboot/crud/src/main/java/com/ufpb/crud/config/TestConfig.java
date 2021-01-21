package com.ufpb.crud.config;

import java.util.Arrays;

import com.ufpb.crud.entities.User;
import com.ufpb.crud.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration //especificando que é uma classe de configuração
@Profile("test") //definindo perfil como teste (que foi implementado no aplication.properties)
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        saveAllUsers();
    }

    public void saveAllUsers(){
        User u = new User(null, "Marcio", "mncosta99@gmail.com", "8888-8888", "123");
        User u2 = new User(null, "Maria", "maria@gmail.com", "8888-8888", "123");
        
        userRepository.saveAll(Arrays.asList(u, u2));
    }

}
