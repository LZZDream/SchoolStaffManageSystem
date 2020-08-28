package com.teacher.controller;

import com.teacher.entity.Teacher;
import com.teacher.service.TeacherService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;




@Controller
public class TeacherController {

    @Resource
    @Qualifier("teacherServiceImpl")
    private TeacherService teacherService;

    /**
     * 根据员工号查询员工
     * @param staffNumber
     * @param request
     * @return
     */
    @RequestMapping("/queryByID")
    private String queryByID(Integer staffNumber, HttpServletRequest request) {
        List<Teacher> teacherList = (List<Teacher>) teacherService.queryById(staffNumber);
        request.setAttribute("teacherList", teacherList);
        return "/teacher-table";
    }

    /**
     * 查询所有的兼职人员
     * @param post
     * @param request
     * @return
     */
    @RequestMapping("/queryParttime")
    private String queryParttime(Integer post, HttpServletRequest request) {
        List<Teacher> teacherList = (List<Teacher>) teacherService.queryParttime(post);
        request.setAttribute("teacherList", teacherList);
        return "/teacher-table";
    }

    /**
     * 查询所有的临时聘用人员
     * @param post
     * @param request
     * @return
     */
    @RequestMapping("/queryFloater")
    private String queryFloater(Integer post, HttpServletRequest request) {
        List<Teacher> teacherList = (List<Teacher>) teacherService.queryFloater(post);
        request.setAttribute("teacherList", teacherList);
        return "/teacher-table";
    }

    /**
     * 查询所有的学者人员
     * @param post
     * @param request
     * @return
     */
    @RequestMapping("/queryBookMan")
    private String queryBookMan(Integer post, HttpServletRequest request) {
        List<Teacher> teacherList = (List<Teacher>) teacherService.queryBookMan(post);
        request.setAttribute("teacherList", teacherList);
        return "/teacher-table";
    }

    /**
     * 查询所有的返聘人员
     * @param post
     * @param request
     * @return
     */
    @RequestMapping("/queryReEmploy")
    private String queryReEmploy(Integer post, HttpServletRequest request) {
        List<Teacher> teacherList = (List<Teacher>) teacherService.queryReEmploy(post);
        request.setAttribute("teacherList", teacherList);
        return "/teacher-table";
    }

    /**
     * 查询所有的挂职人员
     * @param post
     * @param request
     * @return
     */
    @RequestMapping("/queryTemp")
    private String queryTemp(Integer post, HttpServletRequest request) {
        List<Teacher> teacherList = (List<Teacher>) teacherService.queryTemp(post);
        request.setAttribute("teacherList", teacherList);
        return "/teacher-table";
    }

    /**
     * 维护各类人员信息
     * @param teacher
     * @param request
     * @return
     */
    @RequestMapping("/updateTeacher")
    private String updateTeacher(Teacher teacher,HttpServletRequest request) {
        Teacher teacher01 = teacherService.update(teacher);
//        switch (teacher01.getPost().trim()) {
//            case "10": List<Teacher> ParttimeList = teacherService.queryParttime(10);request.setAttribute("userList", ParttimeList);
//            case "11": List<Teacher> FloaterList = teacherService.queryFloater(10);request.setAttribute("userList", FloaterList);
//            case "12": List<Teacher> BookManList = teacherService.queryBookMan(10);request.setAttribute("userList", BookManList);
//            case "13": List<Teacher> ReEmployList = teacherService.queryReEmploy(10);request.setAttribute("userList", ReEmployList);
//            case "14": List<Teacher> TempList = teacherService.queryTemp(10);request.setAttribute("userList", TempList);
//            default:
//                try {
//                    throw new Exception("职员岗位异常！");
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//        }
        return "/teacher-table" ;
    }

    /**
     * 添加各类人员信息
     * @param teacher
     * @param request
     * @return
     */
    @RequestMapping("/addTeacher")
    private String addUser(Teacher teacher,HttpServletRequest request){
        teacherService.insert(teacher);
        request.setAttribute("msg",1);
        return "/user-add" ;
    }

    /**
     * 删除各类人员信息
     * @param teacherID
     * @param request
     * @return
     */

    @RequestMapping("/deleteTeacher")
    private String deleteUser(Integer teacherID,HttpServletRequest request){
        teacherService.deleteById(teacherID);
        Teacher teacher01 = teacherService.queryById(teacherID);
//        switch (teacher01.getPost()) {
//            case "10": List<Teacher> ParttimeList = teacherService.queryParttime(10);request.setAttribute("userList", ParttimeList);
//            case "11": List<Teacher> FloaterList = teacherService.queryFloater(10);request.setAttribute("userList", FloaterList);
//            case "12": List<Teacher> BookManList = teacherService.queryBookMan(10);request.setAttribute("userList", BookManList);
//            case "13": List<Teacher> ReEmployList = teacherService.queryReEmploy(10);request.setAttribute("userList", ReEmployList);
//            case "14": List<Teacher> TempList = teacherService.queryTemp(10);request.setAttribute("userList", TempList);
//            default:
//                try {
//                    throw new Exception("抛出异常");
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//        }
        return "/user-table";
    }




}