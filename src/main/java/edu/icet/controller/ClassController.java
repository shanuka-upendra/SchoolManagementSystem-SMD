package edu.icet.controller;

import edu.icet.dto.ClassDto;
import edu.icet.service.ClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ClassController {

    final ClassService classService;

    @PostMapping("/add-class")
    public void addClass(@RequestBody ClassDto classDto){
        classService.addClass(classDto);
    }

    @PostMapping("/update-class")
    public void updateClass(@RequestBody ClassDto classDto){
        classService.updateClass(classDto);
    }

    @DeleteMapping("/delete-class/{id}")
    public void deleteClass(@PathVariable Integer id){
        classService.deleteClass(id);
    }

    @GetMapping("/search-all")
    public ClassDto searchClassById(@RequestBody Integer id){
        return classService.searchClassById(id);
    }
}
