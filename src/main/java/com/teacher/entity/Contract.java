package com.teacher.entity;

import java.io.Serializable;

/**
 * (Contract)实体类
 *
 * @author makejava
 * @since 2020-08-27 14:59:58
 */
public class Contract implements Serializable {
    private static final long serialVersionUID = -23728847058709346L;

    private Integer id;

    private Object date;

    private String content;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}