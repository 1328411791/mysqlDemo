package com.example.mysqldemo.service;

import com.example.mysqldemo.entity.Student;

public interface AccountService {
    Student loginStudent(String username, String password);
}
