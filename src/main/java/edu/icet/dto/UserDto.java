package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDto {
    private Integer id;
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String role;
    private boolean isActive;
}
