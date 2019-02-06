package com.example.demo.proyecto.resource;//com.techprimers.mongodb.springbootmongodbexample.resource;

import com.example.demo.proyecto.model.*;
import com.example.demo.proyecto.repositorio.*;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/user")
public class UserResource {


    private UserRepository userRepository;


    public UserResource(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @GetMapping("/")
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User getAll(@PathVariable("id") ObjectId id) {
        return userRepository.findBy_id(id);
    }


    @PostMapping("/")
    public User postUser(@RequestBody User user) {
        return userRepository.save(user);
    }


    @PutMapping("/{id}")
    public User putUser(@PathVariable("id") ObjectId id, @RequestBody User user){
        user.setId(id);
        return userRepository.save(user);
    }


    @DeleteMapping("/{id}")
    public User deleteUser(@PathVariable("id") ObjectId id){
        userRepository.deleteBy_id(id);
        return userRepository.findBy_id(id);
    }
}