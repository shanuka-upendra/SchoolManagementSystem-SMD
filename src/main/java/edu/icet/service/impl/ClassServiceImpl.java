package edu.icet.service.impl;

import edu.icet.dto.ClassDto;
import edu.icet.dto.SchoolDto;
import edu.icet.entity.ClassEntity;
import edu.icet.entity.SchoolEntity;
import edu.icet.repository.ClassRepository;
import edu.icet.service.ClassService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ClassServiceImpl implements ClassService {

    final ClassRepository repository;

    final ModelMapper mapper;

    @Override
    public void addClass(ClassDto classDto) {
        repository.save(mapper.map(classDto, ClassEntity.class));
    }

    @Override
    public void updateClass(ClassDto classDto) {
        repository.save(mapper.map(classDto, ClassEntity.class));
    }

    @Override
    public void deleteClass(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<ClassDto> getAll() {
        List<ClassEntity> all = repository.findAll();
        List<ClassDto> dtoList = new ArrayList<>();

        all.forEach(classEntity -> {
            dtoList.add(mapper.map(classEntity,ClassDto.class));
        });
        return dtoList;
    }

    @Override
    public ClassDto searchClassById(Integer id) {
        ClassEntity classEntity = repository.findById(id).get();
        ClassDto classDto = mapper.map(classEntity,ClassDto.class);
        return classDto;
    }
}
