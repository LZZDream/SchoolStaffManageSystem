package com.teacher.controller;

import com.teacher.entity.RetiredTable;
import com.teacher.service.RetiredTableService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (RetiredTable)表控制层
 *
 * @author makejava
 * @since 2020-08-27 15:00:05
 */
@Controller
public class RetiredTableController {

    @Resource
    @Qualifier("retiredTableServiceImpl")
    private RetiredTableService retiredTableService;



}