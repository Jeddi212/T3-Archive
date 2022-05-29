package com.model;

public class ATMCard extends Account{
    private String cardNumber;
    private String pin;

    public ATMCard(String accountNumber, String name, String address, double balance, String cardNumber, String pin) {
        super(accountNumber, name, address, balance);
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}
