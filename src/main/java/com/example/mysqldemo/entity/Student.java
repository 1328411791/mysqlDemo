package com.example.mysqldemo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Student {

    @TableId
    private Integer id;

    private String schoolId;

    private String studentName;

    private String password;

    private int departmentId;
}
