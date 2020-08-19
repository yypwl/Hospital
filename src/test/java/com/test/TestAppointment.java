package com.test;

import com.dao.IAppointmentDao;
import com.pojo.Appointment;
import com.service.IAppointmentService;
import com.utils.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestAppointment {
    @Resource
    private IAppointmentService iAppointmentService;
    @Test
    public void testSave(){
        Appointment appointment = new Appointment();
        appointment.setId(17);
        appointment.setPatient_id(2);
        appointment.setDoctor_id(1);
        appointment.setExpenses(10);
        appointment.setStatus(1);
        appointment.setTime(DateUtil.str2Date("2020-08-20"));

        iAppointmentService.saveAppointment(appointment);
    }
    @Test
    public void testDelete(){
        iAppointmentService.deleteAppointment(17);
    }
}
