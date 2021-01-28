package com.claudiamacea.entities.embedded;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

    private String str;

    private int no;

    private String city;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getNo() {
        return no;
    }

    //here does not work @Column because is embedded
    public void setNo(int no) {
        this.no = no;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
