package com.example.mysqldemo.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.mysqldemo.common.Result;
import com.example.mysqldemo.entity.Teacher;
import com.example.mysqldemo.service.AccountService;
import com.example.mysqldemo.service.TeacherService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private TeacherService teacherService;
    @Override
    public Result loginStudent(String username, String password) {
        LambdaQueryWrapper<Teacher> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Teacher::getTeacherUsername, username)
                .eq(Teacher::getPassword, password);
        Teacher loginStudent=teacherService.getOne(queryWrapper);
        if(loginStudent==null){
            return Result.fail("登录失败");
        }
        return Result.ok("登录成功");
    }

    @Override
    @Transactional
    public Result forgetPassword(String username,String password) {
        LambdaQueryWrapper<Teacher> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Teacher::getTeacherUsername, username);
        Teacher teacher=teacherService.getOne(queryWrapper);
        if(teacher==null){
            return Result.fail("该用户不存在");
        }
        teacher.setPassword(password);
        teacherService.updateById(teacher);
        return Result.ok("修改成功");
    }

    @Override
    @Transactional
    public Result register(Teacher teacher) {
        LambdaQueryWrapper<Teacher> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Teacher::getTeacherUsername, teacher.getTeacherUsername());
        Teacher selectTeacher=teacherService.getOne(queryWrapper);
        if(selectTeacher!=null){
            return Result.fail("该用户已存在");
        }
        teacherService.save(teacher);
        return Result.ok("注册成功");
    }
}

