package com.example.mysqldemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.mysqldemo.entity.Course;

public interface CourseService extends IService<Course> {


    Course getCourseByName(String courseName);
}
