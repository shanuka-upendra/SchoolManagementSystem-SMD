package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ClassDto {
    private String className;
    private String grade;
    private Integer capacity;
    private Long teacherId;
    private Long subjectId;
    private Long studentId;
}
