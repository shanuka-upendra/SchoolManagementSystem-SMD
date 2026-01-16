package edu.icet.dto;
import edu.icet.gender.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentDto {
    private Integer id;
    private Integer schoolId;
    private String name;
    private Integer age;
    private String grade;
    private String address;
    private Gender gender;
    private Integer phone;
}
