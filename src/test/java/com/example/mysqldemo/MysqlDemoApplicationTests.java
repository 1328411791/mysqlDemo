package com.example.mysqldemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class MysqlDemoApplicationTests {

    @Resource
    private UserService userService;

    @Test
    void contextLoads() {
        userService.list().forEach(System.out::println);
    }

}
