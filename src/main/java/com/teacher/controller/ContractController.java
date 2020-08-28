package com.teacher.controller;

import com.teacher.entity.Contract;
import com.teacher.service.ContractService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Contract)表控制层
 *
 * @author makejava
 * @since 2020-08-27 14:59:58
 */
@Controller
public class ContractController {

    @Resource
    @Qualifier("contractServiceImpl")
    private ContractService contractService;


}