package com.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class MedicalHistory {
    @Id
    private int id;
    private int patient_id;
    private String name;
    private Date time;
    private int hospitalization_id;
    private int doctor_id;
}
