package com.controller;

import com.model.*;

import java.util.ArrayList;
import java.util.LinkedList;

public class Controller {

    public void dataDummySarjana(ArrayList<Sarjana> listTempSarjana) {
        Presensi p1 = new Presensi("21 September 2020", 1);
        Presensi p2 = new Presensi("28 September 2020", 1);
        Presensi p3 = new Presensi("5 Oktober 2020", 0);
        ArrayList<Presensi> listPre1 = new ArrayList<Presensi>();
        listPre1.add(p1);
        listPre1.add(p2);
        listPre1.add(p3);

        MataKuliah mtkul1 = new MataKuliah("IF-301", 3, "PBO");

        MatkulAmbil mtkulAmbil1 = new MatkulAmbil(mtkul1, listPre1, 100, 87, 98);
        ArrayList<MatkulAmbil> listMtkul1 = new ArrayList<MatkulAmbil>();
        listMtkul1.add(mtkulAmbil1);

        Presensi p4 = new Presensi("17 September 2020", 0);
        Presensi p5 = new Presensi("24 September 2020", 0);
        Presensi p6 = new Presensi("1 Oktober 2020", 1);
        ArrayList<Presensi> listPre2 = new ArrayList<Presensi>();
        listPre2.add(p4);
        listPre2.add(p5);
        listPre2.add(p6);

        MataKuliah mtkul2 = new MataKuliah("IF-303", 5, "BASDAT");

        MatkulAmbil mtkulAmbil2 = new MatkulAmbil(mtkul2, listPre2, 65, 76, 20);
        listMtkul1.add(mtkulAmbil2);

        Sarjana s1 = new Sarjana("Jeddi",
                "Jl. Kembar",
                "Bandung, 28 April 2001",
                "08886076079",
                1119023,
                "Informatika",
                listMtkul1
        );

        Presensi p7 = new Presensi("11 Agustus 2020", 1);
        Presensi p8 = new Presensi("18 Agustus 2020", 0);
        Presensi p9 = new Presensi("25 Agustus 2020", 1);
        ArrayList<Presensi> listPre3 = new ArrayList<Presensi>();
        listPre3.add(p7);
        listPre3.add(p8);
        listPre3.add(p9);

        MataKuliah mtkul3 = new MataKuliah("IF-101", 1, "Agama");

        MatkulAmbil mtkulAmbil3 = new MatkulAmbil(mtkul3, listPre3, 95, 80, 90);
        ArrayList<MatkulAmbil> listMtkul2 = new ArrayList<MatkulAmbil>();
        listMtkul2.add(mtkulAmbil3);

        Presensi p10 = new Presensi("6 Mei 2020", 0);
        Presensi p11 = new Presensi("15 Mei 2020", 1);
        Presensi p12 = new Presensi("25 Mei 2020", 1);
        ArrayList<Presensi> listPre4 = new ArrayList<Presensi>();
        listPre4.add(p10);
        listPre4.add(p11);
        listPre4.add(p12);

        MataKuliah mtkul4 = new MataKuliah("IF-709", 4, "CRC");

        MatkulAmbil mtkulAmbil4 = new MatkulAmbil(mtkul4, listPre4, 100, 55, 69);
        listMtkul2.add(mtkulAmbil4);

        Sarjana s2 = new Sarjana("Fedly",
                "Jl. Cicadas",
                "Bandung, 20 September 2000",
                "08382127623",
                1119033,
                "Informatika",
                listMtkul2
        );


        listTempSarjana.add(s1);
        listTempSarjana.add(s2);

//        System.out.println("Biodata Sarjana: ");
//        for (int i = 0; i < listTempSarjana.size(); i++) {
//            System.out.println(i+1 + ". ----------------------------\n" + listTempSarjana.get(i).toString());
//        }
    }

    public void dataDummyMagister(ArrayList<Magister> listTempMagister) {
        Presensi p1 = new Presensi("1 April 2020", 0);
        Presensi p2 = new Presensi("8 April 2020", 0);
        Presensi p3 = new Presensi("15 April 2020", 0);
        ArrayList<Presensi> listPre1 = new ArrayList<Presensi>();
        listPre1.add(p1);
        listPre1.add(p2);
        listPre1.add(p3);

        MataKuliah mtkul1 = new MataKuliah("IF-901", 3, "Web Engineering");

        MatkulAmbil mtkulAmbil1 = new MatkulAmbil(mtkul1, listPre1, 100, 100, 100);
        ArrayList<MatkulAmbil> listMtkul1 = new ArrayList<MatkulAmbil>();
        listMtkul1.add(mtkulAmbil1);

        Presensi p4 = new Presensi("9 September 2020", 1);
        Presensi p5 = new Presensi("16 September 2020", 1);
        Presensi p6 = new Presensi("23 September 2020", 1);
        ArrayList<Presensi> listPre2 = new ArrayList<Presensi>();
        listPre2.add(p4);
        listPre2.add(p5);
        listPre2.add(p6);

        MataKuliah mtkul2 = new MataKuliah("SI-103", 5, "Sistem Informasi");

        MatkulAmbil mtkulAmbil2 = new MatkulAmbil(mtkul2, listPre2, 95, 79, 100);
        listMtkul1.add(mtkulAmbil2);

        Magister m1 = new Magister("Cece",
                "Jl. Cibadak 6",
                "Jambi, 30 Desember 1998",
                "08186529360",
                1216001,
                "Sistem Informasi",
                listMtkul1, "Judul Tesis A"
        );

        Presensi p7 = new Presensi("10 Januari 2020", 1);
        Presensi p8 = new Presensi("17 Januari 2020", 0);
        Presensi p9 = new Presensi("24 Januari 2020", 1);
        ArrayList<Presensi> listPre3 = new ArrayList<Presensi>();
        listPre3.add(p7);
        listPre3.add(p8);
        listPre3.add(p9);

        MataKuliah mtkul3 = new MataKuliah("SI-201", 1, "SI Akuntansi");

        MatkulAmbil mtkulAmbil3 = new MatkulAmbil(mtkul3, listPre3, 87, 20, 45);
        ArrayList<MatkulAmbil> listMtkul2 = new ArrayList<MatkulAmbil>();
        listMtkul2.add(mtkulAmbil3);

        Presensi p10 = new Presensi("16 Juni 2020", 0);
        Presensi p11 = new Presensi("25 Juni 2020", 1);
        Presensi p12 = new Presensi("5 Agustus 2020", 1);
        ArrayList<Presensi> listPre4 = new ArrayList<Presensi>();
        listPre4.add(p10);
        listPre4.add(p11);
        listPre4.add(p12);

        MataKuliah mtkul4 = new MataKuliah("OL-409", 4, "Online Management");

        MatkulAmbil mtkulAmbil4 = new MatkulAmbil(mtkul4, listPre4, 33, 92, 18);
        listMtkul2.add(mtkulAmbil4);

        Magister m2 = new Magister("Michelle",
                "TKI 3",
                "Jakarta, 14 Februari 1997",
                "08256700191",
                3211109,
                "Online Business",
                listMtkul2, "Judul Tesis B"
        );


        listTempMagister.add(m1);
        listTempMagister.add(m2);

//        System.out.println("Biodata Magister : ");
//        for (int i = 0; i < listTempMagister.size(); i++) {
//            System.out.println(i+1 + ". ----------------------------\n" + listTempMagister.get(i).toString());
//        }
    }

    public void dataDummyDoktor(ArrayList<Doktor> listTempDoktor) {

        Doktor d1 = new Doktor("Wirawan",
                "Jl. Jakarta 351",
                "Bogor, 12 Desember 1994",
                "0898510012",
                2114619,
                "DKV",
                "Penelitian Seni Bogor Tua", 100, 100, 100
        );

        Doktor d2 = new Doktor("Nanda",
                "Jl. Boulevard Utara Gg 2 No.987",
                "Palangkaraya, 9 Maret 1994",
                "0852260112",
                1314619,
                "SCM",
                "Penelitian Rantai Pasok Multi Jaringan", 90, 76, 90
        );


        listTempDoktor.add(d1);
        listTempDoktor.add(d2);

//        System.out.println("Biodata Doktor : ");
//        for (int i = 0; i < listTempDoktor.size(); i++) {
//            System.out.println(i+1 + ". ----------------------------\n" + listTempDoktor.get(i).toString());
//        }
    }

    public void dataDummyDosenTetap(ArrayList<DosenTetap> listTempDosenTetap) {
        PresensiStaff p1 = new PresensiStaff("21 September 2020", 0, "09.00 - 18.00");
        PresensiStaff p2 = new PresensiStaff("28 September 2020", 1, "07.00 - 12.00");
        PresensiStaff p3 = new PresensiStaff("5 Oktober 2020", 1, "12.00 - 13.00");
        ArrayList<PresensiStaff> listPreS1 = new ArrayList<PresensiStaff>();
        listPreS1.add(p1);
        listPreS1.add(p2);
        listPreS1.add(p3);

        MataKuliah mtkul1 = new MataKuliah("IF-301", 3, "PBO");
        MatkulAjar matkulAjar1 = new MatkulAjar(mtkul1, listPreS1);

        PresensiStaff p4 = new PresensiStaff("17 Agustus 2020", 0, "08.00 - 12.00");
        PresensiStaff p5 = new PresensiStaff("24 Agustus 2020", 1, "06.00 - 11.00");
        PresensiStaff p6 = new PresensiStaff("31 Agustus 2020", 0, "14.00 - 15.00");
        ArrayList<PresensiStaff> listPreS2 = new ArrayList<PresensiStaff>();
        listPreS2.add(p4);
        listPreS2.add(p5);
        listPreS2.add(p6);

        MataKuliah mtkul2 = new MataKuliah("IF-303", 5, "BASDAT");
        MatkulAjar matkulAjar2 = new MatkulAjar(mtkul2, listPreS2);

        ArrayList<MatkulAjar> listMtkulAjar1 = new ArrayList<MatkulAjar>();
        listMtkulAjar1.add(matkulAjar1);
        listMtkulAjar1.add(matkulAjar2);

        DosenTetap dT1 = new DosenTetap(
                "Helmi",
                "Jl. Denki 12",
                "Malang, 18 Juli 1992",
                "0888420091",
                1112872,
                "Informatika",
                listMtkulAjar1,
                4500000
        );


        listTempDosenTetap.add(dT1);

        PresensiStaff p7 = new PresensiStaff("11 Januari 2020", 1, "17.00 - 18.00");
        PresensiStaff p8 = new PresensiStaff("12 Februari 2020", 0, "12.00 - 13.00");
        PresensiStaff p9 = new PresensiStaff("13 Maret 2020", 1, "19.00 - 23.00");
        ArrayList<PresensiStaff> listPreS3 = new ArrayList<PresensiStaff>();
        listPreS3.add(p7);
        listPreS3.add(p8);
        listPreS3.add(p9);

        MataKuliah mtkul3 = new MataKuliah("MG-103", 2, "Management Waktu");
        MatkulAjar matkulAjar3 = new MatkulAjar(mtkul3, listPreS3);

        ArrayList<MatkulAjar> listMtkulAjar2 = new ArrayList<MatkulAjar>();
        listMtkulAjar2.add(matkulAjar3);

        PresensiStaff p10 = new PresensiStaff("17 Agustus 2020", 1, "09.00 - 10.00");
        PresensiStaff p11 = new PresensiStaff("18 Agustus 2020", 1, "10.00 - 11.00");
        PresensiStaff p12 = new PresensiStaff("19 Agustus 2020", 1, "11.00 - 12.00");
        ArrayList<PresensiStaff> listPreS4 = new ArrayList<PresensiStaff>();
        listPreS4.add(p10);
        listPreS4.add(p11);
        listPreS4.add(p12);

        MataKuliah mtkul4 = new MataKuliah("MG-102", 1, "Leading Correction");
        MatkulAjar matkulAjar4 = new MatkulAjar(mtkul4, listPreS4);

        listMtkulAjar2.add(matkulAjar4);

        DosenTetap dT2 = new DosenTetap(
                "Tuti",
                "Jl. Komet 121",
                "Bekasi, 27 September 1991",
                "0886102921",
                3112872,
                "Management",
                listMtkulAjar2,
                3750000
        );


        listTempDosenTetap.add(dT2);

//        System.out.println("Biodata Dosen Tetap : ");
//        for (int i = 0; i < listTempDosenTetap.size(); i++) {
//            System.out.println(i+1 + ". ----------------------------\n" + listTempDosenTetap.get(i).toString());
//        }
    }

    public void dataDummyDosenHonorer(ArrayList<DosenHonorer> listTempDosenHonorer) {
        PresensiStaff p1 = new PresensiStaff("21 September 2020", 1, "09.00 - 18.00");
        PresensiStaff p2 = new PresensiStaff("28 September 2020", 1, "07.00 - 12.00");
        PresensiStaff p3 = new PresensiStaff("5 Oktober 2020", 0, "12.00 - 13.00");
        ArrayList<PresensiStaff> listPreS1 = new ArrayList<PresensiStaff>();
        listPreS1.add(p1);
        listPreS1.add(p2);
        listPreS1.add(p3);

        MataKuliah mtkul1 = new MataKuliah("IF-301", 2, "PBO");
        MatkulAjar matkulAjar1 = new MatkulAjar(mtkul1, listPreS1);

        PresensiStaff p4 = new PresensiStaff("17 Agustus 2020", 0, "08.00 - 12.00");
        PresensiStaff p5 = new PresensiStaff("24 Agustus 2020", 1, "06.00 - 11.00");
        PresensiStaff p6 = new PresensiStaff("31 Agustus 2020", 0, "14.00 - 15.00");
        ArrayList<PresensiStaff> listPreS2 = new ArrayList<PresensiStaff>();
        listPreS2.add(p4);
        listPreS2.add(p5);
        listPreS2.add(p6);

        MataKuliah mtkul2 = new MataKuliah("IF-303", 1, "BASDAT");
        MatkulAjar matkulAjar2 = new MatkulAjar(mtkul2, listPreS2);

        ArrayList<MatkulAjar> listMtkulAjar1 = new ArrayList<MatkulAjar>();
        listMtkulAjar1.add(matkulAjar1);
        listMtkulAjar1.add(matkulAjar2);

        DosenHonorer dH1 = new DosenHonorer(
                "Udin",
                "Jl. Binagkabau 7",
                "Pekanbaru, 1 Mei 1982",
                "0888126323",
                2202886,
                "Kedokteran",
                listMtkulAjar1,
                125000
        );


        listTempDosenHonorer.add(dH1);

        PresensiStaff p7 = new PresensiStaff("11 Januari 2020", 1, "17.00 - 18.00");
        PresensiStaff p8 = new PresensiStaff("12 Februari 2020", 1, "12.00 - 13.00");
        PresensiStaff p9 = new PresensiStaff("13 Maret 2020", 1, "19.00 - 23.00");
        ArrayList<PresensiStaff> listPreS3 = new ArrayList<PresensiStaff>();
        listPreS3.add(p7);
        listPreS3.add(p8);
        listPreS3.add(p9);

        MataKuliah mtkul3 = new MataKuliah("MG-103", 3, "Management Waktu");
        MatkulAjar matkulAjar3 = new MatkulAjar(mtkul3, listPreS3);

        ArrayList<MatkulAjar> listMtkulAjar2 = new ArrayList<MatkulAjar>();
        listMtkulAjar2.add(matkulAjar3);

        PresensiStaff p10 = new PresensiStaff("17 Agustus 2020", 0, "09.00 - 10.00");
        PresensiStaff p11 = new PresensiStaff("18 Agustus 2020", 1, "10.00 - 11.00");
        PresensiStaff p12 = new PresensiStaff("19 Agustus 2020", 1, "11.00 - 12.00");
        ArrayList<PresensiStaff> listPreS4 = new ArrayList<PresensiStaff>();
        listPreS4.add(p10);
        listPreS4.add(p11);
        listPreS4.add(p12);

        MataKuliah mtkul4 = new MataKuliah("MG-102", 4, "Leading Correction");
        MatkulAjar matkulAjar4 = new MatkulAjar(mtkul4, listPreS4);

        listMtkulAjar2.add(matkulAjar4);

        DosenHonorer dH2 = new DosenHonorer(
                "Linda C.",
                "Kp. kumpulan Baso",
                "Aceh, 23 November 1981",
                "0819762432",
                5632812,
                "Arsitektur",
                listMtkulAjar2,
                100000
        );


        listTempDosenHonorer.add(dH2);

//        System.out.println("Biodata Dosen Honorer : ");
//        for (int i = 0; i < listTempDosenHonorer.size(); i++) {
//            System.out.println(i + 1 + ". ----------------------------\n" + listTempDosenHonorer.get(i).toString());
//        }
    }

    public void dataDummyKaryawan(ArrayList<Karyawan> listTempKaryawan) {
        PresensiStaff p1 = new PresensiStaff("11 September 2020", 0, "05.00 - 07.00");
        PresensiStaff p2 = new PresensiStaff("18 September 2020", 0, "09.00 - 10.00");
        PresensiStaff p3 = new PresensiStaff("15 Oktober 2020", 0, "11.30 - 12.00");
        PresensiStaff p4 = new PresensiStaff("27 Agustus 2020", 0, "18.00 - 22.00");
        PresensiStaff p5 = new PresensiStaff("04 September 2020", 1, "16.00 - 21.00");
        PresensiStaff p6 = new PresensiStaff("01 November 2020", 0, "24.00 - 20.00");
        ArrayList<PresensiStaff> listPreK1 = new ArrayList<PresensiStaff>();
        listPreK1.add(p1);
        listPreK1.add(p2);
        listPreK1.add(p3);
        listPreK1.add(p4);
        listPreK1.add(p5);
        listPreK1.add(p6);

        Karyawan k1 = new Karyawan(
                "Natasha",
                "Jl. Lombok 70",
                "Lombok, 10 Oktober 1922",
                "0088212762",
                12000117,
                5000000,
                listPreK1
        );


        listTempKaryawan.add(k1);

        PresensiStaff p7 = new PresensiStaff("11 Januari 2020", 1, "17.00 - 18.00");
        PresensiStaff p8 = new PresensiStaff("12 Februari 2020", 0, "12.00 - 13.00");
        PresensiStaff p9 = new PresensiStaff("13 Maret 2020", 0, "19.00 - 23.00");
        PresensiStaff p10 = new PresensiStaff("17 Agustus 2020", 1, "09.00 - 10.00");
        PresensiStaff p11 = new PresensiStaff("18 Agustus 2020", 1, "10.00 - 11.00");
        PresensiStaff p12 = new PresensiStaff("19 Agustus 2020", 1, "11.00 - 12.00");
        ArrayList<PresensiStaff> listPreK2 = new ArrayList<PresensiStaff>();
        listPreK2.add(p7);
        listPreK2.add(p8);
        listPreK2.add(p9);
        listPreK2.add(p10);
        listPreK2.add(p11);
        listPreK2.add(p12);

        Karyawan K2 = new Karyawan(
                "Theo",
                "Kp. Baru Lima 17",
                "Jayapura, 31 Januari 1911",
                "087219072",
                22008011,
                8675000,
                listPreK2
        );

        listTempKaryawan.add(K2);

//        System.out.println("Biodata Karyawan : ");
//        for (int i = 0; i < listTempKaryawan.size(); i++) {
//            System.out.println(i + 1 + ". ----------------------------\n" + listTempKaryawan.get(i).toString());
//        }
    }

    public void dummyDatabase(ArrayList<Sarjana> listTempSarjana, ArrayList<Magister> listTempMagister,
                              ArrayList<Doktor> listTempDoktor, ArrayList<DosenTetap> listTempDosenTetap,
                              ArrayList<DosenHonorer> listTempDosenHonorer, ArrayList<Karyawan> listTempKaryawan) {
        dataDummySarjana(listTempSarjana);
        dataDummyMagister(listTempMagister);
        dataDummyDoktor(listTempDoktor);
        dataDummyDosenTetap(listTempDosenTetap);
        dataDummyDosenHonorer(listTempDosenHonorer);
        dataDummyKaryawan(listTempKaryawan);


    }

    public double hitungRataRataNA(int n1, int n2, int n3) {
        return (n1+n2+n3)/3;
    }

}
