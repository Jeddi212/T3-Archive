package com.model;

public class Account {
    String accountNumber;
    String name;
    String address;
    double balance;

    public Account(String accountNumber, String name, String address, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.address = address;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
