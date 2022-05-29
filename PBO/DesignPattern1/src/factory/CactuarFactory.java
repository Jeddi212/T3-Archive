/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author hanschristian
 */
public class CactuarFactory {
    public static Cactuar createCactus(CactusEnum type) {
        Cactuar cactuar;
        switch(type) {
            case BOMB: cactuar = new BombCactuar();
                break;
            case CATAPULT: cactuar = new CatapultCactuar();
                break;
            case CANNON: {
                
            }
            default: cactuar = null;
                break;
        }
        return cactuar;
    }
}
