package com.service;

import com.pojo.Hospitalization;

import java.util.List;

public interface IHospitalizationService {

    List<Hospitalization> getAllHospitalizations();

    void saveHospitalization(Hospitalization hospitalization);

    void deleteHispitalizationById(int id);

    List<Hospitalization> getHispitalizationByPatientId(int patient_id);
}
