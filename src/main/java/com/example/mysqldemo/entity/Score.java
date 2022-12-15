package com.example.mysqldemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Score {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private int studentId;

    private int courseId;

    private int score;
}
