package edu.icet.controller;

import edu.icet.dto.ClassDto;
import edu.icet.service.ClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ClassController {

    final ClassService classService;

    @PostMapping("/add-class")
    public void addClass(ClassDto classDto){
        classService.addClass(classDto);
    }

    @PostMapping("/update-class")
    public void updateClass(ClassDto classDto){
        classService.updateClass(classDto);
    }

    @DeleteMapping("/delete-class")
    public void deleteClass(Integer id){
        classService.deleteClass(id);
    }

    @GetMapping("/search-all")
    public ClassDto searchClassById(Integer id){
        return classService.searchClassById(id);
    }
}
