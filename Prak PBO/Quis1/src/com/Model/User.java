// Nim  : 1119203
// Nama : Jedediah Fanuel
package com.Model;

abstract public class User {
    protected String username;
    protected String password;
    protected String nama;
    protected String telepon;

    public User(String username, String password, String nama, String telepon) {
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.telepon = telepon;
    }

    @Override
    public String toString() {
        return "------------\n" +
                "Username = " + username + '\n' +
                "Password = " + password + '\n' +
                "Nama     = " + nama + '\n' +
                "Telepon  = " + telepon + '\n';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
}
