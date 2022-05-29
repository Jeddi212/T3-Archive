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
public class TransferTransaction extends Transaction {
    private String destinationNumber;
    private Double amount;

    public TransferTransaction(String destinationNumber, Double amount, String transactionId, Date dateTime) {
        super(transactionId, dateTime);
        this.destinationNumber = destinationNumber;
        this.amount = amount;
    }

    public String getDestinationNumber() {
        return destinationNumber;
    }

    public void setDestinationNumber(String destinationNumber) {
        this.destinationNumber = destinationNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return super.toString() + ", TransferTransaction{" + "destinationNumber=" + destinationNumber + ", amount=" + amount + '}';
    }
}
