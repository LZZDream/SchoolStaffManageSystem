package com.teacher.controller;

import com.teacher.entity.DeadStaff;
import com.teacher.service.DeadStaffService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (DeadStaff)表控制层
 *
 * @author makejava
 * @since 2020-08-27 14:59:59
 */
@Controller
public class DeadStaffController {

    @Resource
    @Qualifier("deadStaffServiceImpl")
    private DeadStaffService deadStaffService;



}