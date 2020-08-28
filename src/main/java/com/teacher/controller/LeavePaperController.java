package com.teacher.controller;

import com.teacher.entity.LeavePaper;
import com.teacher.service.LeavePaperService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (LeavePaper)表控制层
 *
 * @author makejava
 * @since 2020-08-27 15:00:01
 */
@Controller
public class LeavePaperController {
    /**
     * 服务对象
     */
    @Resource
    @Qualifier("leavePaperServiceImpl")
    private LeavePaperService leavePaperService;



}