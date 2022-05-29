/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author hanschristian
 */
public class DataRepository  {
    static DataInterface controller = new DummyController();
    
    public DataInterface getController() {
        /**
         * If aplikasi nya dibuild versi local 
         *    return DummyController()
         * else if aplikasi build versi play store
         *    return DatabaseController()
         */
        return controller;
    }
}
