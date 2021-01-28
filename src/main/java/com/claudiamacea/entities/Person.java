package com.claudiamacea.entities;

import javax.persistence.*;

@Entity
//se foloseste @Acccess atunci cand adnotarea @Id este pusa si pe metoda si pe camp pt Reflection
//@Access(AccessType.PROPERTY)
public class Person {

    //Field access with reflection
//    @Id
//    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    //Property access with reflection
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
