package com.jedediah;

import java.util.Scanner;

public class RumahSakit {

    public static class JenisPerawatan {
        String nama;
        int biaya;

        public JenisPerawatan(){
        }

        public JenisPerawatan(String nama, int biaya) {
            this.nama = nama;
            this.biaya = biaya;
        }
    }

    public static class JenisKamar {
        String kelas;
        int hargaPerHari;

        public JenisKamar(){
        }

        public JenisKamar(String kelas, int hargaPerHari) {
            this.kelas = kelas;
            this.hargaPerHari = hargaPerHari;
        }
    }

    public static class Pasien {
        String nama;
        JenisKamar[] rawatInap = new JenisKamar[10];
        JenisPerawatan[] perawatan = new JenisPerawatan[5];
        boolean pakaiBPJS;

        public Pasien(){
        }

        public Pasien(String nama, boolean pakaiBPJS) {
            this.nama = nama;
            this.pakaiBPJS = pakaiBPJS;
        }
    }

    // Fungsi nomor 1
    static double HitungBiayaPasien(Pasien patient) {
        double biayaRawat = 0;
        double biayaPerawatan = 0;

        if (patient.pakaiBPJS == false) {
            for (int i = 0; i < patient.rawatInap.length; i++) {
                if (patient.rawatInap[i].kelas.equals("VIP")) {
                    biayaRawat += patient.rawatInap[i].hargaPerHari;
                } else if (patient.rawatInap[i].kelas.equals("I")) {
                    biayaRawat += patient.rawatInap[i].hargaPerHari;
                } else if (patient.rawatInap[i].kelas.equals("II")) {
                    biayaRawat += patient.rawatInap[i].hargaPerHari;
                } else {
                    biayaRawat += patient.rawatInap[i].hargaPerHari;
                }
            }
        }

        for (int i = 0; i < patient.perawatan.length; i++) {
            if (patient.perawatan[i].nama.equals("Operasi")) {
                biayaPerawatan += patient.perawatan[i].biaya;
            } else if (patient.perawatan[i].nama.equals("X-Ray")) {
                biayaPerawatan += patient.perawatan[i].biaya;
            } else if (patient.perawatan[i].nama.equals("USG")) {
                biayaPerawatan += patient.perawatan[i].biaya;
            } else {
                biayaPerawatan += patient.perawatan[i].biaya;
            }
        }

        return (biayaRawat + biayaPerawatan);
    }

    // Fungsi nomor 2
    static double HitungTotalPendapatan(Pasien[] patient) {
        double income = 0;
        for (int i = 0; i < patient.length; i++) {
            income += HitungBiayaPasien(patient[i]);
        }

        return income;
    }

    // Fungsi nomor 3
    static int HitungJumlahPerawatan(Pasien[] patient, String namaPerawatan) {
        int jumlahPerawtan = 0;
        for (int i = 0; i < patient.length; i++) {
            for (int j = 0; j < patient[i].perawatan.length; j++) {
                if (patient[i].perawatan[j].nama.equals(namaPerawatan)) {
                    jumlahPerawtan++;
                }
            }
        }

        return jumlahPerawtan;
    }

    static void Hardcode(Pasien[] patients) {

        for (int i = 0; i < patients.length; i++) {
            patients[i] = new Pasien();
            for (int j = 0; j < patients[i].rawatInap.length; j++) {
                patients[i].rawatInap[j] = new JenisKamar();
            }
            for (int k = 0; k < patients[0].perawatan.length; k++) {
                patients[i].perawatan[k] = new JenisPerawatan();
            }
        }

        // pasien 1
        patients[0].pakaiBPJS = false;
        patients[0].nama = "Udin";

        patients[0].rawatInap[0].kelas = "VIP";
        patients[0].rawatInap[0].hargaPerHari = 100000;
        patients[0].rawatInap[1].kelas = "VIP";
        patients[0].rawatInap[1].hargaPerHari = 100000;
        patients[0].rawatInap[2].kelas = "VIP";
        patients[0].rawatInap[2].hargaPerHari = 100000;
        patients[0].rawatInap[3].kelas = "VIP";
        patients[0].rawatInap[3].hargaPerHari = 100000;
        patients[0].rawatInap[4].kelas = "I";
        patients[0].rawatInap[4].hargaPerHari = 75000;
        patients[0].rawatInap[5].kelas = "I";
        patients[0].rawatInap[5].hargaPerHari = 75000;
        patients[0].rawatInap[6].kelas = "I";
        patients[0].rawatInap[6].hargaPerHari = 75000;
        patients[0].rawatInap[7].kelas = "II";
        patients[0].rawatInap[7].hargaPerHari = 50000;
        patients[0].rawatInap[8].kelas = "II";
        patients[0].rawatInap[8].hargaPerHari = 50000;
        patients[0].rawatInap[9].kelas = "III";
        patients[0].rawatInap[9].hargaPerHari = 25000;


        patients[0].perawatan[0].nama = "Operasi";
        patients[0].perawatan[0].biaya = 200000;
        patients[0].perawatan[1].nama = "Operasi";
        patients[0].perawatan[1].biaya = 200000;
        patients[0].perawatan[2].nama = "X-Ray";
        patients[0].perawatan[2].biaya = 150000;
        patients[0].perawatan[3].nama = "USG";
        patients[0].perawatan[3].biaya = 100000;
        patients[0].perawatan[4].nama = "USG";
        patients[0].perawatan[4].biaya = 100000;

        // pasien 2
        patients[1].pakaiBPJS = false;
        patients[1].nama = "Maman";

        patients[1].rawatInap[0].kelas = "III";
        patients[1].rawatInap[0].hargaPerHari = 25000;
        patients[1].rawatInap[1].kelas = "I";
        patients[1].rawatInap[1].hargaPerHari = 75000;
        patients[1].rawatInap[2].kelas = "II";
        patients[1].rawatInap[2].hargaPerHari = 50000;
        patients[1].rawatInap[3].kelas = "III";
        patients[1].rawatInap[3].hargaPerHari = 25000;
        patients[1].rawatInap[4].kelas = "II";
        patients[1].rawatInap[4].hargaPerHari = 50000;
        patients[1].rawatInap[5].kelas = "I";
        patients[1].rawatInap[5].hargaPerHari = 75000;
        patients[1].rawatInap[6].kelas = "VIP";
        patients[1].rawatInap[6].hargaPerHari = 100000;
        patients[1].rawatInap[7].kelas = "II";
        patients[1].rawatInap[7].hargaPerHari = 50000;
        patients[1].rawatInap[8].kelas = "II";
        patients[1].rawatInap[8].hargaPerHari = 50000;
        patients[1].rawatInap[9].kelas = "III";
        patients[1].rawatInap[9].hargaPerHari = 25000;


        patients[1].perawatan[0].nama = "X-Ray";
        patients[1].perawatan[0].biaya = 150000;
        patients[1].perawatan[1].nama = "USG";
        patients[1].perawatan[1].biaya = 100000;
        patients[1].perawatan[2].nama = "X-Ray";
        patients[1].perawatan[2].biaya = 150000;
        patients[1].perawatan[3].nama = "USG";
        patients[1].perawatan[3].biaya = 100000;
        patients[1].perawatan[4].nama = "X-Ray";
        patients[1].perawatan[4].biaya = 150000;

        // pasien 3
        patients[2].pakaiBPJS = true;
        patients[2].nama = "Ucok";

        patients[2].rawatInap[0].kelas = "III";
        patients[2].rawatInap[0].hargaPerHari = 25000;
        patients[2].rawatInap[1].kelas = "I";
        patients[2].rawatInap[1].hargaPerHari = 75000;
        patients[2].rawatInap[2].kelas = "II";
        patients[2].rawatInap[2].hargaPerHari = 50000;
        patients[2].rawatInap[3].kelas = "III";
        patients[2].rawatInap[3].hargaPerHari = 25000;
        patients[2].rawatInap[4].kelas = "II";
        patients[2].rawatInap[4].hargaPerHari = 50000;
        patients[2].rawatInap[5].kelas = "I";
        patients[2].rawatInap[5].hargaPerHari = 75000;
        patients[2].rawatInap[6].kelas = "VIP";
        patients[2].rawatInap[6].hargaPerHari = 100000;
        patients[2].rawatInap[7].kelas = "II";
        patients[2].rawatInap[7].hargaPerHari = 50000;
        patients[2].rawatInap[8].kelas = "II";
        patients[2].rawatInap[8].hargaPerHari = 50000;
        patients[2].rawatInap[9].kelas = "III";
        patients[2].rawatInap[9].hargaPerHari = 25000;


        patients[2].perawatan[0].nama = "Operasi";
        patients[2].perawatan[0].biaya = 200000;
        patients[2].perawatan[1].nama = "USG";
        patients[2].perawatan[1].biaya = 100000;
        patients[2].perawatan[2].nama = "X-Ray";
        patients[2].perawatan[2].biaya = 150000;
        patients[2].perawatan[3].nama = "Operasi";
        patients[2].perawatan[3].biaya = 200000;
        patients[2].perawatan[4].nama = "X-Ray";
        patients[2].perawatan[4].biaya = 150000;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        // Pasien[] patients = new Pasien[150];
        Pasien[] patients = new Pasien[3];
        System.out.println("Selamat Datang");

        // hardcode
        Hardcode(patients);

        // deklarasi variable
        boolean cekLanjut = true;
        int jawab = 0;
        int jawPasien = 0;
        double hasil = 0;
        String namaPerawatan;

        while (cekLanjut) {
            System.out.println("Pilih Menu :\n" +
                    "1. Hitung Biaya Pasien\n" +
                    "2. Hitung Pendapatan\n" +
                    "3. Hitung Jenis Perawatan\n" +
                    "4. Keluar\n" +
                    "-> ");
            jawab = read.nextInt();

            if (jawab == 1) {
                System.out.println("\nPilih Pasien : ");
                for (int i = 0; i < patients.length; i++) {
                    System.out.println((i+1) + ". " + patients[i].nama);
                }
                System.out.println("-> ");
                jawPasien = read.nextInt();
                jawPasien -= 1;
                hasil = HitungBiayaPasien(patients[jawPasien]);
                System.out.println("Total Biaya Pasien No. " + (jawPasien+1) + " : "
                + hasil);
            } else if (jawab == 2) {
                hasil = HitungTotalPendapatan(patients);
                System.out.println("Total Pendapatan = " + hasil);
            } else if (jawab == 3) {
                System.out.println("Masukkan nama perawatan : (Operasi, X-Ray, USG)");
                namaPerawatan = read.next();
                hasil = HitungJumlahPerawatan(patients, namaPerawatan);
                System.out.println("Total perawatan digunakan : " + hasil);
            } else if (jawab == 4) {
                cekLanjut = false;
            } else {
                System.out.println("Input Tidal Valid");
            }
        }
    }
}
