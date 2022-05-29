// Nim  : 1119023
// Nama : Jedediah Fanuel
package com;

import com.Controller.Controller;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pencarian implements ActionListener {
    // Deklarasi
    private boolean lanjut;
    JFrame frame = new JFrame("KTP Express");
    JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));

    Border padding = BorderFactory.createEmptyBorder(30, 30, 30, 30);

    JLabel labelNIK = new JLabel("NIK");
    JTextField nik = new JTextField();

    JButton btnCari = new JButton("Cari");
    JButton btnBTM = new JButton("Back To Menu");

    public Pencarian() {

        panel.setBorder(padding);
        nik.setColumns(50);

        // Label & Text Field NIK
        panel.add(labelNIK);
        panel.add(nik);

        // Button Cari
        panel.add(btnCari);
        btnCari.setActionCommand("Cari");
        btnCari.addActionListener(this);

        // Button Back To Menu
        panel.add(btnBTM);
        btnBTM.setActionCommand("Back To Menu");
        btnBTM.addActionListener(this);

        frame.setSize(1280,720);
        frame.add(panel);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "Cari":
                KTP ktp = new KTP();
                if (Controller.checkKTP(nik.getText())) {
                    ktp = Controller.getKTP(nik.getText());
                    new Perekaman(ktp.getNIK(), ktp.getNama(), ktp.getTempatLahir(), ktp.getTanggalLahir(), ktp.getJenisKelamin(),
                            ktp.getGolDarah(), ktp.getAlamat(), ktp.getRT(), ktp.getRW(), ktp.getKelDes(), ktp.getKecamatan(),
                            ktp.getAgama(), ktp.getStatusPerkawinan(), ktp.getPekerjaan(), ktp.getKewarganegaraaan(),
                            ktp.getBerlakuHingga(), ktp.getKotaPembuatan(), ktp.getTanggalPembuatan(),
                            ktp.getTitle(), ktp.getPathPas(), ktp.getPathTandaTangan());
                    frame.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "NIK not found.", "Error", JOptionPane.WARNING_MESSAGE);
                }
                break;
            case "Back To Menu":
                new Main();
                frame.dispose();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + command);
        }
    }
}
