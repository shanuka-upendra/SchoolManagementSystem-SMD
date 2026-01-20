package edu.icet.controller;

import edu.icet.dto.SubjectDto;
import edu.icet.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SubjectController {

    final SubjectService subjectService;

    @GetMapping("/get-subject-name")
    public String getSubjectName(){
        return "Enterprice Eng.";
    }

    @PostMapping("/add-subject")
    public void addSubject(@RequestBody SubjectDto subjectDto){
        subjectService.addSubject(subjectDto);
    }

    @PutMapping("/put-mapping")
    public void updateSubject(@RequestBody SubjectDto subjectDto){
        subjectService.updateSubject(subjectDto);
    }

    @DeleteMapping("/delete-subject/{id}")
    public void deleteSubject(@PathVariable Integer id){
        subjectService.deleteSubject(id);
    }

    @GetMapping("/search-subject/{id}")
    public SubjectDto searchSubjectById(@PathVariable Integer id){
        return subjectService.searchSubjectById(id);
    }

    @GetMapping
    public List<SubjectDto> searchAll(){
        return subjectService.searchAll();
    }
}
