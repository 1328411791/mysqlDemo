package com.example.mysqldemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Student {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String schoolId;

    private String studentName;

    private String studentSex;

    private int departmentId;
}
