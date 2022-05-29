// Nim  : 1119203
// Nama : Jedediah Fanuel
package com.Model;

import java.util.ArrayList;

public class Internal extends User{
    private String nim;
    private String jurusan;
    private ArrayList<Course> listCourse;

    public Internal(String username, String password, String nama, String telepon, String nim, String jurusan, ArrayList<Course> listCourse) {
        super(username, password, nama, telepon);
        this.nim = nim;
        this.jurusan = jurusan;
        this.listCourse = listCourse;
    }

    @Override
    public String toString() {
        String temp = super.toString();
        temp += "---- Internal ----\n" +
                "Nim = " + nim + '\n' +
                "Jurusan = " + jurusan + '\n' +
                "List Course : \n";

        for (int i = 0; i < listCourse.size(); i++) {
            temp += listCourse.get(i).toString();
        }

        return temp;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public ArrayList<Course> getListCourse() {
        return listCourse;
    }

    public void setListCourse(ArrayList<Course> listCourse) {
        this.listCourse = listCourse;
    }
}
