package com.example.mysqldemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScoreDto {

    private String schoolId;

    private int scoreId;

    private String studentName;

    private String courseName;

    private int score;

    private String teacherName;

}
