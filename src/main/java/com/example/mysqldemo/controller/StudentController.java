package com.example.mysqldemo.controller;

import com.example.mysqldemo.common.Result;
import com.example.mysqldemo.entity.Student;
import com.example.mysqldemo.service.StudentService;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;


@RestController
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;
    @GetMapping("/{id}")
    public Result getStudentById(@PathVariable int id) {
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

    @DeleteMapping("")
    public Result deleteStudent(@RequestParam int id) {
        return Result.ok(studentService.removeById(id));
    }
}
