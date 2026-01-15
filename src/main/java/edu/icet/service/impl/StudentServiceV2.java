package edu.icet.service.impl;

import edu.icet.service.StudentService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceV2 implements StudentService {
    public String getName(){
        return "New Version";
    }

    public String getVersion(){
        return "v2.0.0";
    }
}
