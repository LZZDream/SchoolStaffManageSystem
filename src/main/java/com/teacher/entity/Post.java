package com.teacher.entity;

import java.io.Serializable;

/**
 * (Post)实体类
 *
 * @author makejava
 * @since 2020-08-27 15:00:04
 */
public class Post implements Serializable {
    private static final long serialVersionUID = -65954890062669793L;

    private Integer id;

    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}