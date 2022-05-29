package com.model;

public class WithdrawalTransaction extends Transaction {
    double amount;

    public WithdrawalTransaction(String transactionID, String dateTime, double amount) {
        super(transactionID, dateTime);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
