package main.java.com.parkingLot.models;

import main.java.com.parkingLot.models.enums.BillStatus;

import java.time.LocalDateTime;

public class Bill extends BaseModel{
    private double amount;
    private LocalDateTime exitTime;
    private Gate exitGate;
    private Ticket ticket;
    private BillStatus billStatus;

    public Bill() {
    }

    public Bill(double amount, LocalDateTime exitTime, Gate exitGate, Ticket ticket, BillStatus billStatus) {
        this.amount = amount;
        this.exitTime = exitTime;
        this.exitGate = exitGate;
        this.ticket = ticket;
        this.billStatus = billStatus;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }
}
