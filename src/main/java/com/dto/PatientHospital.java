package com.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class PatientHospital {
    @Id
    private int id;
    private String floor;
    private String bed;
    private String door;
    private String name;
    private String medical_name;
    private Date intime;
    private Date outtime;
}
