package main.java.com.parkingLot.models;

import main.java.com.parkingLot.models.enums.ParkingFloorStatus;

import java.util.List;

public class ParkingFloor extends BaseModel{
    private int floorNo;
    private List<ParkingSpot> parkingSpots;
    private ParkingFloorStatus parkingFloorStatus;
    private Gate entryGate;
    private  Gate exitGate;

    public ParkingFloor() {
    }

    public ParkingFloor(int floorNo, List<ParkingSpot> parkingSpots, ParkingFloorStatus parkingFloorStatus, Gate entryGate, Gate exitGate) {
        this.floorNo = floorNo;
        this.parkingSpots = parkingSpots;
        this.parkingFloorStatus = parkingFloorStatus;
        this.entryGate = entryGate;
        this.exitGate = exitGate;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }
}
