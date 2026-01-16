package edu.icet.controller;

import edu.icet.dto.TeacherDto;
import edu.icet.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TeacherController {

    final TeacherService teacherService;

    @PostMapping("/add-teacher")
     public void addTeacher(@RequestBody TeacherDto teacherDto){
         teacherService.addTeacher(teacherDto);

     }

     @PutMapping("/update-teacher")
     public void updateTeacher(@RequestBody TeacherDto teacherDto){
         teacherService.updateTeacher(teacherDto);

     }

     @DeleteMapping("/delete-teacher/{id}")
     public void deleteTeacher(@PathVariable Integer id){
         teacherService.deleteTeacher(id);

     }

     @GetMapping("/search-teacher/{id}")
     public TeacherDto searchTeacherById(@PathVariable Integer id){
         return teacherService.searchTeacherById(id);
     }

     @GetMapping("search-all-teachers")
     public List<TeacherDto> searchAll(){
         return teacherService.searchAll();
     }
}

