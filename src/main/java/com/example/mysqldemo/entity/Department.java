package com.example.mysqldemo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Department {

    @TableId
    private Integer id;

    private String departmentName;

    private String departmentLocation;
}
