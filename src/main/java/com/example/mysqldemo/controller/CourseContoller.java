package com.example.mysqldemo.controller;

import com.example.mysqldemo.common.Result;
import com.example.mysqldemo.entity.Course;
import com.example.mysqldemo.service.CourseService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

public class CourseContoller {

    @Resource
    private CourseService courseService;

    @GetMapping("/{id}")
    public Result getCourseById(int id) {
        return Result.ok(courseService.getById(id));
    }

    @PostMapping
    public Result addCourse(@RequestBody Course course) {
        return Result.ok(courseService.save(course));
    }

    @PutMapping
    public Result updateCourse(@RequestBody Course course) {
        return Result.ok(courseService.updateById(course));
    }

    @DeleteMapping()
    public Result deleteCourse(@RequestBody String id) {
        return Result.ok(courseService.removeById(id));
    }





}
