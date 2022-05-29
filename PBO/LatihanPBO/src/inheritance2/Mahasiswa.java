/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance2;

/**
 *
 * @author hanschristian
 */
public class Mahasiswa extends Person {
    int nilai;
    int absen;
    
    public Mahasiswa() {
    }
    
    // Overloading
    public Mahasiswa(int nilai) {
        this.nilai = nilai;
    }
    
    // Overloading tidak bisa karena tipe nya sama dengan yang diatas
//    public Mahasiswa(int absen) {
//        this.absen = absen;
//    }

    public Mahasiswa(int nilai, int absen) {
        this.nilai = nilai;
        this.absen = absen;
    }
    
    public Mahasiswa(String nama, String alamat, int nilai, int absen) {
        super(nama, alamat);
        this.nilai = nilai;
        this.absen = absen;
//        this.nama = nama;
//        this.alamat = alamat;
    }
}
