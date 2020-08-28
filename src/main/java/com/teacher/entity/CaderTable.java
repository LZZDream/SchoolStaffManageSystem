package com.teacher.entity;

import java.io.Serializable;

/**
 * (CaderTable)实体类
 *
 * @author makejava
 * @since 2020-08-27 14:59:56
 */
public class CaderTable implements Serializable {
    private static final long serialVersionUID = 422404963050711524L;

    private Integer staffNumber;

    private String degree;

    private String level;


    public Integer getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(Integer staffNumber) {
        this.staffNumber = staffNumber;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

}