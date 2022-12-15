package com.example.mysqldemo.controller;

import com.example.mysqldemo.common.Result;
import com.example.mysqldemo.entity.Student;
import com.example.mysqldemo.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;


@Slf4j
@Api(tags = "学生管理")
@RestController
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;


    @GetMapping("/{id}")
    @ApiOperation(value = "获取一个学生")
    public Result getStudentById(@PathVariable int id) {
        return Result.ok(studentService.getById(id));
    }

    @GetMapping("/all")
    @ApiOperation(value = "获取所有学生")
    public Result getAllStudent() {
        List<Student> studentList = studentService.list();
        return Result.ok(studentList,(long)studentList.size());
    }

    @PostMapping("/selectStudenName")
    @ApiOperation(value = "根据学生名字查询学生")
    public Result selectStudenName(@RequestParam String studentName) {
        return studentService.selectStudentName(studentName);
    }

    @PostMapping
    @ApiOperation(value = "添加学生")
    public Result addStudent(@RequestBody Student student) {
        log.info(student.toString());
        return Result.ok(studentService.save(student));
    }

    @PutMapping
    @ApiOperation(value = "更新学生")
    public Result updateStudent(@RequestBody Student student) {
        return Result.ok(studentService.updateById(student));
    }

    @DeleteMapping()
    @ApiOperation(value = "删除学生")
    public Result deleteStudent(@RequestParam Integer id) {
        return Result.ok(studentService.removeById(id));
    }
}
