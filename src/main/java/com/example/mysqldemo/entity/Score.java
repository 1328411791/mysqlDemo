package com.example.mysqldemo.entity;

import lombok.Data;

@Data
public class Score {

    private int id;

    private int studentId;

    private int courseId;

    private int score;
}
