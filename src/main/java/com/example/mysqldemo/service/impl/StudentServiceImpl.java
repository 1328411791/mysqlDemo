package com.example.mysqldemo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mysqldemo.common.Result;
import com.example.mysqldemo.entity.Student;
import com.example.mysqldemo.mapper.StudentMapper;
import com.example.mysqldemo.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

    @Override
    public Result selectStudentName(String studentName) {
        LambdaQueryWrapper<Student> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(Student::getStudentName, studentName);
        return Result.ok(this.list(queryWrapper));
    }
}
