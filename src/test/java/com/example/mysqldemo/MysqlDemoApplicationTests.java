package com.example.mysqldemo;

import com.example.mysqldemo.entity.ScoreDto;
import com.example.mysqldemo.entity.StudentScoreDto;
import com.example.mysqldemo.mapper.ScoreMapper;
import com.example.mysqldemo.service.ScoreService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class MysqlDemoApplicationTests {

    @Resource
    private ScoreMapper scoreMapper;

    @Resource
    private ScoreService scoreService;

    @Test
    void testScoreMapper(){
        List<ScoreDto> scoreByStudentId = scoreMapper.getScoreByStudentName("张");
        for (ScoreDto scoreDto:scoreByStudentId){
            System.out.println(scoreDto);
        }

        List<ScoreDto> scoreByStudent = scoreMapper.getAllStudentScore();
        for (ScoreDto scoreDto:scoreByStudent){
            System.out.println(scoreDto);
        }
    }

    @Test
    void testCourseService(){
        StudentScoreDto studentScoreDto=new StudentScoreDto();
        studentScoreDto.setCourseId(1);
        studentScoreDto.setStudentId(1);
        studentScoreDto.setTeacherID(2);
        studentScoreDto.setScore(80);
        studentScoreDto.setDepartmentId(1);
        scoreService.addScore(studentScoreDto);
    }



}
