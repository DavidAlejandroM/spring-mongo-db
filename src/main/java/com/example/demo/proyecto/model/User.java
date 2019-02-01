package com.example.demo.proyecto.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {

    @Id
    private ObjectId _id;
    private String name;
    private String telephone;


    public User(ObjectId _id, String name, String telephone) {
        this._id = _id;
        this.name = name;
        this.telephone = telephone;
    }

    public String get_Id() {
        return this._id.toHexString();
    }

    public void setId(ObjectId :_id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefono() {
        return telephone;
    }

    public void setTelefono(String telephone) {
        this.telephone = telephone;
    }

}