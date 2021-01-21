package com.ufpb.crud.repositories;

import com.ufpb.crud.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

//Interface extendendo JPA Repository<Tipo, Chave>
public interface UserRepository extends JpaRepository<User, Long> {
    
}
