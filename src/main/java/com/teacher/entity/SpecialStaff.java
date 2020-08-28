package com.teacher.entity;

import java.io.Serializable;

/**
 * (SpecialStaff)实体类
 *
 * @author makejava
 * @since 2020-08-27 15:00:06
 */
public class SpecialStaff implements Serializable {
    private static final long serialVersionUID = 504074109595961574L;

    private Integer staffNumber;

    private Integer staffType;


    public Integer getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(Integer staffNumber) {
        this.staffNumber = staffNumber;
    }

    public Integer getStaffType() {
        return staffType;
    }

    public void setStaffType(Integer staffType) {
        this.staffType = staffType;
    }

}