// Nim  : 1119203
// Nama : Jedediah Fanuel
package com.Model;

public class Course implements InterfaceCourse{
    private String kodeCourse;
    private String namaCourse;
    private String deskCourse;
    private int hargaCourse;
    private boolean isDiskon;
    private Status status;

    public Course(String kodeCourse, String namaCourse, String deskCourse, int hargaCourse, boolean isDiskon, Status status) {
        this.kodeCourse = kodeCourse;
        this.namaCourse = namaCourse;
        this.deskCourse = deskCourse;
        this.hargaCourse = hargaCourse;
        this.isDiskon = isDiskon;
        this.status = status;
    }

    @Override
    public String toString() {
        return "-->\n" +
                "Kode Course  = " + kodeCourse + '\n' +
                "Nama Course  = " + namaCourse + '\n' +
                "Desk Course  = " + deskCourse + '\n' +
                "Harga Course = " + hargaCourse + '\n' +
                "Diskon       = " + isDiskon + '\n' +
                "Status       = " + status + "\n\n";
    }

    @Override
    public double hitungTotalHarga() {
        if (isDiskon == true) {
            return hargaCourse - (hargaCourse * defaultDiskon);
        } else {
            return hargaCourse;
        }

    }

    @Override
    public String notifCourse() {
        return "Kode Course  = " + kodeCourse + '\n' +
                "Nama Course  = " + namaCourse + '\n' +
                "Desk Course  = " + deskCourse + '\n';
    }

    public String getKodeCourse() {
        return kodeCourse;
    }

    public void setKodeCourse(String kodeCourse) {
        this.kodeCourse = kodeCourse;
    }

    public String getNamaCourse() {
        return namaCourse;
    }

    public void setNamaCourse(String namaCourse) {
        this.namaCourse = namaCourse;
    }

    public String getDeskCourse() {
        return deskCourse;
    }

    public void setDeskCourse(String deskCourse) {
        this.deskCourse = deskCourse;
    }

    public int getHargaCourse() {
        return hargaCourse;
    }

    public void setHargaCourse(int hargaCourse) {
        this.hargaCourse = hargaCourse;
    }

    public boolean isDiskon() {
        return isDiskon;
    }

    public void setDiskon(boolean diskon) {
        isDiskon = diskon;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
