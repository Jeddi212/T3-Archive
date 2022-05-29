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
public class Product {
//    public enum ProductStatus {
//        DIBAYAR, DIKIRIM, DITERIMA;
//    }
    
    String name;
    int harga;
//    ProductStatus status = ProductStatus.DIKIRIM;
    ProductInterface state = new PaidState(); // ReceivedState
    
    public void updateState() {
        state.update(this);
    }
}
