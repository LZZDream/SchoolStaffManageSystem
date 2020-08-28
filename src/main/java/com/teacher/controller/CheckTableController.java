package com.teacher.controller;

import com.teacher.entity.CheckTable;
import com.teacher.service.CheckTableService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (CheckTable)表控制层
 *
 * @author makejava
 * @since 2020-08-27 14:59:57
 */
@Controller
public class CheckTableController {

    @Resource
    @Qualifier("checkTableServiceImpl")
    private CheckTableService checkTableService;



}