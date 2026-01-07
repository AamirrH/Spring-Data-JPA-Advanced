package com.codeexample.hospitalmanagementsystem.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AppointmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appointment_id;
    @CreationTimestamp
    private LocalDateTime appointment_time;
    @Column(nullable = false,length = 100)
    private String reason;
    @Column(nullable = false,length = 20)
    private String status;

    private Long doctor_id;
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private PatientEntity patientEntity;


}


