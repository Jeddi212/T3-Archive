// Nim : 1119023
// Nama : Jedediah Fanuel
package com.model;

import java.util.ArrayList;

public class Karyawan extends Staff{
    private int salary;
    private ArrayList<PresensiStaff> listPresensi = new ArrayList<PresensiStaff>();

    public Karyawan() {
    }

    public Karyawan(String nama, String alamat, String TTL, String telepon, int NIK, int salary, ArrayList<PresensiStaff> listPresensi) {
        super(nama, alamat, TTL, telepon, NIK);
        this.salary = salary;
        this.listPresensi = listPresensi;
    }

    @Override
    public String toString() {
        String temp = "";
        temp += super.toString() + "Salary  = " + salary + "\n\n" +
                "List Presensi Staff : \n";

        for (int i = 0; i < listPresensi.size(); i++) {
            temp += listPresensi.get(i).toString();
        }

        return temp;
    }

    public String printData() {
        return super.toString() + "Salary  = " + salary + '\n' + "Status  = Karyawan\n";
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public ArrayList<PresensiStaff> getListPresensi() {
        return listPresensi;
    }

    public void setListPresensi(ArrayList<PresensiStaff> listPresensi) {
        this.listPresensi = listPresensi;
    }
}
