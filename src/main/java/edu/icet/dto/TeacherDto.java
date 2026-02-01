package edu.icet.dto;

import edu.icet.senum.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TeacherDto{
    private Integer teacherId;
    private Integer userId;
    private Integer schoolId;
    private String title;
    private String name;
    private Gender gender;
    private String subjectStream;
    private String qualification;
    private Date joiningDate;
}
