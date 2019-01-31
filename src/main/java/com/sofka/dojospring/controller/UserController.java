package com.sofka.dojospring.controller;

import com.sofka.dojospring.model.User;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class UserController{

    @GetMapping("user")
    public User getHolaMundo(){

        return new User("hola", "324324");
    }
    
    @PostMapping("user")
    public User postUser(){
        return new User("asdf", "324324");
    }
}