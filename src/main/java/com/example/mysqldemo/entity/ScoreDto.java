package com.example.mysqldemo.entity;

import lombok.Data;

@Data
public class ScoreDto {

    private String schoolId;

    private int scoreId;

    private String studentName;

    private String courseName;

    private String score;

    private String teacherName;

}