package com.ufpb.crud.repositories;

import com.ufpb.crud.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

//interface extendendo JPA Repository<Tipo, Chave>
//não precisa do @Repository porque está herdando do JPA Repository

public interface UserRepository extends JpaRepository<User, Long> {
    
}
