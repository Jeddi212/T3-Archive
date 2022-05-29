// Nim : 1119023
// Nama : Jedediah Fanuel
package com.model;

abstract public class Staff extends User{
    private int NIK;

    public Staff(String nama, String alamat, String TTL, String telepon, int NIK) {
        super(nama, alamat, TTL, telepon);
        this.NIK = NIK;
    }

    public Staff() {
    }

    @Override
    public String toString() {
        return super.toString() + "NIK     = " + NIK + '\n';
    }

    public int getNIK() {
        return NIK;
    }

    public void setNIK(int NIK) {
        this.NIK = NIK;
    }
}
