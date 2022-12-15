package com.example.mysqldemo.controller;

import cn.hutool.core.bean.BeanUtil;
import com.example.mysqldemo.common.Result;
import com.example.mysqldemo.entity.Score;
import com.example.mysqldemo.entity.dto.ScoreDto;
import com.example.mysqldemo.service.ScoreService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Api(tags = "成绩管理")
@RestController
@RequestMapping("/score")
public class ScoreController {

    @Resource
    private ScoreService scoreService;

    @ApiOperation(value = "根据学生名字查询成绩")
    @GetMapping("/getByStudentId")
    public Result getScoreByStudentId(@CookieValue("username") String username) {
        if(username == null) {
            return Result.fail("请先登录");
        }
        return scoreService.getScoreByStudentId(username);
    }

    @PostMapping()
    @ApiOperation(value = "添加该学生成绩")
    public Result addScore(@RequestBody ScoreDto scoreDto) {
        return Result.ok("TODO");
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "查询成绩")
    public Result getScoreById(int id) {
        return Result.ok(scoreService.getById(id));
    }

    @GetMapping("/all")
    @ApiOperation(value = "查询所有成绩")
    public Result getAllScore() {
        return Result.ok(scoreService.list());
    }

    @PostMapping()
    @ApiOperation(value = "添加成绩")
    public Result addScore(@RequestBody Score score) {
        return Result.ok(scoreService.save(score));
    }

    @PutMapping()
    @ApiOperation(value = "更新成绩")
    public Result updateScore(@RequestBody Score score) {
        return Result.ok(scoreService.updateById(score));
    }

    @DeleteMapping()
    @ApiOperation(value = "删除成绩")
    public Result deleteScore(@RequestBody String id) {
        return Result.ok(scoreService.removeById(id));
    }
}
