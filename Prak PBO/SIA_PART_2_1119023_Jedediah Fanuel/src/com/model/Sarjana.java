// Nim : 1119023
// Nama : Jedediah Fanuel
package com.model;

import java.util.ArrayList;

public class Sarjana extends Mahasiswa {
    private ArrayList<MatkulAmbil> listMatkulDiambil = new ArrayList<MatkulAmbil>();

    public Sarjana(String nama, String alamat, String TTL, String telepon, int NIM, String jurusan, ArrayList<MatkulAmbil> listMatkulDiambil) {
        super(nama, alamat, TTL, telepon, NIM, jurusan);
        this.listMatkulDiambil = listMatkulDiambil;
    }

    @Override
    public String toString() {
        String temp = "";
        temp = super.toString() + "List Mata Kuliah : \n";

        for (int i = 0; i < listMatkulDiambil.size(); i++) {
            temp += listMatkulDiambil.get(i).toString();
        }

        return temp;
    }

    public String printData() {
        return super.toString() + "Status  = Sarjana\n";
    }

    public String printData4Magister() {
        return super.toString();
    }

    public ArrayList<MatkulAmbil> getListMatkulDiambil() {
        return listMatkulDiambil;
    }

    public String getListMatkulDiambilData() {
        String temp = "";
        temp = "List Mata Kuliah : \n";

        for (int i = 0; i < listMatkulDiambil.size(); i++) {
            temp += listMatkulDiambil.get(i).getMatkulDiambilData();
        }

        return temp;
    }

    public String getListMatkulDiambilWPresensi() {
        String temp = "";
        temp = "List Mata Kuliah : ";

        for (int i = 0; i < listMatkulDiambil.size(); i++) {
            temp += listMatkulDiambil.get(i).getMatkulDiambilWPresensi();
        }

        return temp;
    }

    public String getListMatkulDiambilDataKode() {
        String temp = "";

        for (int i = 0; i < listMatkulDiambil.size(); i++) {
            temp += listMatkulDiambil.get(i).getMatkulDiambilDataKode() + "\n";
        }

        return temp;
    }

    public void setListMatkulDiambil(ArrayList listMatkulDiambil) {
        this.listMatkulDiambil = listMatkulDiambil;
    }

}
