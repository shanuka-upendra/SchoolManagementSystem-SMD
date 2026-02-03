package edu.icet.service;

import edu.icet.dto.ClassDto;

import java.util.List;

public interface ClassService {
    void addClass(ClassDto classDto);
    void updateClass(ClassDto classDto);
    void deleteClass(Integer id);
    List<ClassDto> getAll();
    ClassDto searchClassById(Integer id);
    List<ClassDto> searchClassByClassName(String name);
    List<ClassDto> searchClassByGrade(String grade);
    List<ClassDto>

    searchClassByTeacherId(Long teacherId);
    List<ClassDto> searchClassByStudentId(Long studentId);
}
