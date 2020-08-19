package com.service;

import com.pojo.Doctor;

import java.util.List;

public interface IDoctorService {

    List<Doctor> getAllDoctors();

    void saveDoctor(Doctor doctor);

    void updateDoctor(Doctor doctor);

    Doctor getDoctorById(int id);

    void deleteDoctorById(int id);

    List<Doctor> getAllDoctorsByDepartment(String department);

    Doctor getDoctorByUserId(int user_id);

}
