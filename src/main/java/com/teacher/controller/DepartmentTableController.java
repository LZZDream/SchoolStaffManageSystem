package com.teacher.controller;

import com.teacher.entity.DepartmentTable;
import com.teacher.service.DepartmentTableService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (DepartmentTable)表控制层
 *
 * @author makejava
 * @since 2020-08-27 15:00:00
 */
@Controller
public class DepartmentTableController {
    /**
     * 服务对象
     */
    @Resource
    @Qualifier("departmentTableServiceImpl")
    private DepartmentTableService departmentTableService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */

}