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
public class WithdrawalTransaction extends Transaction {
    private Double amount;
    
    public WithdrawalTransaction() {
        
    }

    public WithdrawalTransaction(Double amount, String transactionId, Date dateTime) {
        super(transactionId, dateTime);
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return super.toString() + ", WithdrawalTransaction{" + "amount=" + amount + '}';
    }
}
