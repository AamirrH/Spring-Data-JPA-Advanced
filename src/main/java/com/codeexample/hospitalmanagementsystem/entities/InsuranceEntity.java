package com.codeexample.hospitalmanagementsystem.entities;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class InsuranceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 50)
    private String policyNumber;

    @Column(nullable = false, length = 100)
    private String provider;

    @Column(nullable = false)
    private LocalDate validUntil;

    @CreationTimestamp
    @Column(nullable = false,updatable = false)
    private LocalDateTime createdAt;

    @OneToOne(mappedBy = "insuranceEntity")
    private PatientEntity patient;
    /* This mappedBy basically prevents from creating another patient id
    column in the Insurance-Table, because it has already been taken care of
    in the Patient Table by using the Insurance id as a Foreign Key.
     */

}
