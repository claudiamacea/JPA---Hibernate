package com.claudiamacea.entities.pk;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class BuildingPK implements Serializable {

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
