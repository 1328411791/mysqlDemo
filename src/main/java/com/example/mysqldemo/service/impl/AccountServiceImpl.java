package com.example.mysqldemo.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.mysqldemo.common.Result;
import com.example.mysqldemo.entity.Student;
import com.example.mysqldemo.service.AccountService;
import com.example.mysqldemo.service.StudentService;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private StudentService studentService;
    @Override
    public Result loginStudent(String username, String password) {
        LambdaQueryWrapper<Student> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Student::getSchoolId, username)
                .eq(Student::getPassword, password);
        Student loginStudent=studentService.getOne(queryWrapper);
        if(BeanUtil.isEmpty(loginStudent)){
            return Result.fail("登录失败");
        }
        return Result.ok("登录成功");
    }
}

