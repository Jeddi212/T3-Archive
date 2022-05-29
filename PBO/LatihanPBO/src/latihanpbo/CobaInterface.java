/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo;

/**
 *
 * @author hanschristian
 */
interface Satu {
    int x = 10;
    
    void hitung();
}

interface Dua {
    int y = 20;
}

class Hewan implements Satu {
    String nama = "";

    @Override
    public void hitung() {
        System.out.println("Hitung Hewan");
    }
}

class Animal implements Satu, Dua {
    String nama = "";
    int umur = 5;

    @Override
    public void hitung() {
        System.out.println("Hitung Animal");
    }
}

public class CobaInterface {
    
    public static void main(String[] args) {
        Hewan h = new Hewan();
        Animal a = new Animal();
        cek(h);
        cek(a);
    }
    
    static void cek(Satu satu) {
        satu.hitung();
    }
}
