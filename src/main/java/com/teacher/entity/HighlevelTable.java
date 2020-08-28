package com.teacher.entity;

import java.io.Serializable;

/**
 * (HighlevelTable)实体类
 *
 * @author makejava
 * @since 2020-08-27 15:00:00
 */
public class HighlevelTable implements Serializable {
    private static final long serialVersionUID = 432205217683090661L;

    private Integer staffNumber;

    private String adacemy;

    private String major;

    private String homeAddress;


    public Integer getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(Integer staffNumber) {
        this.staffNumber = staffNumber;
    }

    public String getAdacemy() {
        return adacemy;
    }

    public void setAdacemy(String adacemy) {
        this.adacemy = adacemy;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

}