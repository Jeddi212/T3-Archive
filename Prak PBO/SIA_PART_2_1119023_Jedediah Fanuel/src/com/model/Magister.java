// Nim : 1119023
// Nama : Jedediah Fanuel
package com.model;

import java.util.ArrayList;

public class Magister extends Sarjana{
    private String judulPenelitianTesis;

    public Magister(String nama, String alamat, String TTL, String telepon, int NIM, String jurusan, ArrayList listMatkul, String judulPenelitianTesis) {
        super(nama, alamat, TTL, telepon, NIM, jurusan, listMatkul);
        this.judulPenelitianTesis = judulPenelitianTesis;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Judul Penelitian Tesis = " + judulPenelitianTesis + "\n\n";
    }

    public String printData() {
        return super.printData4Magister() + "Status  = Magister\n";
    }

    public String getJudulPenelitianTesis() {
        return judulPenelitianTesis;
    }

    public void setJudulPenelitianTesis(String judulPenelitianTesis) {
        this.judulPenelitianTesis = judulPenelitianTesis;
    }
}
