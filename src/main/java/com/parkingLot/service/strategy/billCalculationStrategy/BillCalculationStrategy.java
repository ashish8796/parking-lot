package main.java.com.parkingLot.service.strategy.billCalculationStrategy;

import main.java.com.parkingLot.models.Bill;
import main.java.com.parkingLot.models.Ticket;

public interface BillCalculationStrategy {
    Bill generateBill(Ticket ticket);
}
