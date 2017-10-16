package com.rgcs_motors.RGCS_Service_Management.domain;

import javax.persistence.*;

@Entity
@Table(name = "vehicles")
public class Vehicle {

    @Id
    @Column(nullable = false, name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false, name = "brand")
    private String brand;

    @Column(nullable = false, name = "model")
    private String model;

    @Column(nullable = false, name = "license_plate", unique = true)
    private String licensePlates;

    @Column(nullable = false, name = "production_year")
    private String factoryDate;

    @Column(nullable = false, name = "color")
    private String colour;

    @Column(nullable = false, name = "vat")
    private String afm;

    public Vehicle() {
    }

    public Vehicle(String brand, String model, String licensePlates, String factoryDate, String colour, String afm) {
        this.brand = brand;
        this.model = model;
        this.licensePlates = licensePlates;
        this.factoryDate = factoryDate;
        this.colour = colour;
        this.afm = afm;
    }

    public String getAfm() {
        return afm;
    }

    public void setAfm(String afm) {
        this.afm = afm;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlates() {
        return licensePlates;
    }

    public void setLicensePlates(String licensePlates) {
        this.licensePlates = licensePlates;
    }

    public String getFactoryDate() {
        return factoryDate;
    }

    public void setFactoryDate(String factoryDate) {
        this.factoryDate = factoryDate;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getId() {
        return id;
    }
}
