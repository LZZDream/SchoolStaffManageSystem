package com.teacher.entity;

import java.io.Serializable;

/**
 * (RetiredTable)实体类
 *
 * @author makejava
 * @since 2020-08-27 15:00:05
 */
public class RetiredTable implements Serializable {
    private static final long serialVersionUID = 616574431138668682L;

    private Integer staffNumber;

    private Object retiredTime;


    public Integer getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(Integer staffNumber) {
        this.staffNumber = staffNumber;
    }

    public Object getRetiredTime() {
        return retiredTime;
    }

    public void setRetiredTime(Object retiredTime) {
        this.retiredTime = retiredTime;
    }

}