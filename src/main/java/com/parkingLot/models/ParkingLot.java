package main.java.com.parkingLot.models;

import main.java.com.parkingLot.models.enums.ParkingLotStatus;
import main.java.com.parkingLot.models.enums.VehicleType;
import main.java.com.parkingLot.service.strategy.billCalculationStrategy.BillCalculationStrategy;
import main.java.com.parkingLot.service.strategy.spotAllocationStrategy.SpotAllocationStrategy;

import java.util.List;

public class ParkingLot extends BaseModel{
    private String name;
    private String address;
    private int capacity;
    private ParkingLotStatus parkingLotStatus;
    private List<VehicleType> vehicleTypes;
    private List<ParkingFloor> parkingFloors;
    private SpotAllocationStrategy spotAllocationStrategy;
    private BillCalculationStrategy billCalculationStrategy;

    public ParkingLot() {
    }

    public ParkingLot(String name, String address, int capacity, ParkingLotStatus parkingLotStatus, List<VehicleType> vehicleTypes, List<ParkingFloor> parkingFloors, SpotAllocationStrategy spotAllocationStrategy, BillCalculationStrategy billCalculationStrategy) {
        this.name = name;
        this.address = address;
        this.capacity = capacity;
        this.parkingLotStatus = parkingLotStatus;
        this.vehicleTypes = vehicleTypes;
        this.parkingFloors = parkingFloors;
        this.spotAllocationStrategy = spotAllocationStrategy;
        this.billCalculationStrategy = billCalculationStrategy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public List<VehicleType> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<VehicleType> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public SpotAllocationStrategy getSpotAllocationStrategy() {
        return spotAllocationStrategy;
    }

    public void setSpotAllocationStrategy(SpotAllocationStrategy spotAllocationStrategy) {
        this.spotAllocationStrategy = spotAllocationStrategy;
    }

    public BillCalculationStrategy getBillCalculationStrategy() {
        return billCalculationStrategy;
    }

    public void setBillCalculationStrategy(BillCalculationStrategy billCalculationStrategy) {
        this.billCalculationStrategy = billCalculationStrategy;
    }
}

