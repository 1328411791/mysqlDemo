package com.example.mysqldemo.entity;

import lombok.Data;

@Data
public class StudentScoreDto {

    private int studentId;

    private String schoolId;

    private int teacherID;

    private int courseId;

    private int id;

    private int score;

    private int departmentId;

}
