// Nim : 1119023
// Nama : Jedediah Fanuel
package com.view;

import com.model.*;

import javax.swing.*;
import java.util.ArrayList;

import static com.view.MenuUserData.dummy;

public class MenuGajiStaff {

    private String tempNik = "";
    private ArrayList n;
    private Staff staff;
    private Dosen d;
    private DosenTetap dT;
    private DosenHonorer dH;
    private Karyawan kR;
    private int unit;
    private double gajiStaff;

    public MenuGajiStaff() {

        for (int i = 0; i < dummy.userList.size(); i++) {
            n = (ArrayList) dummy.userList.get(i);

            for (int j = 0; j < n.size(); j++) {
                if (n.get(j) instanceof Staff) {
                    staff = (Staff) n.get(j);
                    tempNik += "- " + staff.getNIK() + "\n";
                }
            }
        }

        int nikDicari = Integer.parseInt(JOptionPane.showInputDialog(null, "" + tempNik +
                "Input Nik : "));

        for (int i = 0; i < dummy.userList.size(); i++) {
            n = (ArrayList) dummy.userList.get(i);

            for (int j = 0; j < n.size(); j++) {
                if (n.get(j) instanceof Staff) {
                    staff = (Staff) n.get(j);
                    if (nikDicari == staff.getNIK()) {
                        if (staff instanceof Dosen) {
                            d = (Dosen) staff;
                            MatkulAjar mkAjar;
                            ArrayList<PresensiStaff> pStaff;
                            for (int k = 0; k < d.getListMatkulDiajar().size(); k++) {
                                mkAjar = d.getListMatkulDiajar().get(k);
                                pStaff = mkAjar.getListPresensiStaff();
                                for (int l = 0; l < pStaff.size(); l++) {
                                    if (pStaff.get(l).getStatus() == 1) {
                                        unit++;
                                    }
                                }
                            }

                            if (d instanceof DosenTetap) {
                                dT = (DosenTetap) d;
                                gajiStaff = dT.getSalary() + (unit * 25000);
                            } else {
                                dH = (DosenHonorer) d;
                                gajiStaff = dH.getHonorPerSks() * unit;
                            }

                        } else {
                            kR = (Karyawan) staff;
                            ArrayList<PresensiStaff> pStaff;
                            pStaff = kR.getListPresensi();
                            for (int l = 0; l < pStaff.size(); l++) {
                                if (pStaff.get(l).getStatus() == 1) {
                                    unit++;
                                }
                            }

                            gajiStaff = (kR.getSalary() / 22) * unit;
                        }
                        break;
                    }
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Gaji Staff Terkait : " + gajiStaff);

    }

}
