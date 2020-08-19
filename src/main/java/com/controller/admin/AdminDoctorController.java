package com.controller.admin;

import com.pojo.Doctor;
import com.service.IDoctorService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class AdminDoctorController {
    @Resource
    private IDoctorService iDoctorService;
    @RequestMapping("/doctors")
    public List<Doctor> findAllDoctors(){
        return iDoctorService.getAllDoctors();
    }
    @RequestMapping("/doctor{id}")
    public Doctor findById(@PathVariable int id){
        Doctor doctor = iDoctorService.getDoctorById(id);
        if(doctor != null){
            return doctor;
        }
        return null;
    }
}
