package com.example.mysqldemo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Teacher {


    @TableId
    private Integer id;

    private String teacherName;

    private String teacherPhone;
}
