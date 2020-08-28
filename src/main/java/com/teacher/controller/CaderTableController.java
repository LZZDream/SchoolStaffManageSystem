package com.teacher.controller;

import com.teacher.entity.CaderTable;
import com.teacher.service.CaderTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@Controller
public class CaderTableController {

    @Resource
    @Qualifier("caderTableServiceImpl")
    private CaderTableService caderTableService;




}