package com.ufpb.crud.config;

import java.time.Instant;
import java.util.Arrays;

import com.ufpb.crud.entities.*;
import com.ufpb.crud.entities.enums.OrderStatus;
import com.ufpb.crud.repositories.CategoryRepository;
import com.ufpb.crud.repositories.OrderRepository;
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

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        instanceOnDB();
    }

    public void instanceOnDB(){
        User u = new User(null, "Marcio", "mncosta99@gmail.com", "8888-8888", "123");
        User u2 = new User(null, "Maria", "maria@gmail.com", "8888-8888", "123");
        
        Order o = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u);
        Order o2 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.DELIVERED, u);
        Order o3 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.WAITING_PAYMENT, u2);

        Category c = new Category(null, "Eletrodoméstico");
        Category c2 = new Category(null, "Videogame");
        
        userRepository.saveAll(Arrays.asList(u, u2));
        orderRepository.saveAll(Arrays.asList(o, o2, o3));
        categoryRepository.saveAll(Arrays.asList(c, c2));
    }

}
