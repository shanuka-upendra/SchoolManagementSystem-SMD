package edu.icet.service.impl;

import edu.icet.dto.SubjectDto;
import edu.icet.entity.SubjectEntity;
import edu.icet.repository.SubjectRepository;
import edu.icet.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {

    final SubjectRepository subjectRepository;

    final ModelMapper modelMapper;


    @Override
    public void addSubject(SubjectDto subjectDto) {
        SubjectEntity subjectEntity = modelMapper.map(subjectDto,SubjectEntity.class);
        subjectRepository.save(subjectEntity);
    }

    @Override
    public void updateSubject(SubjectDto subjectDto) {
        SubjectEntity subjectEntity = modelMapper.map(subjectDto,SubjectEntity.class);
        subjectRepository.save(subjectEntity);
    }

    @Override
    public void deleteSubject(Integer id) {
        subjectRepository.deleteById(id);
    }

    @Override
    public SubjectDto searchSubjectById(Integer id) {
        SubjectEntity subjectEntity = subjectRepository.findById(id).get();
        SubjectDto subjectDto = modelMapper.map(subjectEntity,SubjectDto.class);
        return subjectDto;
    }

    @Override
    public List<SubjectDto> searchAll() {
        List<SubjectEntity> all = subjectRepository.findAll();
        List<SubjectDto> subjectDtoList = new ArrayList<>();

        all.forEach(subjectEntity -> {
            SubjectDto subjectDto = modelMapper.map(subjectEntity,SubjectDto.class);
            subjectDtoList.add(subjectDto);
        });
        return subjectDtoList;
    }
}

