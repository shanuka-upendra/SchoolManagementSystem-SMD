package edu.icet.controller;

import edu.icet.dto.StudentDto;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {


    final StudentService studentService;

    @GetMapping("/get-name")
    public String getName(){
        return studentService.getName();
    }

    @GetMapping("/get-version")
    public String getVersion(){
        return studentService.getVersion();
    }

    @PostMapping("/add-student")
    public void addStudent(@RequestBody StudentDto studentDto){
        studentService.addStudent(studentDto);
    }

    @PutMapping("/update-student")
    public void updateStudent(@RequestBody StudentDto studentDto){
        studentService.updateStudent(studentDto);
    }

    @DeleteMapping("/delete-student/{id}")
    public void deleteStudent(@PathVariable Integer id){
        studentService.deleteStudent(id);
    }

    @GetMapping("/search-all")
    public List<StudentDto> searchAll(){
        return studentService.searchAll();
    }

    @GetMapping("/search-student/{id}")
    public StudentDto searchStudent(@PathVariable Integer id){
        return studentService.searchStudent(id);
    }
}
