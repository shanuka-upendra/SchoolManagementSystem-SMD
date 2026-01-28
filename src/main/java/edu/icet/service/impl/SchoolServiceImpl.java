package edu.icet.service.impl;

import edu.icet.dto.SchoolDto;
import edu.icet.entity.SchoolEntity;
import edu.icet.repository.SchoolRepository;
import edu.icet.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class SchoolServiceImpl implements SchoolService {

    final SchoolRepository schoolRepository;

    final ModelMapper modelMapper;

    @Override
    public void addSchool(SchoolDto school) {
        schoolRepository.save(modelMapper.map(school, SchoolEntity.class));
    }

    @Override
    public void updateSchool(SchoolDto schoolDto) {
        schoolRepository.save(modelMapper.map(schoolDto, SchoolEntity.class));
    }

    @Override
    public void deleteSchool(Integer id) {
        schoolRepository.deleteById(id);
    }

    @Override
    public SchoolDto searchSchool(Integer id) {
        SchoolEntity schoolEntity = schoolRepository.findById(id).get();
        SchoolDto schoolDto = modelMapper.map(schoolEntity, SchoolDto.class);
        return schoolDto;
    }

    @Override
    public List<SchoolDto> searchAll() {
       List<SchoolEntity> allSchool = schoolRepository.findAll();
       List<SchoolDto> schoolDtoArray = new ArrayList<>();

       allSchool.forEach( schoolEntity -> {
            SchoolDto schoolDto = modelMapper.map(schoolEntity, SchoolDto.class);
            schoolDtoArray.add(schoolDto);
       });
        return schoolDtoArray;
    }
}
