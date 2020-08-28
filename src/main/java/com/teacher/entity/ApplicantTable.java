package com.teacher.entity;

import java.io.Serializable;

/**
 * (ApplicantTable)实体类
 *
 * @author makejava
 * @since 2020-08-27 14:59:46
 */
public class ApplicantTable implements Serializable {
    private static final long serialVersionUID = -34002118980790746L;

    private String account;

    private String password;

    private Integer level;


    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

}