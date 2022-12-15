package com.example.mysqldemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.mysqldemo.common.Result;
import com.example.mysqldemo.entity.Score;
import com.example.mysqldemo.entity.ScoreDto;
import com.example.mysqldemo.entity.StudentScoreDto;

import java.util.List;

public interface ScoreService extends IService<Score> {


    Result getScoreByStudentId(String studentName);

    Result getAllStudentScore();

    Result addScore(StudentScoreDto studentScoreDto);
}
