package com.example.mysqldemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mysqldemo.entity.Student;
import com.example.mysqldemo.mapper.StudentMapper;
import com.example.mysqldemo.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {


}
