package com.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AppPatiDoc {
    @Id
    private int id;
    private String pname;
    private String name;
    private Date time;
    private double expenses;
    private int status;
}
