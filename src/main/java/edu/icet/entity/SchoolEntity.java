package edu.icet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class SchoolEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String regitrationNumber;
    private String address;
    private String contactEmail;
    private Integer contactPhone;
    private String logourl;
}
