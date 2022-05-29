/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author hanschristian
 */
public class ReceivedState implements ProductInterface {
    
    String penerima;

    @Override
    public void update(Product product) {
        System.out.println("Barang sudah diterima");
    }
}
