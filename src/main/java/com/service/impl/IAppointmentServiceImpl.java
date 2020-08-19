package com.service.impl;

import com.dao.IAppointmentDao;
import com.pojo.Appointment;
import com.service.IAppointmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class IAppointmentServiceImpl implements IAppointmentService {
    @Resource
    private IAppointmentDao iAppointmentDao;

    @Override
    public void saveAppointment(Appointment appointment) {
        iAppointmentDao.save(appointment);
    }

    @Override
    public void updateAppointment(Appointment appointment) {
        iAppointmentDao.saveAndFlush(appointment);
    }

    @Override
    public void deleteAppointment(int id) {
        iAppointmentDao.deleteById(id);
    }
}
