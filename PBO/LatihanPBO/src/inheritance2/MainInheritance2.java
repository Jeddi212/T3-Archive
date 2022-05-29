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
public class MainInheritance2 {
    
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        System.out.println("m1 " + m1.nama + " " + m1.nilai);
        
        Mahasiswa m2 = new Mahasiswa(100, 5);
        System.out.println("m2 " + m2.nama + " " + m2.nilai);
        
        Mahasiswa m3 = new Mahasiswa("Budi", "Jl. DU", 85, 7);
        System.out.println("m3 " + m3.nama + " " + m3.nilai);
        
        // Overloading
        Mahasiswa m4 = new Mahasiswa(90);
//        Mahasiswa m5 = new Mahasiswa(9);   Tidak bisa karena hanya cek by tipe, tipenya sama

        Person p = new Person("Dono", "Jl. Dago");
        
        Dosen d1 = new Dosen();
        
        p.hitung();
        m1.hitung();
        d1.hitung();
    }
}
