package com.company.transportTest;

public class Vehicle {
    private String brand = "Hyundai";
    private int wheels = 4;

    public Vehicle(int wheels, String brand) {
        this.brand = brand;
        this.wheels = wheels;
    }

    public Vehicle() {
    }

    public void honk(String honk) {
        System.out.println("Honk: " + honk);
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "brand='" + brand + '\'' +
                ", wheels=" + wheels;
    }
}
