package com.example.mysqldemo.controller;

import com.example.mysqldemo.common.Result;
import com.example.mysqldemo.entity.Student;
import com.example.mysqldemo.service.StudentService;
import org.liahnu.pojo.User;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;


@RestController
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;

    @GetMapping("/{id}")
    public Result getStudentById(int id) {
        return Result.ok(studentService.getById(id));
    }

    @PostMapping
    public Result addStudent(@RequestBody Student student) {
        return Result.ok(studentService.save(student));
    }

    @PutMapping
    public Result updateStudent(@RequestBody Student student) {
        return Result.ok(studentService.updateById(student));
    }

    @DeleteMapping("/#{id}")
    public Result deleteStudent(@PathVariable String id) {
        return Result.ok(studentService.removeById(id));
    }
}
