// Nim : 1119023
// Nama : Jedediah Fanuel
package com.model;

import java.util.ArrayList;

public class DosenHonorer extends Dosen{
    private int honorPerSks;

    public DosenHonorer(String nama, String alamat, String TTL, String telepon, int NIK, String department, ArrayList listMatkulDiajar, int honorPerSks) {
        super(nama, alamat, TTL, telepon, NIK, department, listMatkulDiajar);
        this.honorPerSks = honorPerSks;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHonorSks= " + honorPerSks + "\n\n";
    }

    public String printData() {
        return super.printData() + "Status  = Dosen Honorer\n";
    }

    public int getHonorPerSks() {
        return honorPerSks;
    }

    public void setHonorPerSks(int honorPerSks) {
        this.honorPerSks = honorPerSks;
    }
}
