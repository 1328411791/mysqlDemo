package com.example.mysqldemo.controller;

import com.example.mysqldemo.common.Result;
import com.example.mysqldemo.entity.Teacher;
import com.example.mysqldemo.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Api(tags = "教师管理")
@RestController()
@RequestMapping("/teacher")
public class TeacherController {

    @Resource
    private TeacherService teacherService;

    @ApiOperation(value = "获取一个教师")
    @GetMapping("/{id}")
    public Result getTeacherById(@RequestBody Integer id) {
        return Result.ok(teacherService.getById(id));
    }

    @ApiOperation(value = "添加教师")
    @GetMapping("/all")
    public Result getAllTeacher() {
        return Result.ok(teacherService.list());
    }

    @ApiOperation(value = "添加教师")
    @PostMapping()
    public Result addTeacher(@RequestParam Teacher teacher) {
        return Result.ok(teacherService.save(teacher));
    }

    @ApiOperation(value = "更新教师")
    @PutMapping()
    public Result updateTeacher(@RequestBody Teacher teacher) {
        return Result.ok(teacherService.updateById(teacher));
    }

    @DeleteMapping()
    public Result deleteTeacher(@RequestBody Integer id) {
        return Result.ok(teacherService.removeById(id));
    }
}
