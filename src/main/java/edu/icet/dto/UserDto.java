package edu.icet.dto;

import edu.icet.senum.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDto {
    private Integer id;
    private String schoolId;
    private String roleId;
    private String username;
    private String password;
    private String email;
    private String phone;
    private Status status;
    private LocalDateTime lastLogin;
    private LocalDateTime createdAt;
}
