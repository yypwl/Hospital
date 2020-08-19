package com.dao;

import com.pojo.Seek;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ISeekDao extends JpaRepository<Seek,Integer> {
    @Query(value = "select * from Seek where patient_id = :patient_id",nativeQuery = true)
    List<Seek> findSeekByPatient_id(int patient_id);
}
