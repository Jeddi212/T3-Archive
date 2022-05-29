// Nim  : 1119203
// Nama : Jedediah Fanuel
package com.View;

import com.Controller.Controller;
import com.Model.*;

import java.util.ArrayList;

public class DummyView {

    Controller controller = new Controller();

    public DummyView() {
        Course course1 = new Course("IF-301", "PBO", "Seger Seger Joss", 135000, true, Status.LULUS);
        Course course2 = new Course("IF-302", "BASDAT", "Menyenangkan dan Memusingkan", 150000, false, Status.GAGAL);
        ArrayList<Course> listCourse1 = new ArrayList<Course>();
        listCourse1.add(course1);
        listCourse1.add(course2);
        Internal internal1 = new Internal("jeddi", "1234", "Jedediah Fanuel", "08886076079", "1119023", "Infomratika", listCourse1);

        Course course3 = new Course("SI-201", "Big Data", "BANYAK PEMINAT", 100000, false, Status.GAGAL);
        Course course4 = new Course("SI-102", "SI Akuntansi", "Seru", 200000, true, Status.LULUS);
        ArrayList<Course> listCourse2 = new ArrayList<Course>();
        listCourse2.add(course3);
        listCourse2.add(course4);
        External external1 = new External("fedly", "5678", "Fedly Septian", "088216283234", "S2", 1500000, listCourse2);

        ArrayList<User> listUser = new ArrayList<User>();
        listUser.add(internal1);
        listUser.add(external1);


        String tempString = "";
        for (int i = 0; i < listUser.size(); i++) {
            tempString += listUser.get(i).toString();
        }
        System.out.println(tempString);

        System.out.println("Memanggil Fungsi Lihat Course dari Seorang User, diambil contoh username jeddi");
        System.out.println(controller.tampilListCourseDiambil("jeddi", listUser));

        System.out.println("Memanggil Fungsi Lihat Course yang diskon, diambil contoh username fedly");
        System.out.println(controller.tampilListCourseDiskon("fedly", listUser));

        System.out.println("Menampilkan harga course setelah diskon pada user tertentu, sebagai contoh jeddi");
        System.out.println(controller.tampilHargaSetelahDsikon("jeddi", listUser));

    }

}
