package com.teacher.controller;

import com.teacher.entity.Post;
import com.teacher.service.PostService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Post)表控制层
 *
 * @author makejava
 * @since 2020-08-27 15:00:04
 */
@Controller
public class PostController {
    /**
     * 服务对象
     */
    @Resource
    @Qualifier("postServiceImpl")
    private PostService postService;




}