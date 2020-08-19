package com.test;

import com.dto.PatientHospital;
import com.service.IPatientHospitalService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestPatientHospital {
    @Resource
    private IPatientHospitalService iPatientHospitalService;
    @Test
    public void testGetAll(){
        for(PatientHospital patientHospital : iPatientHospitalService.getAllPatientHospitals()){
            System.out.println(patientHospital);
        }
    }
}
