// Nim : 1119023
// Nama : Jedediah Fanuel
package com.view;

import com.model.*;

import java.util.ArrayList;
import java.util.LinkedList;
import com.controller.Controller;

public class DummyDatabase {

    Controller controller = new Controller();
    ArrayList<Sarjana> listTempSarjana = new ArrayList<Sarjana>();
    ArrayList<Magister> listTempMagister = new ArrayList<Magister>();
    ArrayList<Doktor> listTempDoktor = new ArrayList<Doktor>();
    ArrayList<DosenTetap> listTempDosenTetap = new ArrayList<DosenTetap>();
    ArrayList<DosenHonorer> listTempDosenHonorer = new ArrayList<DosenHonorer>();
    ArrayList<Karyawan> listTempKaryawan = new ArrayList<Karyawan>();
    LinkedList userList = new LinkedList();

    public DummyDatabase() {
        userList.add(listTempSarjana);
        userList.add(listTempMagister);
        userList.add(listTempDoktor);
        userList.add(listTempDosenTetap);
        userList.add(listTempDosenHonorer);
        userList.add(listTempKaryawan);

        controller.dummyDatabase(listTempSarjana, listTempMagister, listTempDoktor,
                listTempDosenTetap, listTempDosenHonorer, listTempKaryawan);

    }
}
