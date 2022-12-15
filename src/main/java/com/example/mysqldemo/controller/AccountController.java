package com.example.mysqldemo.controller;

import com.baomidou.mybatisplus.annotation.TableId;
import com.example.mysqldemo.common.Result;
import com.example.mysqldemo.entity.Student;
import com.example.mysqldemo.entity.Teacher;
import com.example.mysqldemo.service.AccountService;
import com.example.mysqldemo.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Api(tags = "账户管理")
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/account")
public class AccountController {

    @Resource
    private AccountService accountService;

    @ApiOperation(value = "登录")
    @PostMapping(value = "/login", consumes = "application/x-www-form-urlencoded")
    public Result login(@RequestParam String username, @RequestParam String password, HttpServletResponse httpServletResponse) throws IOException {
        Result result = accountService.loginStudent(username, password);
        if(result.getSuccess()) {
            Cookie cookie=new Cookie("username",username);
            cookie.setMaxAge(60*60*24*7);
            cookie.setPath("/");
            httpServletResponse.addCookie(cookie);
        }
        return result;
    }

    @ApiOperation(value = "登出")
    @PostMapping(value = "/logout")
    public Result logout(HttpServletResponse httpServletResponse) throws IOException {
        Cookie cookie=new Cookie("username","");
        httpServletResponse.addCookie(cookie);
        return Result.ok();
    }

    @ApiOperation(value = "忘记密码")
    @PostMapping(value = "/forgetPassword" , consumes = "application/x-www-form-urlencoded")
    public Result forgetPassword(@RequestParam String username, @RequestParam String password) {
        return accountService.forgetPassword(username, password);
    }

    @ApiOperation(value = "注册")
    @PostMapping(value = "/register" )
    public Result register(@RequestBody Teacher teacher) {
        return accountService.register(teacher);
    }

}
