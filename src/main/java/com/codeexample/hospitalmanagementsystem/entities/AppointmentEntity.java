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
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private PatientEntity patientEntity;
    /* We only need to define the Appointment -> Patient Relationship here,
    One to Many Relationship cannot exist in a database from owning side, instead a Many to one
    Relatonship Exists from the inverse side.
     */
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private DoctorEntity doctorEntity;


}


