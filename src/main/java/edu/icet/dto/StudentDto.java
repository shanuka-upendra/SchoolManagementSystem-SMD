package edu.icet.dto;
import edu.icet.senum.Gender;
import edu.icet.senum.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentDto {
    private Integer studentId;
    private Integer userId;
    private Integer schoolId;
    private String admissionNumber;
    private Date admissionDate;
    private Integer currentClass;
    private Date DOB;
    private Gender gender;
    private Status status;
}
