package com.example.mysqldemo.controller;

import com.example.mysqldemo.common.Result;
import com.example.mysqldemo.service.AccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Resource
    private AccountService accountService;

    @PostMapping("/login")
    public Result login(@RequestParam String username, @RequestParam String password, HttpServletResponse httpServletResponse) {
        Result result = accountService.loginStudent(username, password);
        if(result.getSuccess()) {
            Cookie cookie=new Cookie("Login_CAS",Long.toString(System.currentTimeMillis()));
            httpServletResponse.addCookie(cookie);
        }
        return result;
    }


}
