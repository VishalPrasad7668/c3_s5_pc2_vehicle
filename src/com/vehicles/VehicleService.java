package com.vehicles;

public class VehicleService {
    public static void main(String[] args) {
        Bike bike = new Bike("Royal Enfield", "Classic 350", "sportsBike");
        System.out.println("Bike Type is " + bike.getVehicleType() + " its speed is " + bike.maxSpeed(bike.getVehicleType()));
        System.out.println(bike.getManufacturerInformation());
        System.out.println();

        Car car = new Car("Skoda", "Slavia", "Sedan");
        System.out.println("Car Type is " + bike.getVehicleType() + " its speed is " + car.maxSpeed(car.getVehicleType()));
        System.out.println(car.getManufacturerInformation());
    }
}
