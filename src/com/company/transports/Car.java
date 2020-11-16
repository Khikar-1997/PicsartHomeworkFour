package com.company.transports;

import com.company.transportTest.Vehicle;

public class Car extends Vehicle {
    private String modelName;

    public Car(int wheels, String brand, String modelName) {
        super(wheels, brand);
        this.modelName = modelName;
    }

    public Car(String modelName) {
        this.modelName = modelName;
    }

    public Car() {
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", modelName='" + modelName + '\'';
    }
}
