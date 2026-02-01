package edu.icet.dto;

import edu.icet.senum.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SchoolDto {
    private Integer id;
    private String name;
    private String code;
    private String address;
    private String contactEmail;
    private Integer contactPhone;
    private String logoUrl;
    private Status status;
}
