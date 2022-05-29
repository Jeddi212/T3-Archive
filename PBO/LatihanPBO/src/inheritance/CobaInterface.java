/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author hanschristian
 */
public interface CobaInterface {
    // Interface hanya dapat berisi attribut Konstanta dan Abstract Method
    final double PHI = 3.14; // syntax final bisa saja dihapus karena this is final by default
    
    // Interface juga dapat berisi Abstract methods, tidak bisa concrete method
    // Setiap class yang implements CobaInterface, nanti mesti @Override implementasi method ini
    abstract void printMethodCobaInterface1(); // syntax abstract bisa dihapus karena abstract by default
}
