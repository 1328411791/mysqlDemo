package com.example.mysqldemo.entity.dto;

import lombok.Data;

@Data
public class ScoreDto {

    private String schoolId;

    private String studentName;

    private String courseName;

    private String score;

    private String teacherName;

}
