package adapter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hanschristian
 */
public class CarAdapter implements CarInterface {
    
    LGCCInterface lgccCar;
    
    public CarAdapter(LGCCInterface lgccCar) {
        this.lgccCar = lgccCar;
    }

    @Override
    public void move() {
        lgccCar.jalan();
    }
}
