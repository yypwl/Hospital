package com.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Doctor {
    @Id
    private int id;
    private String name;
    private int age;
    private String cert_id;
    private int sex;
    private String department;
    private String address;
    private int user_id;
    private String text;
    private int expert;
}
