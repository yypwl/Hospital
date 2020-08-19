package com.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Illness {
    @Id
    private int id;
    private String name;
    private String text;
}
