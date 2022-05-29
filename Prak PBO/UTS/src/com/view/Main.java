package com.view;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputs;

        boolean choose = true;
        while (choose) {
            System.out.println("Welcome To ATM\n" +
                    "1. Masukkan Kartu\n" +
                    "2. EXIT\n" +
                    "-> ");
            inputs = scanner.nextLine();
            switch (inputs) {
                case "1":
                    new InsertCardMenu();
                    break;
                default:
                    System.out.println("\nThank You\n");
                    choose = false;
                    break;
            }
        }


    }
}
