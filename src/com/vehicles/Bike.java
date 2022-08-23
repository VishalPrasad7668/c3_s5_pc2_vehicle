package com.vehicles;

public class Bike extends VehicleManufacturer implements Vehicle {

    public Bike(String vehicleName, String vehicleModelName, String vehicleType) {
        super(vehicleName, vehicleModelName, vehicleType);
    }


    @Override
    public int maxSpeed(String vehicleType) {
        if (getVehicleType().equals("sportsBike")) {
            return 300;
        } else if (getVehicleType().equals("cruiser")) {

        }
        return 170;
    }

    @Override
    public String getManufacturerInformation() {
        //System.out.println("Vehicle Name " + getVehicleName());
        return "Manufacturer Name : " + getVehicleName() + ", Model Name : " + getVehicleModelName() + ", Type : " + getVehicleType();

    }
}
