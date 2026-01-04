package com.codeexample.hospitalmanagementsystem.repository;

import com.codeexample.hospitalmanagementsystem.entities.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PatientRepository extends JpaRepository<PatientEntity,Integer> {

}
