package com.example.mysqldemo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Course {

    @TableId
    private Integer id;

    private String courseName;

    private int teacherId;

    private int departmentId;
}
