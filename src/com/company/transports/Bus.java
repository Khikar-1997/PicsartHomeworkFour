package com.company.transports;

import com.company.transportTest.Vehicle;

public class Bus extends Vehicle {
    private boolean conductor;

    public Bus(int wheels, String brand, boolean conductor) {
        super(wheels, brand);
        this.conductor = conductor;
    }

    public Bus(boolean conductor) {
        this.conductor = conductor;
    }

    public Bus() {
    }

    public boolean isConductor() {
        return conductor;
    }

    public void setConductor(boolean conductor) {
        this.conductor = conductor;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", conductor=" + conductor;
    }
}