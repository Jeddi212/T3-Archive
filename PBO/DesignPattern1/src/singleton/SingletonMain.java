/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author hanschristian
 */
public class SingletonMain {
    
    public static void main(String[] args) {
        UserManager.getInstance().setUser(new User());
        
        UserManager.getInstance().setUser(null);
    }
}
