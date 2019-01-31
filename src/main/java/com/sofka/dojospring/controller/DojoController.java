package com.sofka.dojospring.controller;

import com.sofka.dojospring.model.User;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DojoController{

    @GetMapping("hola/{id}")
    public User getHolaMundo(@PathVariable("name") String name){

        return new User(name, "telephone");
    }
}