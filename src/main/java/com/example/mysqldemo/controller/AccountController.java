package com.example.mysqldemo.controller;

import com.example.mysqldemo.common.Result;
import com.example.mysqldemo.service.AccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Api(tags = "账户管理")
@RestController
@RequestMapping("/account")
public class AccountController {

    @Resource
    private AccountService accountService;

    @PostMapping("/login")
    @ApiOperation(value = "登录")
    public Result login(@RequestParam String username, @RequestParam String password, HttpServletResponse httpServletResponse) {
        Result result = accountService.loginStudent(username, password);
        if(result.getSuccess()) {
            Cookie cookie=new Cookie("Login_CAS",Long.toString(System.currentTimeMillis()));
            httpServletResponse.addCookie(cookie);
        }
        return result;
    }

}
