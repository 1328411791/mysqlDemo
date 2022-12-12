package com.example.mysqldemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mysqldemo.entity.Student;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface StudentMapper extends BaseMapper<Student> {


    // 查询学生的所有课程成绩
    @ResultMap("studentMap")
    @Select("select * from student where id = #{id}")
    Object selectStudentCourse(Integer id);

}

