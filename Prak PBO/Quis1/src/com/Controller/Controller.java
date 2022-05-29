// Nim  : 1119203
// Nama : Jedediah Fanuel
package com.Controller;

import com.Model.*;

import java.util.ArrayList;

public class Controller {
    public String tampilListCourseDiambil(String username, ArrayList<User> listUser) {
        String temp = "";
        temp += "List Course : \n";
        Internal internal;
        External external;
        User user = null;

        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getUsername().equals(username)) {
                user = listUser.get(i);
            }
        }

        if (user == null) {
            temp = "User Not Found";
        } else {
            if (user instanceof Internal) {
                internal = (Internal) user;
                for (int i = 0; i < internal.getListCourse().size(); i++) {
                    temp += internal.getListCourse().get(i).toString();
                }
            } else {
                external = (External) user;
                for (int i = 0; i < external.getListCourse().size(); i++) {
                    temp += external.getListCourse().get(i).toString();
                }
            }
        }
        return temp;
    }

    public String tampilListCourseDiskon(String username, ArrayList<User> listUser) {
        String temp = "";
        temp += "List Course : \n";
        Internal internal;
        External external;
        User user = null;

        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getUsername().equals(username)) {
                user = listUser.get(i);
            }
        }

        if (user == null) {
            temp = "User Not Found";
        } else {
            if (user instanceof Internal) {
                internal = (Internal) user;
                for (int i = 0; i < internal.getListCourse().size(); i++) {
                    if (internal.getListCourse().get(i).isDiskon() == true) {
                        temp += internal.getListCourse().get(i).toString();
                    }
                }
            } else {
                external = (External) user;
                for (int i = 0; i < external.getListCourse().size(); i++) {
                    if (external.getListCourse().get(i).isDiskon() == true) {
                        temp += external.getListCourse().get(i).toString();
                    }
                }
            }
        }
        return temp;
    }

    public String tampilHargaSetelahDsikon(String username, ArrayList<User> listUser) {
        String temp = "";
        temp += "Harga setelah diskon : ";
        Internal internal;
        External external;
        User user = null;

        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getUsername().equals(username)) {
                user = listUser.get(i);
            }
        }

        if (user == null) {
            temp = "User Not Found";
        } else {
            if (user instanceof Internal) {
                internal = (Internal) user;
                for (int i = 0; i < internal.getListCourse().size(); i++) {
                    temp += "\n" + internal.getListCourse().get(i).getNamaCourse() + " : ";
                    temp += internal.getListCourse().get(i).hitungTotalHarga();
                }
            } else {
                external = (External) user;
                for (int i = 0; i < external.getListCourse().size(); i++) {
                    temp += "\n" + external.getListCourse().get(i).getNamaCourse() + " : ";
                    temp += external.getListCourse().get(i).hitungTotalHarga();
                }
            }
        }
        return temp;
    }
}
