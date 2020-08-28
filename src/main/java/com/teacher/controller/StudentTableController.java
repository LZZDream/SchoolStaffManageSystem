package com.teacher.controller;

import com.teacher.entity.StudentTable;
import com.teacher.service.StudentTableService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (StudentTable)表控制层
 *
 * @author makejava
 * @since 2020-08-27 15:00:06
 */
@Controller
public class StudentTableController {

    @Resource
    @Qualifier("studentTableServiceImpl")
    private StudentTableService studentTableService;




}