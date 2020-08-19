package com.test;

import com.pojo.Hospitalization;
import com.service.IHospitalizationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestHospitalization {
    @Resource
    private IHospitalizationService iHospitalizationService;
    @Test
    public void testGetAll(){
        for(Hospitalization hospitalization : iHospitalizationService.getAllHospitalizations()){
            System.out.println(hospitalization);
        }
    }
    @Test
    public void testGetHospitalizationByPatientId(){
        for(Hospitalization hospitalization : iHospitalizationService.getHispitalizationByPatientId(3)){
            System.out.println(hospitalization);
        }
    }
}
