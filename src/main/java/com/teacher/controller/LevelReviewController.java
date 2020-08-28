package com.teacher.controller;

import com.teacher.entity.LevelReview;
import com.teacher.service.LevelReviewService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (LevelReview)表控制层
 *
 * @author makejava
 * @since 2020-08-27 15:00:03
 */
@Controller
public class LevelReviewController {
    /**
     * 服务对象
     */
    @Resource
    @Qualifier("levelReviewServiceImpl")
    private LevelReviewService levelReviewService;




}