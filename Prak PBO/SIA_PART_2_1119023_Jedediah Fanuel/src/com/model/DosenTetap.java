// Nim : 1119023
// Nama : Jedediah Fanuel
package com.model;

import java.util.ArrayList;

public class DosenTetap extends Dosen{
    private int salary;

    public DosenTetap() {
    }

    public DosenTetap(String nama, String alamat, String TTL, String telepon, int NIK, String department, ArrayList listMatkulDiajar, int salary) {
        super(nama, alamat, TTL, telepon, NIK, department, listMatkulDiajar);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalary  = " + salary + "\n\n";
    }

    public String printData() {
        return super.printData() + "Status  = Dosen Tetap\n";
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
