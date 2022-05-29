// Nim : 1119023
// Nama : Jedediah Fanuel
package com.model;

public class Presensi implements InterfacePresensi{
    private String tanggal;
    protected int status;

    public Presensi(String tanggal, int status) {
        this.tanggal = tanggal;
        this.status = status;
    }

    @Override
    public String toString() {
        String kehadiran;
        if (status == 1) {
            kehadiran = "Hadir";
        } else {
            kehadiran = "Alpha";
        }
        return "Tanggal = " + tanggal + '\n' +
                "Status  = " + kehadiran + "\n";
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
