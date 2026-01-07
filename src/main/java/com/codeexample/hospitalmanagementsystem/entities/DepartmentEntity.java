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
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DepartmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dept_id;
    @Column(nullable = false,length = 20)
    private String dept_name;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @OneToOne(mappedBy = "headOfDepartment")
    private DoctorEntity headdoctorEntity;

    @ManyToMany
    private Set<DoctorEntity> doctorEntity = new HashSet<>();
}
