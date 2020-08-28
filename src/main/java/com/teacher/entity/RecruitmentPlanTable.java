package com.teacher.entity;

import java.io.Serializable;

/**
 * (RecruitmentPlanTable)实体类
 *
 * @author makejava
 * @since 2020-08-27 15:00:04
 */
public class RecruitmentPlanTable implements Serializable {
    private static final long serialVersionUID = -63366703142298717L;

    private Integer id;

    private String department;

    private Integer peopleNumber;

    private Integer reviewProgress;

    private Integer reviewState;

    private String workAddress;

    private Object money;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getPeopleNumber() {
        return peopleNumber;
    }

    public void setPeopleNumber(Integer peopleNumber) {
        this.peopleNumber = peopleNumber;
    }

    public Integer getReviewProgress() {
        return reviewProgress;
    }

    public void setReviewProgress(Integer reviewProgress) {
        this.reviewProgress = reviewProgress;
    }

    public Integer getReviewState() {
        return reviewState;
    }

    public void setReviewState(Integer reviewState) {
        this.reviewState = reviewState;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public Object getMoney() {
        return money;
    }

    public void setMoney(Object money) {
        this.money = money;
    }

}