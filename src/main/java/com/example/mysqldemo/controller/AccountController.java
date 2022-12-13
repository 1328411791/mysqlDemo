package com.example.mysqldemo.controller;

import com.example.mysqldemo.common.Result;
import com.example.mysqldemo.service.AccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Resource
    private AccountService accountService;

    @PostMapping("/login")
    public Result login(@RequestParam String username, @RequestParam String password) {
        return Result.ok(accountService.loginStudent(username, password));
    }


}
