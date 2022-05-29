// Nim : 1119023
// Nama : Jedediah Fanuel
package com.model;

public class MataKuliah {
    private String kode;
    private int sks;
    private String namaMatkul;

    public MataKuliah() {}

    public MataKuliah(String kode, int sks, String namaMatkul) {
        this.kode = kode;
        this.sks = sks;
        this.namaMatkul = namaMatkul;
    }

    @Override
    public String toString() {
        return "Kode = " + kode + '\n' +
                "SKS  = " + sks + '\n' +
                "Nama Matkul = " + namaMatkul + '\n';
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }
}
