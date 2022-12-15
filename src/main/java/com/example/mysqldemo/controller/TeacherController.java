package com.example.mysqldemo.controller;

import com.example.mysqldemo.service.TeacherService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Api(tags = "教师管理")
@RestController()
@RequestMapping("/teacher")
public class TeacherController {

    @Resource
    private TeacherService teacherService;



}
