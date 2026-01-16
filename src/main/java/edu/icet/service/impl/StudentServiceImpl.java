package edu.icet.service.impl;

import edu.icet.dto.StudentDto;
import edu.icet.entity.StudentEntity;
import edu.icet.repository.StudentRepository;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    final StudentRepository studentRepository;

//    final ModelMapper modelMapper;

    @Override
    public String getName() {
        return "Shanu";
    }

    @Override
    public String getVersion() {
        return "v1.0.0";
    }

    @Override
    public void addStudent(StudentDto studentDto) {




    }

    @Override
    public void updateStudent(StudentDto studentDto) {

    }

    @Override
    public void deleteStudent(Integer id) {


        studentRepository.deleteById(id);

    }

    @Override
    public StudentDto searchStudent(Integer id) {

        return null;
    }

    @Override
    public List<StudentDto> searchAll() {

        return null;
    }
}
