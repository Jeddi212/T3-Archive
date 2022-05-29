// Nim : 1119023
// Nama : Jedediah Fanuel
package com.model;

public class PresensiStaff extends Presensi {
    private String jam;

    public PresensiStaff(String tanggal, int status, String jam) {
        super(tanggal, status);
        this.jam = jam;
    }

    @Override
    public String toString() {
        return super.toString() + "Jam     = " + jam + '\n';
    }

    public String getJam() {
        return jam;
    }

    public int getStatus() {
        return super.status;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }
}
