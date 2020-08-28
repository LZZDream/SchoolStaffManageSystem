package com.teacher.controller;

import com.teacher.entity.SpecialStaff;
import com.teacher.service.SpecialStaffService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SpecialStaff)表控制层
 *
 * @author makejava
 * @since 2020-08-27 15:00:06
 */
@Controller
public class SpecialStaffController {
    /**
     * 服务对象
     */
    @Resource
    @Qualifier("specialStaffServiceImpl")
    private SpecialStaffService specialStaffService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */


}