package main.java.com.parkingLot.models;

import main.java.com.parkingLot.models.enums.VehicleType;

import java.time.LocalDateTime;

public class Vehicle extends BaseModel {
    private String vehicleNumber;
    private String color;
    private VehicleType vehicleType;

    public Vehicle() {
    }

    public Vehicle(String vehicleNumber, String color, VehicleType vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.color = color;
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
