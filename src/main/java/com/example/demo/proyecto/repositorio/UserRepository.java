package com.example.demo.proyecto.repositorio;//com.techprimers.mongodb.springbootmongodbexample.repository;

import com.example.demo.proyecto.model.*;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findBy_id(ObjectId _id);
    void deleteBy_id(ObjectId id);
}