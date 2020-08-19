package com.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Patient {
    @Id
    private int id;
    private String name;
    private int age;
    private String cert_id;
    private int sex;
    private String address;
    private int hospitalization_id;
    private String drugsids;
    private int isout;
    private int appointment_id;
    private int user_id;
}
