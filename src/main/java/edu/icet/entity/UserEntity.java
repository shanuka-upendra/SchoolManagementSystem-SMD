package edu.icet.entity;

import edu.icet.senum.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class UserEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
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
