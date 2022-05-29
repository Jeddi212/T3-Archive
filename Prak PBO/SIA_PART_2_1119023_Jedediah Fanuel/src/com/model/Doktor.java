// Nim : 1119023
// Nama : Jedediah Fanuel
package com.model;

public class Doktor extends Mahasiswa{
    private String judulPenelitianDisertasi;
    private int nSidang1;
    private int nSidang2;
    private int nSidang3;

    public Doktor(String nama, String alamat, String TTL, String telepon, int NIM, String jurusan, String judulPenelitianDisertasi, int nSidang1, int nSidang2, int nSidang3) {
        super(nama, alamat, TTL, telepon, NIM, jurusan);
        this.judulPenelitianDisertasi = judulPenelitianDisertasi;
        this.nSidang1 = nSidang1;
        this.nSidang2 = nSidang2;
        this.nSidang3 = nSidang3;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Judul Penelitian Disertasi = " + judulPenelitianDisertasi + '\n' +
                "Nilai Sidang1 = " + nSidang1 + '\n' +
                "Nilai Sidang2 = " + nSidang2 + '\n' +
                "Nilai Sidang3 = " + nSidang3 + "\n\n";
    }

    public String printData() {
        return toString() + "Status  = Doktor\n";
    }

    public String getJudulPenelitianDisertasi() {
        return judulPenelitianDisertasi;
    }

    public void setJudulPenelitianDisertasi(String judulPenelitianDisertasi) {
        this.judulPenelitianDisertasi = judulPenelitianDisertasi;
    }

    public int getnSidang1() {
        return nSidang1;
    }

    public void setnSidang1(int nSidang1) {
        this.nSidang1 = nSidang1;
    }

    public int getnSidang2() {
        return nSidang2;
    }

    public void setnSidang2(int nSidang2) {
        this.nSidang2 = nSidang2;
    }

    public int getnSidang3() {
        return nSidang3;
    }

    public void setnSidang3(int nSidang3) {
        this.nSidang3 = nSidang3;
    }
}
