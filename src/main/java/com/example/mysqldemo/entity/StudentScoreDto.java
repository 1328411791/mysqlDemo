package com.example.mysqldemo.entity;

import lombok.Data;

@Data
public class StudentScoreDto {

    private int studentId;

    private int teacherID;

    private int courseId;

    private int score;

    private int departmentId;

}
