package com.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Drugs {
    @Id
    private int id;
    private String name;
    private int type;
    private double price;
    private int number;
    private String text;
}
