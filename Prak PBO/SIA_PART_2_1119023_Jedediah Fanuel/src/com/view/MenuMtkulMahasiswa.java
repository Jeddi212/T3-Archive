// Nim : 1119023
// Nama : Jedediah Fanuel
package com.view;

import com.model.*;

import javax.swing.*;
import java.util.ArrayList;

import static com.view.MenuUserData.dummy;

public class MenuMtkulMahasiswa {

    private String tempNim = "";
    private ArrayList n;
    private Mahasiswa m;
    private Sarjana s;
    private Doktor d;

    public MenuMtkulMahasiswa() {
        for (int i = 0; i < dummy.userList.size(); i++) {
            n = (ArrayList) dummy.userList.get(i);

            for (int j = 0; j < n.size(); j++) {
                if (n.get(j) instanceof Mahasiswa) {
                    m = (Mahasiswa) n.get(j);
                    tempNim += "- " + m.getNIM() + "\n";
                }
            }
        }

        int nimDicari = Integer.parseInt(JOptionPane.showInputDialog(null, "" + tempNim +
                "Input Nim : "));
        for (int i = 0; i < dummy.userList.size(); i++) {
            n = (ArrayList) dummy.userList.get(i);

            for (int j = 0; j < n.size(); j++) {
                if (n.get(j) instanceof Mahasiswa) {
                    m = (Mahasiswa) n.get(j);
                    if (nimDicari == m.getNIM()) {
                        if (m instanceof Sarjana) {
                            s = (Sarjana) m;
                            JOptionPane.showMessageDialog(null, s.getListMatkulDiambilWPresensi());
                        } else {
                            d = (Doktor) m;
                            JOptionPane.showMessageDialog(null, "Doktor Tidak Ada Matkul");
                        }
                        break;
                    }
                }
            }
        }
    }

}
