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

    final ModelMapper modelMapper;

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

        StudentEntity studentEntity = modelMapper.map(studentDto,StudentEntity.class);
        studentRepository.save(studentEntity);

    }

    @Override
    public void updateStudent(StudentDto studentDto) {

        StudentEntity studentEntity = modelMapper.map(studentDto,StudentEntity.class);
        studentRepository.save(studentEntity);

    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);

    }

    @Override
    public StudentDto searchStudent(Integer id) {
        StudentEntity studentEntity = studentRepository.findById(id).get();
        StudentDto studentDto = modelMapper.map(studentEntity,StudentDto.class);
        return studentDto;

    }

    @Override
    public List<StudentDto> searchAll() {
        List<StudentEntity> all = studentRepository.findAll();
        List<StudentDto> studentDtoArrayList = new ArrayList<>();

        all.forEach(studentEntity -> {
            StudentDto studentDto = modelMapper.map(studentEntity,StudentDto.class);
            studentDtoArrayList.add(studentDto);
        });
        return studentDtoArrayList;
    }
}
