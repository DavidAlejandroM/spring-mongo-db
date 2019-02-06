package com.example.demo.proyecto.resource;//com.techprimers.mongodb.springbootmongodbexample.resource;

import com.example.demo.proyecto.model.*;
import com.example.demo.proyecto.repositorio.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/user")
public class UserResource {

    private UserRepository userRepository;

    public UserResource(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/all")
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @PostMapping("/")
    public User postUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}