package edu.icet.service.impl;

import edu.icet.service.StudentService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

public class StudentServiceV1 implements StudentService {

    public String getName(){
        return "Upendra";
    }

    public String getVersion(){
        return "V1.0.0";
    }
}
