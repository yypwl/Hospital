package com.dao;

import com.dto.PatientHospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IPatientHospitalDao extends JpaRepository<PatientHospital,Integer> {

    @Query(value="select new com.dto.PatientHospital(h.id,p.name,h.floor,h.door,h.bed,h.medical_name,h.intime,h.outtime) from Hospitalization h inner join Patient p on h.patient_id = p.id")
    List<PatientHospital> getAllPatientHospitals();
}
