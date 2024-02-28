package main.java.com.parkingLot.models;

import main.java.com.parkingLot.models.enums.PaymentMode;
import main.java.com.parkingLot.models.enums.PaymentStatus;

import java.time.LocalDateTime;

public class Payment extends BaseModel {
    private double amount;
    private PaymentMode mode;
    private Bill bill;
    private String TransactionReferenceNo;
    private PaymentStatus paymentStatus;
    private LocalDateTime paymentTime;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public PaymentMode getMode() {
        return mode;
    }

    public void setMode(PaymentMode mode) {
        this.mode = mode;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public String getTransactionReferenceNo() {
        return TransactionReferenceNo;
    }

    public void setTransactionReferenceNo(String transactionReferenceNo) {
        TransactionReferenceNo = transactionReferenceNo;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public LocalDateTime getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(LocalDateTime paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Payment(double amount, PaymentMode mode, Bill bill, String transactionReferenceNo, PaymentStatus paymentStatus, LocalDateTime paymentTime) {
        this.amount = amount;
        this.mode = mode;
        this.bill = bill;
        TransactionReferenceNo = transactionReferenceNo;
        this.paymentStatus = paymentStatus;
        this.paymentTime = paymentTime;
    }

    public Payment() {
    }
}
