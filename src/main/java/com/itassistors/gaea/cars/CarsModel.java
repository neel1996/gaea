package com.itassistors.gaea.cars;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.itassistors.gaea")
public class CarsModel {
    private String name;
    private String year;
    private String fuelType;
    private String transmission;
    private int seats;

    public CarsModel(String name, String year, String fuelType, String transmission, int seats) {
        this.name = name;
        this.year = year;
        this.fuelType = fuelType;
        this.transmission = transmission;
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
