package com.example.mysqldemo.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mysqldemo.common.Result;
import com.example.mysqldemo.entity.*;
import com.example.mysqldemo.mapper.ScoreMapper;
import com.example.mysqldemo.service.CourseService;
import com.example.mysqldemo.service.ScoreService;
import com.example.mysqldemo.service.StudentService;
import com.example.mysqldemo.service.TeacherService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ScoreServiceImpl extends ServiceImpl<ScoreMapper, Score> implements ScoreService {

    @Resource
    private ScoreMapper scoreMapper;

    @Resource
    private CourseService courseService;

    @Resource
    private StudentService studentService;

    @Resource
    private TeacherService teacherService;

    @Override
    public Result getScoreByStudentId(String studentName) {
        List<ScoreDto> scores = scoreMapper.getScoreByStudentName(studentName);
        if (scores.size() == 0) {
            return Result.fail("暂无成绩");
        }
        return Result.ok(scores,(long)scores.size());
    }

    @Override
    public Result getAllStudentScore() {
        List<ScoreDto> scores = scoreMapper.getAllStudentScore();
        if (scores.size() == 0) {
            return Result.fail("暂无成绩");
        }
        return Result.ok(scores,(long)scores.size());
    }

    @Override
    @Transactional
    public Result addScore(StudentScoreDto studentScoreDto) {
        Course course = courseService.getById(studentScoreDto.getId());
        if (course == null) {
            return Result.fail("课程不存在");
        }

        Student student = studentService.getById(studentScoreDto.getStudentId());
        if (student == null) {
            return Result.fail("学生不存在");
        }

        Score score = BeanUtil.toBean(studentScoreDto, Score.class);
        save(score);

        return Result.ok("添加成功");
    }
}
