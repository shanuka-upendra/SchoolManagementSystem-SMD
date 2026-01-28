package edu.icet.controller;

import edu.icet.dto.SchoolDto;
import edu.icet.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


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
}
