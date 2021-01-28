package com.claudiamacea.entities;


import com.claudiamacea.entities.embedded.Address;

import javax.persistence.*;

@Entity
public class Company {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    //this is working for java 8.0 or greater and jpa 2.2 or greater
    @AttributeOverride(name = "no", column = @Column (name = "number"))
    @AttributeOverride(name = "str", column = @Column (name = "street"))
    @Embedded
    private Address address;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
