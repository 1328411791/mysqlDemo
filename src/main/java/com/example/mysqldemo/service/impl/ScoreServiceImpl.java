package com.example.mysqldemo.service.impl;

import cn.hutool.core.collection.ListUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mysqldemo.common.Result;
import com.example.mysqldemo.entity.Score;
import com.example.mysqldemo.entity.Student;
import com.example.mysqldemo.entity.dto.ScoreDto;
import com.example.mysqldemo.mapper.ScoreMapper;
import com.example.mysqldemo.service.ScoreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ScoreServiceImpl extends ServiceImpl<ScoreMapper, Score> implements ScoreService {

    @Resource
    private ScoreMapper scoreMapper;

    @Override
    public Result getScoreByStudentId(String schoolId) {
        List<ScoreDto> scores = scoreMapper.getScoreByStudentId(schoolId);
        if (scores.size() == 0) {
            return Result.fail("暂无成绩");
        }
        return Result.ok(scores,(long)scores.size());
    }


}
