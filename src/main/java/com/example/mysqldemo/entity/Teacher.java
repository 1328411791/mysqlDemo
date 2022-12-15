package com.example.mysqldemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Teacher {


    @TableId(type = IdType.AUTO)
    private Integer id;

    private String teacherName;

    private String teacherPhone;

    private String teacherUsername;

    private String password;
}
