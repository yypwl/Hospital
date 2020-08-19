package com.service.impl;

import com.dao.IHospitalizationDao;
import com.pojo.Hospitalization;
import com.service.IHospitalizationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class IHospitalizationServiceImpl implements IHospitalizationService {
    @Resource
    private IHospitalizationDao iHospitalizationDao;
    @Override
    public List<Hospitalization> getAllHospitalizations() {
        return iHospitalizationDao.findAll();
    }

    @Override
    public void saveHospitalization(Hospitalization hospitalization) {
        iHospitalizationDao.saveAndFlush(hospitalization);
    }

    @Override
    public void deleteHispitalizationById(int id) {
        iHospitalizationDao.deleteHospitalizationById(id);
    }

    @Override
    public List<Hospitalization> getHispitalizationByPatientId(int patient_id) {
        return iHospitalizationDao.findHospitalizationByPatient_id(patient_id);
    }
}
