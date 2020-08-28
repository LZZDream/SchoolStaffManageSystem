package com.teacher.controller;

import com.teacher.entity.ApplicantTable;
import com.teacher.service.ApplicantTableService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ApplicantTableController {

    @Resource
    @Qualifier("applicantTableServiceImpl")
    private ApplicantTableService applicantTableService;



//    应聘者登录
    @RequestMapping("/login")
    public String login(HttpServletRequest request,String account,String password){
        ApplicantTable applicantTable=applicantTableService.login(account,password);
        if(applicantTable!=null){
            request.getSession().setAttribute("applicantTable",applicantTable);
            return "index";
        }
        else{
            request.setAttribute("msg","账号或者密码错误");
            return "/login";
        }
    }
    //应聘者注册
    @RequestMapping("/signin")
    public String signin(HttpServletRequest request, HttpServletResponse response, ApplicantTable applicantTable){
        if(applicantTableService.signin(applicantTable)==1){
            request.setAttribute("successSignin","注册成功");          //设置错误属性
            try {
                request.getRequestDispatcher("login.jsp").forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            request.setAttribute("msg","用户名重复");
            return "sign_in";

        }
        return null;





    }








}