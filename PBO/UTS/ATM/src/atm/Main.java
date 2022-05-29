/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author hanschristian
 */
public class Main {
    
    ArrayList<Account> listAccount = new ArrayList<>();

    public Main() {
        // create two Accounts
        listAccount.add(new Account("100", "Hans", "Jl. XYZ", 50000.0));
        listAccount.add(new Account("100", "Andi", "Jl. ABC", 24000.0));
        
        // create ATM Hans
        ATMCard atmHans = new ATMCard("ID0273615", "123456", listAccount.get(0));
        
        // create Mesin ATM
        ATMMachine mesinATM = new ATMMachine("KODE123", 150000.0);
        
        // insert Card to ATM with ATM Hans
        mesinATM.insertCard(atmHans);        
        
        // cek saldo ATM Hans = 50.000
        System.out.println("Balance Hans before withdraw: " + mesinATM.seeBalance());
        
        // withdraw ATM Hans
        System.out.println("Withdraw: " + mesinATM.withdraw(5000.0));
        
        // cek saldo ATM Hans = 45.000
        System.out.println("Balance Hans after withdraw: " + mesinATM.seeBalance());
        
        // transfer
        System.out.println("Transfer ke Andi: " + mesinATM.transfer(listAccount.get(1), 3000.0));
        
        // cek saldo ATM Hans = 42.000
        System.out.println("Balance Hans after transfer: " + mesinATM.seeBalance());
        
        // cek saldo Account Hans di list Main = 42.000
        System.out.println("Balance Hans after transfer di Main: " + listAccount.get(0).getBalance());
        
        // cek saldo Account Andi di list Main = 24.000 -> 27.000
        System.out.println("Balance Andi after transfer di Main: " + listAccount.get(1).getBalance());
        
        // eject ATM Hans
        mesinATM.ejectCard();
        
        // cek saldo ATM kosong (tidak ada kartu)
        System.out.println("Balance: " + mesinATM.seeBalance());
        
        // print All Transaction on ATM Machine
        mesinATM.showAllTransactions();
    }
    
    public static void main(String[] args) {
        new Main();
    }
}
