package com.teacher.entity;

import java.io.Serializable;

/**
 * (StudentTable)实体类
 *
 * @author makejava
 * @since 2020-08-27 15:00:06
 */
public class StudentTable implements Serializable {
    private static final long serialVersionUID = 439052391185039568L;

    private Integer studentNumber;

    private String name;

    private Object sex;

    private String academy;

    private Integer age;

    private String phone;


    public Integer getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
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

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}