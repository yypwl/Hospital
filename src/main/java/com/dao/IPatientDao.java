package com.dao;

import com.pojo.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPatientDao extends JpaRepository<Patient,Integer> {
}
