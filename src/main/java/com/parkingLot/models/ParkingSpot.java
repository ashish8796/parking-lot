package main.java.com.parkingLot.models;

import main.java.com.parkingLot.models.enums.ParkingSpotStatus;
import main.java.com.parkingLot.models.enums.VehicleType;

public class ParkingSpot extends BaseModel{
    private int number;
    private Vehicle vehicle;

    private ParkingSpotStatus parkingSpotStatus;
    private VehicleType vehicleType;

    public ParkingSpot() {
    }

    public ParkingSpot(int number, Vehicle vehicle, ParkingSpotStatus parkingSpotStatus, VehicleType vehicleType) {
        this.number = number;
        this.vehicle = vehicle;
        this.parkingSpotStatus = parkingSpotStatus;
        this.vehicleType = vehicleType;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
