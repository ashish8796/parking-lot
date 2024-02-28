package main.java.com.parkingLot.service.strategy.spotAllocationStrategy;

import main.java.com.parkingLot.models.ParkingSpot;
import main.java.com.parkingLot.models.Vehicle;

public interface SpotAllocationStrategy {
    ParkingSpot getSpotForVehicle(Vehicle vehicle);
}
