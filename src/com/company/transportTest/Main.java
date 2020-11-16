package com.company.transportTest;

import com.company.transports.Bicycle;
import com.company.transports.Bus;
import com.company.transports.Car;
import com.company.transports.Truck;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(4,"Opel");
        System.out.println(vehicle.toString());
        Car car = new Car(4,"Mercedes","E-240");
        System.out.println(car.toString());
        car.honk("Pi-b-ip");
        Bus bus = new Bus(true);
        if (bus.isConductor()){
            System.out.println(bus.toString());
            bus.honk("tn-tn-tng");
        } else {
            bus.setBrand("Mercedes");
            bus.setWheels(6);
            System.out.println(bus.toString());
            bus.honk("tu-tu-tu");
        }
        Bicycle bicycle = new Bicycle(5,100);
        System.out.println(bicycle.toString());
        bicycle.honk("cing-cing");
        Truck truck = new Truck();
        truck.carry(1000);
        truck.honk("t-t-t-t-t-tu");
    }
}
