package edu.icet.service.impl;

import edu.icet.dto.StudentDto;
import edu.icet.dto.TeacherDto;
import edu.icet.entity.StudentEntity;
import edu.icet.entity.TeacherEntity;
import edu.icet.repository.TeacherRepository;
import edu.icet.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService{

    final TeacherRepository teacherRepository;

    final ModelMapper modelMapper;

    @Override
    public void addTeacher(TeacherDto teacherDto) {
        TeacherEntity teacherEntity = modelMapper.map(teacherDto,TeacherEntity.class);
        teacherRepository.save(teacherEntity);
    }

    @Override
    public void updateTeacher(TeacherDto teacherDto) {
        TeacherEntity teacherEntity = modelMapper.map(teacherDto,TeacherEntity.class);
        teacherRepository.save(teacherEntity);
    }

    @Override
    public void deleteTeacher(Integer id) {
        teacherRepository.deleteById(id);
    }

    @Override
    public TeacherDto searchTeacherById(Integer id) {
        TeacherEntity teacherEntity = teacherRepository.findById(id).get();
        TeacherDto teacherDto = modelMapper.map(teacherEntity,TeacherDto.class);
        return teacherDto;
    }

    @Override
    public List<TeacherDto> searchAll() {
        List<TeacherEntity> all = teacherRepository.findAll();
        List<TeacherDto> teacherDtoList = new ArrayList<>();

        all.forEach(teacherEntity -> {
           TeacherDto teacherDto = modelMapper.map(teacherEntity,TeacherDto.class);
           teacherDtoList.add(teacherDto);
        });
        return teacherDtoList;
    }
}
