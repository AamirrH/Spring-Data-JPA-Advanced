package com.codeexample.hospitalmanagementsystem.repository;

import com.codeexample.hospitalmanagementsystem.PatientDTO.PatientView;
import com.codeexample.hospitalmanagementsystem.PatientDTO.PatientViewDTO;
import com.codeexample.hospitalmanagementsystem.entities.PatientEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PatientRepository extends JpaRepository<PatientEntity,Integer> {

    /* Using the DTO method, Creating a DTO with the fields we want to be shown instead of unnecessary data and then
    copying the path reference making a new object of that DTO.
     */
    @Query("select new com.codeexample.hospitalmanagementsystem.PatientDTO.PatientViewDTO(p1.name,p1.age,p1.bloodGroup) from PatientEntity p1")
    List<PatientViewDTO> findAllPartial();

    /* Using the Interface method with a normal SQL query, but the return type should be the interface so that a
    dynamic proxy class can be made at runtime and then this class will implement this interface and define all of
    its methods and proxy objects will get created at runtime.
     */
    @Query("select p1.name as name,p1.age as age,p1.bloodGroup as bloodGroup from PatientEntity p1")
    List<PatientView> getAllPatientInfo();

    @Transactional
    @Modifying
    @Query("UPDATE PatientEntity p set p.name = :name where p.age = :age ")
    int updatePatient(@Param("name") String name, @Param("age") Integer age);


}
