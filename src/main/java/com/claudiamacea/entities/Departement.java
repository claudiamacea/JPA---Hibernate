package com.claudiamacea.entities;

import com.claudiamacea.entities.pk.DepartementPK;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(DepartementPK.class)
public class Departement {

    @Id
    private String code;

    @Id
    @Column (name = "number")
    private int no;

    private String name;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
