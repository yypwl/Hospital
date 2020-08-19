package com.dao;

import com.pojo.MedicalHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMedicalHistoryDao extends JpaRepository<MedicalHistory,Integer> {
}
