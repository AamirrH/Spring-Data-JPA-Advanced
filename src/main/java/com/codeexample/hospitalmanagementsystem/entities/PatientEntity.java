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
    /* EnumType.STRING -> assign String Enum values like (O_POSITIVE,A_NEGATIVE)
    and insert into database.
    EnumType.ORDINAL -> assign corresponding ordinal values of enum subjects such as
    O_POSITIVE,   // 0
    O_NEGATIVE,   // 1
    A_POSITIVE,   // 2
    A_NEGATIVE,   // 3
    AB_POSITIVE,  // 4
    AB_NEGATIVE,  // 5
    B_POSITIVE,   // 6
    B_NEGATIVE    // 7
    and then insert ordinal values into the database. */
    private PatientBloodGroup bloodGroup;

    @CreationTimestamp
    private LocalDateTime createdDate;

    /* Projection -> When a user tries to get the list of all patients they should only get,
    name, age and gender and blood-group fields, fields such as creationDate, id , Email are
    useless for them.
     */

    @OneToOne
    @JoinColumn(name = "patient_insurance", unique = true)
    private InsuranceEntity insuranceEntity;





}
