package com.example.mysqldemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mysqldemo.entity.Course;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CourseMapper extends BaseMapper<Course> {
}
