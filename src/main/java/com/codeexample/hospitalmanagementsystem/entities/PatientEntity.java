package com.codeexample.hospitalmanagementsystem.entities;


import com.codeexample.hospitalmanagementsystem.entities.type.PatientBloodGroup;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
public class PatientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String email;

    private Integer age;

    @Enumerated(value = EnumType.STRING)
    // Only Assigns String values in the table.
    private PatientBloodGroup bloodGroup;

    @CreationTimestamp
    private LocalDateTime createdDate;






}
