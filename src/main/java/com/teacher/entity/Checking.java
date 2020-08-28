package com.teacher.entity;

import java.io.Serializable;

/**
 * (Checking)实体类
 *
 * @author makejava
 * @since 2020-08-27 14:59:57
 */
public class Checking implements Serializable {
    private static final long serialVersionUID = -25674172709011902L;

    private Integer id;

    private Integer staffNumber;

    private Object date;

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

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
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