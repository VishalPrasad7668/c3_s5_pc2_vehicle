package com.vehicles;

public class Car extends VehicleManufacturer implements Vehicle {
    private String sportsCar;
    private String sedan;

    public Car(String vehicleName, String vehicleModelName, String vehicleType) {
        super(vehicleName, vehicleModelName, vehicleType);
    }

    @Override
    public int maxSpeed(String vehicleType) {
        if (vehicleType.equals(sportsCar)) {
            return 250;
        } else if (vehicleType.equals(sedan)) {

        }
        return 170;
    }

    @Override
    public String getManufacturerInformation() {

        return "Manufacturer Name : " + getVehicleName() + ", Model Name : " + getVehicleModelName() + ", Type : " + getVehicleType();
    }
}
