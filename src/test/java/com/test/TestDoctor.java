package com.test;

import com.pojo.Doctor;
import com.service.IDoctorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.print.Doc;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDoctor {
    @Resource
    private IDoctorService iDoctorService;
    @Test
    public void testGetAllDoctors(){
        for(Doctor doctor : iDoctorService.getAllDoctors()){
            System.out.println(doctor);
        }
    }
    @Test
    public void testSaveDoctor(){
        Doctor doctor = new Doctor();
        doctor.setId(8);
        doctor.setName("李嘉欣");
        doctor.setSex(1);
        doctor.setAge(28);
        doctor.setCert_id("safahaifaifaif");
        doctor.setDepartment("妇产科");
        doctor.setExpert(2);
        doctor.setAddress("南窑头立人科技");
        doctor.setExpert(1);
        doctor.setUser_id(2);
        doctor.setText("适当放宽改革");
        iDoctorService.saveDoctor(doctor);
    }
    @Test
    public void testDeleteDoctor(){
        iDoctorService.deleteDoctorById(10);
    }
    @Test
    public void testGetAllDoctorBydepartment(){
        for(Doctor doctor : iDoctorService.getAllDoctorsByDepartment("内科")){
            System.out.println(doctor);
        }
    }
    @Test
    public void testGetDoctorsByUserId(){
        System.out.println(iDoctorService.getDoctorByUserId(4));
    }
}
