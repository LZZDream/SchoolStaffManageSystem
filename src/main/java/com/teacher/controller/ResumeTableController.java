package com.teacher.controller;

import com.teacher.entity.ResumeTable;
import com.teacher.service.ResumeTableService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * (ResumeTable)表控制层
 *
 * @author makejava
 * @since 2020-08-27 15:00:05
 */
@Controller
public class ResumeTableController {
    /**
     * 服务对象
     */
    @Resource
    private ResumeTableService resumeTableService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ResumeTable selectOne(Integer id) {
        return this.resumeTableService.queryById(id);
    }

    @RequestMapping("/submitResume")
    public String submitResume(ResumeTable resumeTable){

        resumeTableService.insert(resumeTable);
        return "submitResume";



    }

}