package com.teacher.entity;

import java.io.Serializable;

/**
 * (DeadStaff)实体类
 *
 * @author makejava
 * @since 2020-08-27 14:59:58
 */
public class DeadStaff implements Serializable {
    private static final long serialVersionUID = -61436149911123084L;

    private Integer staffNumber;

    private String homeAddress;

    private String relationName;

    private String idNumber;

    private String phong;

    private Object subsidy;

    private Object subsidyTime;

    private String specificContent;


    public Integer getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(Integer staffNumber) {
        this.staffNumber = staffNumber;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getRelationName() {
        return relationName;
    }

    public void setRelationName(String relationName) {
        this.relationName = relationName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhong() {
        return phong;
    }

    public void setPhong(String phong) {
        this.phong = phong;
    }

    public Object getSubsidy() {
        return subsidy;
    }

    public void setSubsidy(Object subsidy) {
        this.subsidy = subsidy;
    }

    public Object getSubsidyTime() {
        return subsidyTime;
    }

    public void setSubsidyTime(Object subsidyTime) {
        this.subsidyTime = subsidyTime;
    }

    public String getSpecificContent() {
        return specificContent;
    }

    public void setSpecificContent(String specificContent) {
        this.specificContent = specificContent;
    }

}