package com.example.Project1.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Carrier {

    @Id
    private String carrier_code;
    @Column
    private String name;


    public String getCarrier_code() {
        return carrier_code;
    }
    public void setCarrier_code(String carrier_code) {
        this.carrier_code = carrier_code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
  

    
}
