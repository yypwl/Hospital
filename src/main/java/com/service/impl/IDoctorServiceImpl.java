package com.service.impl;

import com.dao.IDoctorDao;
import com.pojo.Doctor;
import com.service.IDoctorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IDoctorServiceImpl implements IDoctorService {
    @Resource
    private IDoctorDao iDoctorDao;
    @Override
    public List<Doctor> getAllDoctors() {
        return iDoctorDao.findAll();
    }

    @Override
    public void saveDoctor(Doctor doctor) {
        iDoctorDao.saveAndFlush(doctor);
    }

    @Override
    public void updateDoctor(Doctor doctor) {
        iDoctorDao.saveAndFlush(doctor);
    }

    @Override
    public Doctor getDoctorById(int id) {
        return iDoctorDao.findById(id);
    }

    @Override
    public void deleteDoctorById(int id) {
        iDoctorDao.deleteById(id);
    }

    @Override
    public List<Doctor> getAllDoctorsByDepartment(String department) {
        return iDoctorDao.findAllByDepartment(department);
    }

    @Override
    public Doctor getDoctorByUserId(int user_id) {
        return iDoctorDao.findDoctorByUser_id(user_id);
    }
}
