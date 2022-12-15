package com.example.mysqldemo.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.mysqldemo.common.Result;
import com.example.mysqldemo.entity.Student;
import com.example.mysqldemo.service.AccountService;
import com.example.mysqldemo.service.StudentService;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Override
    @Transactional
    public Result forgetPassword(String username,String password) {
        LambdaQueryWrapper<Student> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Student::getSchoolId, username);
        Student student=studentService.getOne(queryWrapper);
        if(BeanUtil.isEmpty(student)){
            return Result.fail("该用户不存在");
        }
        student.setPassword(password);
        studentService.updateById(student);
        return Result.ok("修改成功");
    }

    @Override
    @Transactional
    public Result register(Student student) {
        LambdaQueryWrapper<Student> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Student::getSchoolId, student.getSchoolId());
        Student student1=studentService.getOne(queryWrapper);
        if(BeanUtil.isNotEmpty(student1)){
            return Result.fail("该用户已存在");
        }
        studentService.save(student);
        return Result.ok("注册成功");
    }
}

