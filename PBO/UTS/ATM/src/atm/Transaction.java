/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.Date;

/**
 *
 * @author hanschristian
 */
public abstract class Transaction {
    private String transactionId;
    private Date dateTime;
    
    public Transaction() {
    }

    public Transaction(String transactionId, Date dateTime) {
        this.transactionId = transactionId;
        this.dateTime = dateTime;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Transaction{" + "transactionId=" + transactionId + ", dateTime=" + dateTime + '}';
    }
}
