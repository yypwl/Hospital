package com.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Option {
    @Id
    private int id;
    private String name;
    private String type;
    private double price;
}
