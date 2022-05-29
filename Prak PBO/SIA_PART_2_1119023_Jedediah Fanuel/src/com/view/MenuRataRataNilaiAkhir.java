// Nim : 1119023
// Nama : Jedediah Fanuel
package com.view;

import com.controller.Controller;
import com.model.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import static com.view.MenuUserData.dummy;

public class MenuRataRataNilaiAkhir {

    Controller controller = new Controller();
    private String tempKodeMK = "";
    private ArrayList n;
    private Mahasiswa m;
    private Sarjana s;
    private Doktor d;
    private double nilaiAkhir;
    private double totalNilaiAkhir;
    private int count;

    public MenuRataRataNilaiAkhir() {

        for (int i = 0; i < dummy.userList.size(); i++) {
            n = (ArrayList) dummy.userList.get(i);

            for (int j = 0; j < n.size(); j++) {
                if (n.get(j) instanceof Mahasiswa) {
                    m = (Mahasiswa) n.get(j);
                    if (m instanceof Sarjana) {
                        s = (Sarjana) m;
                        tempKodeMK += s.getListMatkulDiambilDataKode();
                    }
                }
            }
        }

        String kodeMKDicari = JOptionPane.showInputDialog(null, "" + tempKodeMK +
                "Input Kode MK : ");

        for (int i = 0; i < dummy.userList.size(); i++) {
            n = (ArrayList) dummy.userList.get(i);

            for (int j = 0; j < n.size(); j++) {
                if (n.get(j) instanceof Mahasiswa) {
                    m = (Mahasiswa) n.get(j);
                    if (m instanceof Sarjana) { // Magister Juga Masuk Sini
                        s = (Sarjana) m;
                        for (int k = 0; k < s.getListMatkulDiambil().size(); k++) {
                            MatkulAmbil mK;
                            mK = s.getListMatkulDiambil().get(k);
                            if (kodeMKDicari.equals(mK.getMatkulDiambil().getKode())){
                                nilaiAkhir = controller.hitungRataRataNA(mK.getN1(), mK.getN2(), mK.getN3());
                                count++;
                                totalNilaiAkhir += nilaiAkhir;
                            }
                        }
                    }
                }
            }
        }

        totalNilaiAkhir /= count;

        JOptionPane.showMessageDialog(null, "Nilai Rata Rata Keseluruhan : " + totalNilaiAkhir);

    }

}
