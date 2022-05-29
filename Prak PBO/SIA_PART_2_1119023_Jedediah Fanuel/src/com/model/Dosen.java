// Nim : 1119023
// Nama : Jedediah Fanuel
package com.model;

import java.util.ArrayList;

abstract public class Dosen extends Staff{
    private String department;
    private ArrayList<MatkulAjar> listMatkulDiajar = new ArrayList<MatkulAjar>();

    public Dosen() {
    }

    public Dosen(String nama, String alamat, String TTL, String telepon, int NIK, String department, ArrayList<MatkulAjar> listMatkulDiajar) {
        super(nama, alamat, TTL, telepon, NIK);
        this.department = department;
        this.listMatkulDiajar = listMatkulDiajar;
    }

    @Override
    public String toString() {
        String temp = "";
        temp += super.toString() + "Department = " + department + "\n\n" +
        "List Matkul Diajar : ";

        for (int i = 0; i < listMatkulDiajar.size(); i++) {
            temp += listMatkulDiajar.get(i).toString();
        }

        return temp;
    }

    public String printData() {
        String temp = "";
        temp += super.toString() + "Department = " + department + "\n";
        return temp;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public ArrayList<MatkulAjar> getListMatkulDiajar() {
        return listMatkulDiajar;
    }

    public void setListMatkulDiajar(ArrayList listMatkulDiajar) {
        this.listMatkulDiajar = listMatkulDiajar;
    }
}
