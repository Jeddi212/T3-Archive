// Nim : 1119023
// Nama : Jedediah Fanuel
package com.view;

import javax.swing.JOptionPane;

public class MainMenu {

    public MainMenu() {
        showMainMenu();
    }

    private void showMainMenu() {
        Boolean menu = true;
        while (menu) {
            int choosen = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Menu SIA: \n" +
                    "1. Menu User Data \n" +
                    "2. Print Nilai Akhir \n" +
                    "3. Print Rata - Rata Nilai Akhir \n" +
                    "4. Print Jumlah Tidak Lulus pada Mtkul \n" +
                    "5. Print Mtkul diambil + Presensi \n" +
                    "6. Print Total Jam Dosen \n" +
                    "7. Print Gaji Seorang Staff \n" +
                    "8. Exit"));
            switch (choosen) {
                case 1: new MenuUserData();
                    break;
                case 2: new MenuNilaiAkhir();
                    break;
                case 3: new MenuRataRataNilaiAkhir();
                    break;
                case 4: new MenuTidakLulus();
                    break;
                case 5: new MenuMtkulMahasiswa();
                    break;
                case 6: new MenuJamDosen();
                    break;
                case 7: new MenuGajiStaff();
                    break;
                default:
                    menu = false;
            }
        }
    }

}
