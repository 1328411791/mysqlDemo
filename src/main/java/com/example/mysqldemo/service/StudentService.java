package com.example.mysqldemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.mysqldemo.common.Result;
import com.example.mysqldemo.entity.Student;

public interface StudentService extends IService<Student> {


    Result selectStudentName(String studentName);
}
