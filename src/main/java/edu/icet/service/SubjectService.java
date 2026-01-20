package edu.icet.service;

import edu.icet.dto.SubjectDto;
import edu.icet.entity.SubjectEntity;
import edu.icet.repository.SubjectRepository;

import java.util.List;

public interface SubjectService {
    void addSubject(SubjectDto subjectDto);
    void updateSubject(SubjectDto subjectDto);
    void deleteSubject(Integer id);
    SubjectDto searchSubjectById(Integer id);
    List<SubjectDto> searchAll();
}
