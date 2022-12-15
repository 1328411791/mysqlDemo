package com.example.mysqldemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScoreDto {

    private int studentId;

    private String schoolId;

    private int id;

    private String studentName;

    private String courseId;

    private String courseName;

    private int score;

    private String teacherName;

}
