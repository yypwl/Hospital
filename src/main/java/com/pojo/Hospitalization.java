package com.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Hospitalization {
    @Id
    private int id;
    private String floor;
    private String bed;
    private String door;
    private String medical_name;
    @Column(name = "patient_id")
    private int patient_id;
    private Date intime;
    private Date outtime;
}
