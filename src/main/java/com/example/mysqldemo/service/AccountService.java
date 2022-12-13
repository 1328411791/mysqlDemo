package com.example.mysqldemo.service;

import com.example.mysqldemo.common.Result;
import com.example.mysqldemo.entity.Student;

public interface AccountService {
    Result loginStudent(String username, String password);
}
