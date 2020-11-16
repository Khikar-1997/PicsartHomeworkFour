package com.company.transports;

import com.company.transportTest.Vehicle;

public class Truck extends Vehicle {
    public Truck(int wheels, String brand) {
        super(wheels, brand);
    }

    public Truck() {
    }

    public void carry(int tonnage) {
        System.out.println("Our truck can carry up to " + tonnage + " tons of cargo.");
    }
}