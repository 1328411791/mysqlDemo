package com.example.mysqldemo;

import com.example.mysqldemo.common.Result;
import com.example.mysqldemo.service.ScoreService;
import com.example.mysqldemo.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class StudentTests {

    @Resource
    private StudentService studentService;

    @Resource
    private ScoreService scoreService;

    @Test
    public void testSelectStudentName() {
        Result result = studentService.selectStudentName("张");
        System.out.println(result);
        Result result1 = scoreService.getAllStudentScore();
        System.out.println(result1);
    }
}
