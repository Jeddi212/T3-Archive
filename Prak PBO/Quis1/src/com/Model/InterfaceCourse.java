// Nim  : 1119203
// Nama : Jedediah Fanuel
package com.Model;

public interface InterfaceCourse {
    boolean isDiskon = true;
    double defaultDiskon = 0.1;
    Status lulus = Status.LULUS;

    double hitungTotalHarga();
    String notifCourse();
}
