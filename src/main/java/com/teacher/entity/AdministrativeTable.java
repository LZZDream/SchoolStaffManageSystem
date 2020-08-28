package com.teacher.entity;

import java.io.Serializable;

/**
 * (AdministrativeTable)实体类
 *
 * @author makejava
 * @since 2020-08-27 14:59:55
 */
public class AdministrativeTable implements Serializable {
    private static final long serialVersionUID = 540578247134522822L;

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