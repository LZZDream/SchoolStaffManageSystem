package com.teacher.controller;


import com.teacher.service.AdministrativeTableService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;


@Controller
public class AdministrativeTableController {

    @Resource
    @Qualifier("administrativeTableServiceImpl")
    private AdministrativeTableService administrativeTableService;

}