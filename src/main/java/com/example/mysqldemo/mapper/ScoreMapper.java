package com.example.mysqldemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mysqldemo.entity.Score;
import com.example.mysqldemo.entity.dto.ScoreDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ScoreMapper extends BaseMapper<Score> {

    // 从Student表中查询学生的所有成绩
    @Select("SELECT student.school_id,student.student_name,course_name,score,teacher_name FROM student,score,course,teacher WHERE student.id=course.id AND student.school_id=#{schoolId} AND student.id = score.student_id AND score.course_id=course.id AND teacher_id=teacher.id;")
    List<ScoreDto> getScoreByStudentId(String schoolId);

}
