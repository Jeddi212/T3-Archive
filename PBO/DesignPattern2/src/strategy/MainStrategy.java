/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.List;

/**
 *
 * @author hanschristian
 */
public class MainStrategy {
    public static void main(String[] args) {
//        List<String> listName = DataRepository.getController().getNames();
        
        // menampilkan listName di GUI
        DatabaseController dbController = new DatabaseController();
        List<String> listNames = dbController.getNames();
    }
}
