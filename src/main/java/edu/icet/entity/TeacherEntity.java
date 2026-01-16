package edu.icet.entity;

import edu.icet.gender.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "teacher_table")
public class TeacherEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer teacherId;
    private String title;
    private String name;
    private Gender gender;
    private String subjectStream;
}
