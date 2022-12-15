package com.example.mysqldemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mysqldemo.entity.Teacher;
import com.example.mysqldemo.mapper.TeacherMapper;
import com.example.mysqldemo.service.TeacherService;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {


}
