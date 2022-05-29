/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.util.ArrayList;

/**
 *
 * @author hanschristian
 */
public class UserManager {
    
    // lazy instantiation
    private static UserManager instance;
    private User user;
    private ArrayList<String> transactions;
    
    private UserManager() {
        
    }

    public static UserManager getInstance() {
        if (instance == null) {
            instance = new UserManager();
        }
        return instance;
    }
    
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    public String cekUser() {
        if (user.getAlamat().equals("Bandung")) {
            return "kota";
        } else {
            return "kampung";
        }
    }
}
