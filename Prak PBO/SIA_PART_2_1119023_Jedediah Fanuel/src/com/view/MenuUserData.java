// Nim : 1119023
// Nama : Jedediah Fanuel
package com.view;

import com.model.*;

import javax.swing.*;
import java.util.ArrayList;

public class MenuUserData {

    public static DummyDatabase dummy = new DummyDatabase();

    private String tempName = "";
    private ArrayList n;
    private User user;
    private String tempData;

    public MenuUserData() {

        for (int i = 0; i < dummy.userList.size(); i++) {
            n = (ArrayList) dummy.userList.get(i);

            for (int j = 0; j < n.size(); j++) {
                user = (User) n.get(j);
                tempName += "- " + user.getNama() + '\n';
            }
        }

        String namaDicari = JOptionPane.showInputDialog(null, "" + tempName +
                "Input Nama : ");

        for (int i = 0; i < dummy.userList.size(); i++) {
            n = (ArrayList) dummy.userList.get(i);

            for (int j = 0; j < n.size(); j++) {
                user = (User) n.get(j);

                if (namaDicari.equals(user.getNama())) {
                    tempData = user.printData();
                    JOptionPane.showMessageDialog(null, tempData);
                }
            }
        }
    }

}