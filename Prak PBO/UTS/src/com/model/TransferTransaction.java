package com.model;

public class TransferTransaction extends Transaction {
    String destinationNumber;
    double amount;

    public TransferTransaction(String transactionID, String dateTime, String destinationNumber, double amount) {
        super(transactionID, dateTime);
        this.destinationNumber = destinationNumber;
        this.amount = amount;
    }

    public String getDestinationNumber() {
        return destinationNumber;
    }

    public void setDestinationNumber(String destinationNumber) {
        this.destinationNumber = destinationNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
