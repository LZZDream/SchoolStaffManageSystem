package com.teacher.entity;

import java.io.Serializable;

/**
 * (LevelReview)实体类
 *
 * @author makejava
 * @since 2020-08-27 15:00:01
 */
public class LevelReview implements Serializable {
    private static final long serialVersionUID = 264443511902170668L;

    private Integer year;

    private Integer staffNumber;

    private String academy;

    private Object sex;

    private String idNumber;

    private Integer thesis;

    private Integer departmentCheck;

    private Integer academicCheck;


    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(Integer staffNumber) {
        this.staffNumber = staffNumber;
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
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

    public Integer getThesis() {
        return thesis;
    }

    public void setThesis(Integer thesis) {
        this.thesis = thesis;
    }

    public Integer getDepartmentCheck() {
        return departmentCheck;
    }

    public void setDepartmentCheck(Integer departmentCheck) {
        this.departmentCheck = departmentCheck;
    }

    public Integer getAcademicCheck() {
        return academicCheck;
    }

    public void setAcademicCheck(Integer academicCheck) {
        this.academicCheck = academicCheck;
    }

}