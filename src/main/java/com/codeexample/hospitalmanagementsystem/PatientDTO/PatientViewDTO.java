package com.codeexample.hospitalmanagementsystem.PatientDTO;

import com.codeexample.hospitalmanagementsystem.entities.type.PatientBloodGroup;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class PatientViewDTO {

    private String p_name;

    private Integer p_age;

    private PatientBloodGroup p_bloodGroup;

    public PatientViewDTO(String p_name, Integer p_age, PatientBloodGroup p_bloodGroup) {
        this.p_name = p_name;
        this.p_age = p_age;
        this.p_bloodGroup = p_bloodGroup;
    }

}
