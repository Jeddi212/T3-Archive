// Nim : 1119023
// Nama : Jedediah Fanuel
package com.model;

public class MataKuliahPilihan extends MataKuliah{
    private int jumlahMinimum;

    public MataKuliahPilihan() {
    }

    @Override
    public String toString() {
        return super.toString() +
                "Jumlah Minimum = " + jumlahMinimum + "\n";
    }

    public MataKuliahPilihan(String kode, int sks, String namaMatkul, int jumlahMinimum) {
        super(kode, sks, namaMatkul);
        this.jumlahMinimum = jumlahMinimum;
    }

    public int getJumlahMinimum() {
        return jumlahMinimum;
    }

    public void setJumlahMinimum(int jumlahMinimum) {
        this.jumlahMinimum = jumlahMinimum;
    }
}
