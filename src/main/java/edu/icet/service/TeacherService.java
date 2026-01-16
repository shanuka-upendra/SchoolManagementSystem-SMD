package edu.icet.service;

import edu.icet.dto.TeacherDto;

import java.util.List;

public interface TeacherService{
    void addTeacher(TeacherDto teacherDto);
    void updateTeacher(TeacherDto teacherDto);
    void deleteTeacher(Integer id);
    TeacherDto searchTeacherById(Integer id);
    List<TeacherDto> searchAll();
}
