package com.teacher.controller;

import com.teacher.entity.Checking;
import com.teacher.service.CheckingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@Controller
public class CheckingController {

    @Resource
    @Qualifier("checkingServiceImpl")
    private CheckingService checkingService;




}