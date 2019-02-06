package com.example.demo.proyecto.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.bson.types.ObjectId;

@Document
public class User {

    @Id
    private ObjectId _id;
    private String name;
    private String telephone;


    public User(){

    }


    public User(ObjectId _id, String name, String telephone) {
        this._id = _id;
        this.name = name;
        this.telephone = telephone;
    }


    public String get_id() { return _id.toHexString(); }


    public void setId(ObjectId   id) {
        this._id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getTelephone() {
        return telephone;
    }


    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

}