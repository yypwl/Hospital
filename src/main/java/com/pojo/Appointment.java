package com.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Appointment {
    @Id
    private int id;
    private int patient_id;
    private int doctor_id;
    private Date time;
    private double expenses;
    private int status;
}
