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
public class BallChild extends Ball {
    
    public BallChild(int width, int height) {
        super(width, height);
    }
    
    @Override
    public void resize() {
        System.out.println("resize: " + width+5);
    }
    
    public void resize2(Object ... arg) {
        for (int i = 0; i < arg.length; i++) {
            System.out.println("resize2: " + arg[i]);
        }
    }
}
