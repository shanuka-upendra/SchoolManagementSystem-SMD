package edu.icet.entity;
import edu.icet.senum.Gender;
import edu.icet.senum.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "student_table")
public class StudentEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
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
