package com.example.mysqldemo.service;

import com.example.mysqldemo.common.Result;
import com.example.mysqldemo.entity.Student;
import com.example.mysqldemo.entity.Teacher;

public interface AccountService {
    Result loginStudent(String username, String password);

    Result forgetPassword(String username, String password);

    Result register(Teacher teacher);
}
