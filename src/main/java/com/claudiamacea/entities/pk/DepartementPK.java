package com.claudiamacea.entities.pk;


import java.io.Serializable;

public class DepartementPK implements Serializable {

    private String code;

    private int no;

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
}
