// Nim : 1119023
// Nama : Jedediah Fanuel
package com.model;

import java.util.ArrayList;

public class MatkulAmbil {
    private MataKuliah matkulDiambil;
    private ArrayList<Presensi> listPresensi = new ArrayList<Presensi>();
    private int n1;
    private int n2;
    private int n3;

    public MatkulAmbil(MataKuliah matkulDiambil, ArrayList<Presensi> listPresensi, int n1, int n2, int n3) {
        this.matkulDiambil = matkulDiambil;
        this.listPresensi = listPresensi;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    @Override
    public String toString() {
        String temp = "";
        temp += "Matkul Diambil : \n" + matkulDiambil.toString() + '\n' +
                "List Presensi : \n";

        for (int i = 0; i < listPresensi.size(); i++) {
            temp += listPresensi.get(i).toString();
        }

        temp += "\nNilai 1 = " + n1 + '\n' +
                "Nilai 2 = " + n2 + '\n' +
                "Nilai 3 = " + n3 + "\n\n";

        return temp;
    }

    public String getMatkulDiambilData() {
        String temp = "";
        temp += "Matkul Diambil : \n" + matkulDiambil.toString() + '\n';
        return temp;
    }

    public String getMatkulDiambilWPresensi() {
        String temp = "";
        temp += "\nMatkul Diambil : \n" + matkulDiambil.toString() + '\n' +
                "List Presensi : \n";

        for (int i = 0; i < listPresensi.size(); i++) {
            temp += listPresensi.get(i).toString();
        }

        return temp;
    }

    public String getMatkulDiambilDataKode() {
        String temp = "";
        temp += matkulDiambil.getKode();
        return temp;
    }

    public MataKuliah getMatkulDiambil() {
        return matkulDiambil;
    }

    public void setMatkulDiambil(MataKuliah matkulDiambil) {
        this.matkulDiambil = matkulDiambil;
    }

    public ArrayList getListPresensi() {
        return listPresensi;
    }

    public void setListPresensi(ArrayList listPresensi) {
        this.listPresensi = listPresensi;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }
}
