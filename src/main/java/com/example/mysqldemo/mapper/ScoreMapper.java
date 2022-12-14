package com.example.mysqldemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mysqldemo.entity.Score;
import com.example.mysqldemo.entity.ScoreDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ScoreMapper extends BaseMapper<Score> {

    // 从Student表中查询学生的所有成绩
    @Select("SELECT student.school_id,student.student_name,course_name,score,score.course_id,teacher_name,course_id,score.id id FROM student,course,score,teacher WHERE student_id=student.id AND course.id=score.course_id AND course.teacher_id=teacher.id AND student.student_name like CONCAT('%',#{studentName},'%');")
    List<ScoreDto> getScoreByStudentName(String studentName);

    @Select("SELECT student.school_id,student.student_name,course_name,score,score.course_id,teacher_name,course_id,score.id id FROM student,course,score,teacher WHERE student_id=student.id AND course.id=score.course_id AND course.teacher_id=teacher.id;")
    List<ScoreDto> getAllStudentScore();

}
