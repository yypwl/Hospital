package com.dao;

import com.dto.AppPatiDoc;
import com.pojo.Appointment;
import javafx.application.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IAppointmentDao extends JpaRepository<Appointment,Integer> {

    void deleteById(int id);
}
