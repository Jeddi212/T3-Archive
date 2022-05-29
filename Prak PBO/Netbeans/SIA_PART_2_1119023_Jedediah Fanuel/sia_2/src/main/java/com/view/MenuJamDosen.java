// Nim : 1119023
// Nama : Jedediah Fanuel
package com.view;

import com.model.*;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import static com.view.MenuUserData.dummy;

public class MenuJamDosen {

    private String tempNik = "";
    private ArrayList n;
    private Dosen d;
    private int jam;

    public MenuJamDosen() {

        for (int i = 0; i < dummy.userList.size(); i++) {
            n = (ArrayList) dummy.userList.get(i);

            for (int j = 0; j < n.size(); j++) {
                if (n.get(j) instanceof Dosen) {
                    d = (Dosen) n.get(j);
                    tempNik += "- " + d.getNIK() + "\n";
                }
            }
        }

        int nikDicari = Integer.parseInt(JOptionPane.showInputDialog(null, "" + tempNik +
                "Input Nik : "));

        for (int i = 0; i < dummy.userList.size(); i++) {
            n = (ArrayList) dummy.userList.get(i);

            for (int j = 0; j < n.size(); j++) {
                if (n.get(j) instanceof Dosen) {
                    d = (Dosen) n.get(j);
                    if (nikDicari == d.getNIK()) {
                        MatkulAjar mkAjar;
                        ArrayList<PresensiStaff> pStaff;
                        for (int k = 0; k < d.getListMatkulDiajar().size(); k++) {
                            mkAjar = d.getListMatkulDiajar().get(k);
                            pStaff = mkAjar.getListPresensiStaff();
                            for (int l = 0; l < pStaff.size(); l++) {
                                jam += (mkAjar.getMatkulDiajar().getSks() * pStaff.get(l).getStatus());
                            }
                        }
                        break;
                    }
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Jumlah Jam Dosen : " + jam);

    }

}
