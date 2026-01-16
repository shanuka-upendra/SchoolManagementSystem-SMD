package edu.icet.service;

import edu.icet.dto.StudentDto;

import java.util.List;

public interface StudentService {
    String getName();
    String getVersion();
    void addStudent(StudentDto studentDto);
    void updateStudent(StudentDto studentDto);
    void deleteStudent(Integer id);
    StudentDto searchStudent(Integer id);
    List<StudentDto> searchAll();
}
