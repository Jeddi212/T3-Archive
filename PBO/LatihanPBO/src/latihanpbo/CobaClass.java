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
public class CobaClass {
    
    CobaClass() {
        Ball ball = new Ball(1, 2);
        cek(ball);
        System.out.println(ball.width);
        
        BallChild ballChild = new BallChild(3, 4);
        ballChild.resize();
        ballChild.resize2(1,2,3,4,5);
        
        Ball balls = new BallChild(1, 2);
        balls.resize();
    }
    
    void cek(Ball ball) {
        ball.width = 100;
    }
    
    public static void main(String[] args) {
        new CobaClass();
    }
}
