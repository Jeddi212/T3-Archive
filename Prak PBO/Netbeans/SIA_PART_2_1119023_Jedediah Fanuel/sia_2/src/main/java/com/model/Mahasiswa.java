// Nim : 1119023
// Nama : Jedediah Fanuel
package com.model;

abstract public class Mahasiswa extends User {
    private int NIM;
    private String jurusan;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String alamat, String TTL, String telepon, int NIM, String jurusan) {
        super(nama, alamat, TTL, telepon);
        this.NIM = NIM;
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        return super.toString() +
                "NIM     = " + NIM + '\n' +
                "Jurusan = " + jurusan + "\n\n";
    }


    public int getNIM() {
        return NIM;
    }

    public void setNIM(int NIM) {
        this.NIM = NIM;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
}