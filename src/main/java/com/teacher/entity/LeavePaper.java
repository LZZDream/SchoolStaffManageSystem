package com.teacher.entity;

import java.io.Serializable;

/**
 * (LeavePaper)实体类
 *
 * @author makejava
 * @since 2020-08-27 15:00:01
 */
public class LeavePaper implements Serializable {
    private static final long serialVersionUID = 812609850087236783L;

    private Integer id;

    private Integer staffNumber;

    private Object startDate;

    private Object endDate;

    private Integer personnelDepCheck;

    private Integer academyCheck;

    private Integer collegeCheck;

    private Object startTime;

    private Object endTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(Integer staffNumber) {
        this.staffNumber = staffNumber;
    }

    public Object getStartDate() {
        return startDate;
    }

    public void setStartDate(Object startDate) {
        this.startDate = startDate;
    }

    public Object getEndDate() {
        return endDate;
    }

    public void setEndDate(Object endDate) {
        this.endDate = endDate;
    }

    public Integer getPersonnelDepCheck() {
        return personnelDepCheck;
    }

    public void setPersonnelDepCheck(Integer personnelDepCheck) {
        this.personnelDepCheck = personnelDepCheck;
    }

    public Integer getAcademyCheck() {
        return academyCheck;
    }

    public void setAcademyCheck(Integer academyCheck) {
        this.academyCheck = academyCheck;
    }

    public Integer getCollegeCheck() {
        return collegeCheck;
    }

    public void setCollegeCheck(Integer collegeCheck) {
        this.collegeCheck = collegeCheck;
    }

    public Object getStartTime() {
        return startTime;
    }

    public void setStartTime(Object startTime) {
        this.startTime = startTime;
    }

    public Object getEndTime() {
        return endTime;
    }

    public void setEndTime(Object endTime) {
        this.endTime = endTime;
    }

}