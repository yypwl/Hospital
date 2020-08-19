package com.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Seek {
    @Id
    private int id;
    private String describes;
    private String illname;
    private String grugs;
    private String options;
    private String days;
    private double price;
    private int patient_id;
    private int appointment_id;
}
