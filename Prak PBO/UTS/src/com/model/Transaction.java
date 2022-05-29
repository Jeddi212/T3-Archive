package com.model;

import java.util.Date;

public class Transaction {
    String transactionID;
    String dateTime;

    public Transaction(String transactionID, String dateTime) {
        this.transactionID = transactionID;
        this.dateTime = dateTime;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}
