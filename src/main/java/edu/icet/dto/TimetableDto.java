package edu.icet.dto;

import edu.icet.senum.DaysOfWeek;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TimetableDto {
    private Integer id;
    private Integer classId;
    private DaysOfWeek dayOfWeek;
    private Integer timeslotId;
    private Integer classSubjectId;
}
