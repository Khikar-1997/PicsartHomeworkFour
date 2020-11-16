package com.company.transports;

import com.company.transportTest.Vehicle;

public class Bicycle extends Vehicle {
    public int gear;
    public int speed;

    public Bicycle(int wheels, String brand, int gear, int speed) {
        super(wheels, brand);
        this.gear = gear;
        this.speed = speed;
    }

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public Bicycle() {
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public String toString() {
        return (super.toString() + ", No of gears are " + gear
                + "\n"
                + "speed of bicycle is " + speed);
    }
}