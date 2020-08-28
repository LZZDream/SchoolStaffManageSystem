package com.teacher.entity;

import java.io.Serializable;

/**
 * (CheckTable)实体类
 *
 * @author makejava
 * @since 2020-08-27 14:59:57
 */
public class CheckTable implements Serializable {
    private static final long serialVersionUID = -10953224693113254L;

    private Integer staffNumber;

    private Integer year;

    private String department;

    private Integer thesisNum;

    private Object sex;

    private String idNumber;

    private Integer departmentCheck;

    private Integer bossCheck;

    private Integer partyCheck;

    private Integer collegeCheck;


    public Integer getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(Integer staffNumber) {
        this.staffNumber = staffNumber;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getThesisNum() {
        return thesisNum;
    }

    public void setThesisNum(Integer thesisNum) {
        this.thesisNum = thesisNum;
    }

    public Object getSex() {
        return sex;
    }

    public void setSex(Object sex) {
        this.sex = sex;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Integer getDepartmentCheck() {
        return departmentCheck;
    }

    public void setDepartmentCheck(Integer departmentCheck) {
        this.departmentCheck = departmentCheck;
    }

    public Integer getBossCheck() {
        return bossCheck;
    }

    public void setBossCheck(Integer bossCheck) {
        this.bossCheck = bossCheck;
    }

    public Integer getPartyCheck() {
        return partyCheck;
    }

    public void setPartyCheck(Integer partyCheck) {
        this.partyCheck = partyCheck;
    }

    public Integer getCollegeCheck() {
        return collegeCheck;
    }

    public void setCollegeCheck(Integer collegeCheck) {
        this.collegeCheck = collegeCheck;
    }

}