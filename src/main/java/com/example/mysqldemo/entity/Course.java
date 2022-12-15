package com.example.mysqldemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Course {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String courseName;

    private int teacherId;

    private int departmentId;
}
