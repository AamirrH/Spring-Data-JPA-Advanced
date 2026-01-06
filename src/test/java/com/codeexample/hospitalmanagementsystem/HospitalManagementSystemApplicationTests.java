package com.codeexample.hospitalmanagementsystem;

import com.codeexample.hospitalmanagementsystem.PatientDTO.PatientView;
import com.codeexample.hospitalmanagementsystem.repository.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class HospitalManagementSystemApplicationTests {

    @Autowired
    private PatientRepository patientRepository;

    @Test
    void contextLoads() {
    }

    @Test
    public void findPatients(){
        List<PatientView> patients = patientRepository.getAllPatientInfo();
        for (PatientView p : patients) {
            System.out.println(
                    p.getName() + " | " +
                            p.getAge() + " | " +
                            p.getbloodGroup()
            );
        }

    }

    @Test
    public void updatePatientById(){
        int rowsAffected = patientRepository.updatePatient("Kumar Sanu",56);
        System.out.println("The number of rows affected by this Transactional Query are :- "+ rowsAffected);
    }


}
