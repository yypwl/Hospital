package com.service.impl;

import com.dao.IPatientHospitalDao;
import com.dto.PatientHospital;
import com.service.IPatientHospitalService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class IPatientHospitalServiceImpl implements IPatientHospitalService {
    @Resource
    private IPatientHospitalDao iPatientHospitalDao;
    @Override
    public List<PatientHospital> getAllPatientHospitals() {
        return iPatientHospitalDao.getAllPatientHospitals();
    }
}
