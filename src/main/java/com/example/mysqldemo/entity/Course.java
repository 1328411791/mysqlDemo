package com.example.mysqldemo.entity;

import lombok.Data;

@Data
public class Course {

    private int id;

    private String courseName;

    private int teacherId;

    private int departmentId;
}
