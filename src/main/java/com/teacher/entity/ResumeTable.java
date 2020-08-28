package com.teacher.entity;

import java.io.Serializable;

/**
 * (ResumeTable)实体类
 *
 * @author makejava
 * @since 2020-08-27 15:00:05
 */
public class ResumeTable implements Serializable {
    private static final long serialVersionUID = -69738751163789434L;

    private Integer resumeId;

    private String account;

    private String name;

    private Object sex;

    private String phone;

    private Integer interviewSchedule;

    private Integer interviewState;

    private Integer healthResult;

    private String mail;

    private String intentionJob;

    private Object intentionMoney;

    private String technology;

    private String experiences;


    public Integer getResumeId() {
        return resumeId;
    }

    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getSex() {
        return sex;
    }

    public void setSex(Object sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getInterviewSchedule() {
        return interviewSchedule;
    }

    public void setInterviewSchedule(Integer interviewSchedule) {
        this.interviewSchedule = interviewSchedule;
    }

    public Integer getInterviewState() {
        return interviewState;
    }

    public void setInterviewState(Integer interviewState) {
        this.interviewState = interviewState;
    }

    public Integer getHealthResult() {
        return healthResult;
    }

    public void setHealthResult(Integer healthResult) {
        this.healthResult = healthResult;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getIntentionJob() {
        return intentionJob;
    }

    public void setIntentionJob(String intentionJob) {
        this.intentionJob = intentionJob;
    }

    public Object getIntentionMoney() {
        return intentionMoney;
    }

    public void setIntentionMoney(Object intentionMoney) {
        this.intentionMoney = intentionMoney;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getExperiences() {
        return experiences;
    }

    public void setExperiences(String experiences) {
        this.experiences = experiences;
    }

}