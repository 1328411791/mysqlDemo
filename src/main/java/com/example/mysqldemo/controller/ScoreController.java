package com.example.mysqldemo.controller;

import com.example.mysqldemo.common.Result;
import com.example.mysqldemo.entity.Score;
import com.example.mysqldemo.entity.ScoreDto;
import com.example.mysqldemo.entity.StudentScoreDto;
import com.example.mysqldemo.service.ScoreService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Api(tags = "成绩管理")
@RestController
@RequestMapping("/score")
public class ScoreController {

    @Resource
    private ScoreService scoreService;

    @ApiOperation(value = "根据学生名字查询成绩")
    @GetMapping("/getByStudentId")
    public Result getScoreByStudentId(@RequestParam String studentName) {
        return scoreService.getScoreByStudentId(studentName);
    }

    @PostMapping("/addStudentScore")
    @ApiOperation(value = "添加该学生成绩")
    public Result addScore(@RequestBody StudentScoreDto studentScoreDto) {
        return scoreService.addScore(studentScoreDto);
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "查询成绩")
    public Result getScoreById(int id) {
        return Result.ok(scoreService.getById(id));
    }

    @GetMapping("/all")
    @ApiOperation(value = "查询所有成绩")
    public Result getAllScore() {
        return scoreService.getAllStudentScore();
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
    public Result deleteScore(@RequestBody Integer id) {
        return Result.ok(scoreService.removeById(id));
    }
}
