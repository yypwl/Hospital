package com.dao;

import com.pojo.Hospitalization;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IHospitalizationDao extends JpaRepository<Hospitalization,Integer> {

    void deleteHospitalizationById(int id);
    @Query(value = "select * from Hospitalization where patient_id = :patient_id",nativeQuery = true)
    List<Hospitalization> findHospitalizationByPatient_id(@Param("patient_id") int patient_id);
}
