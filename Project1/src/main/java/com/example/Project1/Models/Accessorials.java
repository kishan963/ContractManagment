package com.example.Project1.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Accessorials {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String description;
    @Column
    private int charges;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getCharges() {
        return charges;
    }
    public void setCharges(int charges) {
        this.charges = charges;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    
    
}
