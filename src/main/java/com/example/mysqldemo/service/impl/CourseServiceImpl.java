package com.example.mysqldemo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mysqldemo.entity.Course;
import com.example.mysqldemo.mapper.CourseMapper;
import com.example.mysqldemo.service.CourseService;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements CourseService {

    @Override
    public Course getCourseByName(String courseName) {
        LambdaQueryWrapper<Course> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Course::getCourseName, courseName);
        return getOne(queryWrapper);
    }

}
