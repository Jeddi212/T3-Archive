// Nim  : 1119203
// Nama : Jedediah Fanuel
package com.Model;

import java.util.ArrayList;

public class External extends User{
    private String pendidikanTerakhir;
    private int saldo;
    private ArrayList<Course> listCourse;

    public External(String username, String password, String nama, String telepon, String pendidikanTerakhir, int saldo, ArrayList<Course> listCourse) {
        super(username, password, nama, telepon);
        this.pendidikanTerakhir = pendidikanTerakhir;
        this.saldo = saldo;
        this.listCourse = listCourse;
    }

    public String getPendidikanTerakhir() {
        return pendidikanTerakhir;
    }

    @Override
    public String toString() {
        String temp = super.toString();
        temp += "---- External ----\n" +
                "Pendidikan Terakhir = " + pendidikanTerakhir + '\n' +
                "Saldo = " + saldo + '\n' +
                "List Course : \n";

        for (int i = 0; i < listCourse.size(); i++) {
            temp += listCourse.get(i).toString();
        }

        return temp;
    }

    public void setPendidikanTerakhir(String pendidikanTerakhir) {
        this.pendidikanTerakhir = pendidikanTerakhir;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Course> getListCourse() {
        return listCourse;
    }

    public void setListCourse(ArrayList<Course> listCourse) {
        this.listCourse = listCourse;
    }
}
