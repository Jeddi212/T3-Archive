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
public class Person {
    
    String nama;
    String alamat;
    
    public Person() {
    }

    public Person(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public void hitung() {
        System.out.println("MASUK function Hitung di Class Person");
    }
}
