package com.example.demo.proyecto.repositorio;//com.techprimers.mongodb.springbootmongodbexample.repository;

import com.example.demo.proyecto.model.*;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer> {
}