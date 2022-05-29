/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import static atm.ActiveEnum.*;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author hanschristian
 */
public class ATMMachine {
    private String kodeATM;
    private Double cash;
    private ATMCard currentCard = null;
    private ArrayList<Transaction> listTransaction = new ArrayList<>();
    private ActiveEnum isActive = INACTIVE;

    // Constructor
    public ATMMachine(String kodeATM, Double cash) {
        this.kodeATM = kodeATM;
        this.cash = cash;
    }

    // Getters and Setters
    public String getKodeATM() {
        return kodeATM;
    }

    public void setKodeATM(String kodeATM) {
        this.kodeATM = kodeATM;
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    public ATMCard getCurrentCard() {
        return currentCard;
    }

    public void setCurrentCard(ATMCard currentCard) {
        this.currentCard = currentCard;
    }

    public ArrayList<Transaction> getListTransaction() {
        return listTransaction;
    }

    public void setListTransaction(ArrayList<Transaction> listTransaction) {
        this.listTransaction = listTransaction;
    }

    public ActiveEnum getIsActive() {
        return isActive;
    }

    public void setIsActive(ActiveEnum isActive) {
        this.isActive = isActive;
    }
    
    // Methods
    public void insertCard(ATMCard insertedCard) {
        this.isActive = ACTIVE;
        this.currentCard = insertedCard;
    }
    
    public void ejectCard() {
        this.isActive = INACTIVE;
        this.currentCard = null;
    }
    
    public boolean validatePIN(String enteredPIN) {
        if (isActive == ACTIVE) {
            return currentCard.getPIN().equals(enteredPIN);
        }
        return false;
    }
    
    public Double seeBalance() {
        if (isActive == ACTIVE) {
            return currentCard.getAccount().getBalance();
        }
        return -1D;
    }
    
    public boolean withdraw(Double withdrawAmount) {
        if (isActive == ACTIVE) {
            Double currentBalance = currentCard.getAccount().getBalance();
            if (currentBalance > withdrawAmount) {
                currentCard.getAccount().setBalance(currentBalance - withdrawAmount);
                
                listTransaction.add(new WithdrawalTransaction(withdrawAmount, "ID123", new Date()));
                return true;
            }
            return false;
        }
        return false;
    }
    
    public boolean transfer(Account destinationAccount, Double transferAmount) {
        if (isActive == ACTIVE) {
            Double currentBalance = currentCard.getAccount().getBalance();
            if (currentBalance > transferAmount) {
                currentCard.getAccount().setBalance(currentBalance - transferAmount);
                destinationAccount.setBalance(destinationAccount.getBalance() + transferAmount);
                
                listTransaction.add(new TransferTransaction(destinationAccount.getAccountNumber(), transferAmount, "ID123", new Date()));
                return true;
            }
            return false;
        }
        return false;
    }
    
    public void showAllTransactions() {
        for (int i = 0; i < listTransaction.size(); i++) {
            Transaction transaction = listTransaction.get(i);
            if(transaction instanceof WithdrawalTransaction) {
                System.out.println(((WithdrawalTransaction) transaction).toString());
            } else if (transaction instanceof TransferTransaction) {
                System.out.println(((TransferTransaction) transaction).toString());
            }
        }
    }
}
