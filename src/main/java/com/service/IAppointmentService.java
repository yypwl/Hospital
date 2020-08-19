package com.service;

import com.pojo.Appointment;

import java.util.List;

public interface IAppointmentService {

    void saveAppointment(Appointment appointment);

    void updateAppointment(Appointment appointment);

    void deleteAppointment(int id);
}
