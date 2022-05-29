package com.view;

import com.controller.Controller;
import com.model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertCardMenu {

    Controller controller = new Controller();
    Scanner scanner = new Scanner(System.in);
    String inputs;

    public InsertCardMenu() {
        // dummy
        ATMMachine atm1 = new ATMMachine("ATM1", 9000000, ActiveEnum.ACTIVE);

        ATMCard card1 = new ATMCard("AC01", "Jeddi", "Jl. Kembar", 245000, "C001", "1234");
        ATMCard card2 = new ATMCard("AC02", "Coni", "Jl. Karasak", 875500, "C002", "qwer");

        ArrayList<ATMCard> listCard = new ArrayList<ATMCard>();
        listCard.add(card1);
        listCard.add(card2);

        System.out.println("Silahkan masukkan id kartu\n-> ");
        inputs = scanner.nextLine();
        boolean cek = true;
        ATMCard tempCard = null;
        for (int i = 0; i < listCard.size(); i++) {
            tempCard = listCard.get(i);
            if (tempCard.getCardNumber().equals(inputs)) {
                cek = true;
                break;
            } else {
                cek = false;
            }
        }

        if (cek) {
            new ValidMenu(tempCard, listCard, atm1);
        } else {
            System.out.println("ID kartu tidak valid\n");
        }
    }
}
