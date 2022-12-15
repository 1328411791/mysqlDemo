package com.example.mysqldemo.controller;

import com.example.mysqldemo.common.Result;
import com.example.mysqldemo.entity.Course;
import com.example.mysqldemo.service.CourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "课程管理")
@RestController
@RequestMapping("/course")
public class CourseContoller {

    @Resource
    private CourseService courseService;

    @GetMapping("/{id}")
    @ApiOperation(value = "查找课程")
    public Result getCourseById(int id) {
        return Result.ok(courseService.getById(id));
    }

    @GetMapping("/all")
    @ApiOperation(value = "查找所有课程")
    public Result getAllCourse() {
        List<Course> courseList = courseService.list();
        return Result.ok(courseList,(long)courseList.size());
    }

    @PostMapping
    @ApiOperation(value = "增加课程")
    public Result addCourse(@RequestBody Course course) {
        return Result.ok(courseService.save(course));
    }

    @PutMapping
    @ApiOperation(value = "更新")
    public Result updateCourse(@RequestBody Course course) {
        return Result.ok(courseService.updateById(course));
    }

    @DeleteMapping()
    @ApiOperation(value = "删除")
    public Result deleteCourse(@RequestBody String id) {
        return Result.ok(courseService.removeById(id));
    }



}
