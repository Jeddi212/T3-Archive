/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobastatic;

/**
 *
 * @author hanschristian
 */
public class Sphere {
    
    // Attributes
    int x;
    int y;
    
    public Sphere() {
    }

    public Sphere(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // Methods
    public Double hitung() {
        return (x + y) * Constants.PI;
    }
}
