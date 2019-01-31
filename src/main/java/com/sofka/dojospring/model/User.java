package com.sofka.dojospring.model;

/**
 * User
 */

 public class User{

     private String name;
     private String telephone;


     public User(String name, String telephone){
        this.name = name;
        this.telephone = telephone;
     }


     public String getName(){
         return this.name;
     }


     public String getTelephone(){
        return this.telephone;
     }


     public void setName(String name){
        this.name = name;
     }


     public void setTelephone(String telephone){
        this.telephone = telephone;
     }
     
 }