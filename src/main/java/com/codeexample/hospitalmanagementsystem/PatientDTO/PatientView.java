package com.codeexample.hospitalmanagementsystem.PatientDTO;

import com.codeexample.hospitalmanagementsystem.entities.type.PatientBloodGroup;
import lombok.ToString;


public interface PatientView {

    String getName();
    Integer getAge();
    PatientBloodGroup getbloodGroup();

}
