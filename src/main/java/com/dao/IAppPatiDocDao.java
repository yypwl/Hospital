package com.dao;

import com.dto.AppPatiDoc;
import com.pojo.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.io.Serializable;
import java.util.List;

public interface IAppPatiDocDao extends JpaRepository<AppPatiDoc, Serializable> {

    @Query(value="select new com.dto.AppPatiDoc( a.id,p.name,d.name,a.time,a.expenses,a.status) from Patient p inner join Appointment a on a.patient_id = p.id inner join Doctor d on a.doctor_id = d.id")
    List<AppPatiDoc> getAllAppointments();
}
