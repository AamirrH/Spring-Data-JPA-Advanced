package com.codeexample.hospitalmanagementsystem.entities;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DoctorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long doctor_id;
    @Column(nullable = false)
    private String doctor_name;
    @Column(nullable = false)
    private String specialization;
    @Column(nullable = false)
    private String email;
    @CreationTimestamp
    private LocalDateTime createdAt;

    @OneToOne
    private DepartmentEntity headOfDepartment;
    @OneToMany(mappedBy = "doctorEntity")
    private Set<AppointmentEntity> appointmentEntities = new HashSet<>();


}
