/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobastatic;

import java.util.ArrayList;

/**
 *
 * @author hanschristian
 */
public class CobaStatic {
    
    private ArrayList<String> list = new ArrayList<String>();
    
    public CobaStatic() {
        hitung();
        list.add("1");
        for (int i = 0; i < 2; i++) {
            System.out.println(list.get(i));
        }
    }

    void hitung() {
        System.out.println("MASUK");
        list.add("2");
    }
    
    public static void main(String[] args) {
        CobaStatic cobaStatic = new CobaStatic();
        // atau new CobaStatic();
        
        // bisa juga diisi dengan Initialisasi
        
//        System.out.println(Constants.PI);
//        
//        Sphere sphere1 = new Sphere(10,5);
//        System.out.println(sphere1.y);
//        System.out.println(Constants.PI);
//        
//        Sphere sphere2 = new Sphere(16,7);
//        System.out.println(sphere2.x);
//        Constants.PI = 100;
//        System.out.println(Constants.PI);
//        System.out.println(Constants.PI);
    }
}
