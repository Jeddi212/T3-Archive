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
public class Ball {
    
    int width;
    int height;

    public Ball(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public void resize() {
        System.out.println("resize: " + width);
    }
}
