/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controller;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Book;

/**
 *
 * @author hanschristian
 */
public class RegisterScreen {
    
    public RegisterScreen() {
        Controller controller = new Controller();
        ArrayList<Book> books = controller.getBooks();
        JOptionPane.showMessageDialog(null, "Ini adalah RegisterScreen", "Title", 0);
    }
}
