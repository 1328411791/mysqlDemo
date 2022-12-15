package com.example.mysqldemo;

import com.example.mysqldemo.common.Result;
import com.example.mysqldemo.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class StudentTests {

    @Resource
    private StudentService studentService;

    @Test
    public void testSelectStudentName() {
        Result result = studentService.selectStudentName("张");
        System.out.println(result);
    }
}
