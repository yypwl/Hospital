package com.dao;

import com.dto.MHPatiDoctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IMHPatiDoctorDao extends JpaRepository<MHPatiDoctor,Integer> {
    @Query(value="select new com.dto.MHPatiDoctor(mh.id,p.name,mh.name,mh.time,d.name) from MedicalHistory mh inner join Doctor d on mh.doctor_id = d.id inner join Patient p on mh.patient_id = p.id")
    List<MHPatiDoctor> getAllMHPatiDoctors();
}
