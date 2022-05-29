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
public class Dosen extends Person {
    int gaji;
    
    public Dosen() {
    }

    public Dosen(int gaji) {
        this.gaji = gaji;
    }
    
    @Override
    public void hitung() {
        super.hitung();
        System.out.println("MASUK function Hitung di Class Dosen");
    }
}
