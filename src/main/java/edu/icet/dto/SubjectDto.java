package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SubjectDto {
    private Integer subjectId;
    private String subjectCode;
    private String subjectName;
    private String stream;
    private Integer credits;
    private String description;
    private Boolean isActive;
}
