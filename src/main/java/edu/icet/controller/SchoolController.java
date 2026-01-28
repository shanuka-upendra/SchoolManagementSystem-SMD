package edu.icet.controller;

import edu.icet.dto.SchoolDto;
import edu.icet.service.SchoolService;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class SchoolController {

    final SchoolService schoolService;

    @PostMapping("/add-school")
    public void addSchool(@RequestBody SchoolDto schoolDto){
        schoolService.addSchool(schoolDto);
    }

    @PostMapping("/update-school")
    public void updateSchool(@RequestBody SchoolDto schoolDto){
        schoolService.updateSchool(schoolDto);
    }

    @DeleteMapping("/delete-school/{id}")
    public void deleteSchool(@PathVariable Integer id){
        schoolService.deleteSchool(id);
    }

    @GetMapping("/search-school/{id}")
    public SchoolDto searchSchool(@PathVariable Integer id){
        return schoolService.searchSchool(id);
    }

    @GetMapping("/search-all-school")
        public List<SchoolDto> searchAll(){
            return schoolService.searchAll();
    }
}
