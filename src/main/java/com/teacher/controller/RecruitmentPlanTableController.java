package com.teacher.controller;

import com.teacher.entity.RecruitmentPlanTable;
import com.teacher.service.RecruitmentPlanTableService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
public class RecruitmentPlanTableController {

    @Resource
    @Qualifier("rerecruitmentPlanTableServiceImpl")
    private RecruitmentPlanTableService recruitmentPlanTableService;



    @RequestMapping("/recruitment_information")
    public String recruitmentPlanTableList(HttpServletRequest request){
        List<RecruitmentPlanTable> recruitmentPlanTables=recruitmentPlanTableService.queryAllList();
        request.setAttribute("recruitmentPlanTable",recruitmentPlanTables);
        request.setAttribute("hahaha",999);
        request.getSession().setAttribute("jjj",000);
        System.out.println(recruitmentPlanTables);

        return "recruitmentList";
    }



}