package com.example.Project1.Models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Routes {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(cascade = CascadeType.ALL)
    private Carrier carrier;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Accessorials> accessorials;
    @OneToOne(cascade = CascadeType.ALL)
    private Rates rates;
    @Column
    private int carrier_rank;
    @Column
    private String origin;
    @Column
    private String destination;
    @Column
    private String mode;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public int getCarrier_rank() {
        return carrier_rank;
    }
    public void setCarrier_rank(int carrier_rank) {
        this.carrier_rank = carrier_rank;
    }
    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public String getMode() {
        return mode;
    }
    public void setMode(String mode) {
        this.mode = mode;
    }
    public Carrier getCarrier() {
        return carrier;
    }
    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }
    public List<Accessorials> getAccessorials() {
        return accessorials;
    }
    public void setAccessorials(List<Accessorials> accessorials) {
        this.accessorials = accessorials;
    }
    
    public Rates getRates() {
        return rates;
    }
    public void setRates(Rates rates) {
        this.rates = rates;
    }
    
    
}
