package com.example.mysqldemo.entity;

import lombok.Data;

@Data
public class Student {

    private int id;

    private int schoolId;

    private String studentName;

    private String password;

    private int departmentId;


}
