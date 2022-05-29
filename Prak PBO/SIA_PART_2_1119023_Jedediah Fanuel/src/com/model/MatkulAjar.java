// Nim : 1119023
// Nama : Jedediah Fanuel
package com.model;

import java.util.ArrayList;

public class MatkulAjar {
    private MataKuliah matkulDiajar;
    private ArrayList<PresensiStaff> listPresensiStaff = new ArrayList<PresensiStaff>();

    public MatkulAjar(MataKuliah matkulDiajar, ArrayList<PresensiStaff> listPresensiStaff) {
        this.matkulDiajar = matkulDiajar;
        this.listPresensiStaff = listPresensiStaff;
    }

    @Override
    public String toString() {
        String temp = "";
        temp += "\n" +
                "Matkul Diajar : \n" + matkulDiajar.toString() + '\n' +
                "List Presensi Staff : \n";

        for (int i = 0; i < listPresensiStaff.size(); i++) {
            temp += listPresensiStaff.get(i).toString();
        }

        return temp;
    }

    public MataKuliah getMatkulDiajar() {
        return matkulDiajar;
    }

    public void setMatkulDiajar(MataKuliah matkulDiajar) {
        this.matkulDiajar = matkulDiajar;
    }

    public ArrayList<PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }

    public void setListPresensiStaff(ArrayList listPresensiStaff) {
        this.listPresensiStaff = listPresensiStaff;
    }
}
