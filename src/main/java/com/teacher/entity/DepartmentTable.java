package com.teacher.entity;

import java.io.Serializable;

/**
 * (DepartmentTable)实体类
 *
 * @author makejava
 * @since 2020-08-27 14:59:59
 */
public class DepartmentTable implements Serializable {
    private static final long serialVersionUID = 293544251749329574L;

    private Integer id;

    private String name;

    private String staffNumber;

    private String introduction;

    private String adress;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(String staffNumber) {
        this.staffNumber = staffNumber;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

}