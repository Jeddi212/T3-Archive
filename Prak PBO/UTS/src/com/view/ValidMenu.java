package com.view;

import com.controller.Controller;
import com.model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ValidMenu {

    Controller controller = new Controller();
    Date date = new Date();
    public ValidMenu(ATMCard tempCard, ArrayList<ATMCard> listCard, ATMMachine atm1) {
        Scanner scanner = new Scanner(System.in);
        String inputs;
        double tempCash;
        double newBalance;

        boolean choose = true;
        while (choose) {
            System.out.println("Pilih Menu\n" +
                    "1. Cek Saldo\n" +
                    "2. Tarik Tunai\n" +
                    "3. Transfer ke akun lain\n" +
                    "4. Selesai, Eject Kartu\n" +
                    "-> ");
            inputs = scanner.nextLine();
            switch (inputs) {
                case "1":
                    System.out.println("Saldo anda sekarang : ");
                    System.out.println(tempCard.getBalance() + "\n");
                    break;
                case "2":
                    System.out.println("Masukkan jumlah saldo yang ingin ditarik : ");
                    tempCash = scanner.nextDouble();

                    WithdrawalTransaction w1 = new WithdrawalTransaction("W1", String.valueOf(date.getTime()), tempCash);
                    newBalance = tempCard.getBalance() - tempCash;
                    tempCard.setBalance(newBalance);

                    atm1.setCash(atm1.getCash() - tempCash);

                    System.out.println("Berhasil, saldo anda sekarang " + tempCard.getBalance() + "\n");
                    break;
                case "3":
                    System.out.println("Masukkan id kartu tujuan : ");
                    inputs = scanner.nextLine();
                    if (controller.cekKartu(listCard, inputs)) {
                        System.out.println("Masukkan jumlah saldo ingin dikirim : ");
                        tempCash = scanner.nextDouble();

                        TransferTransaction t1 = new TransferTransaction("T1", String.valueOf(date.getTime()), inputs, tempCash);
                        newBalance = tempCard.getBalance() - tempCash;
                        tempCard.setBalance(newBalance);

                        atm1.setCash(atm1.getCash() + tempCash);

                        ATMCard tempCard2;
                        double newBalance2;
                        for (int i = 0; i < listCard.size(); i++) {
                            tempCard2 = listCard.get(i);
                            if (tempCard.getCardNumber().equals(inputs)) {
                                newBalance2 = tempCard2.getBalance();
                                tempCard2.setBalance(newBalance2 + tempCash);
                                System.out.println("Berhasil mengirim\n");
                                break;
                            } else {
                                break;
                            }
                        }

                    } else {
                        System.out.println("ID KARTU TIDAK VALID\n");
                    }
                    break;
                case "4":
                    System.out.println("Berhasil Logout\n");
                    choose = false;
                    break;
            }
        }
    }
}
