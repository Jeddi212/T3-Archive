/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author hanschristian
 */
public class ATMCard {
    private String cardNumber;
    private String PIN;
    private Account account;
    
    public ATMCard() {
    }

    public ATMCard(String cardNumber, String PIN, Account account) {
        this.cardNumber = cardNumber;
        this.PIN = PIN;
        this.account = account;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPIN() {
        return PIN;
    }

    public void setPIN(String PIN) {
        this.PIN = PIN;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
