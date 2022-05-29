// Nim  : 1119023
// Nama : Jedediah Fanuel
package com;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Result {
    JFrame frame = new JFrame("Hasil");
    JPanel topPanel = new JPanel(new GridLayout(2,1));

    JPanel titlePanel = new JPanel();
    JPanel nikPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

    JPanel leftPanel = new JPanel(new GridLayout(13, 2));
    JPanel midPanel = new JPanel(new GridLayout(13, 2));
    JPanel rightPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

    JPanel backToMain = new JPanel();

    public Result(String stringNIK, String stringNama, String stringTempatLahir, String stringTanggalLahir,
                  String stringJenisKelamin, String stringGolDarah, String stringAlamat, String stringRTRW,
                  String stringKelDes, String stringKecamatan, String stringAgama, String stringStatusPerkawinan,
                  String stringPekerjaan, String stringKewarganegaraaan, String stringBerlakuHingga,
                  String stringKotaPembuatan, String stringTanggalPembuatan, String stringTitle,
                  String pathPas, String pathTandaTangan) {

        topPanel.setBackground(Color.CYAN);
        titlePanel.setBackground(Color.CYAN);
        nikPanel.setBackground(Color.CYAN);
        leftPanel.setBackground(Color.CYAN);
        midPanel.setBackground(Color.CYAN);
        rightPanel.setBackground(Color.CYAN);

        frame.setSize(600,500);

        topPanel.setBounds(0,0,600,60);
        titlePanel.setSize(600, 30);
        nikPanel.setSize(600, 30);

        leftPanel.setBounds(0, 60, 175, 300);
        Border paddingLeftPanel = BorderFactory.createEmptyBorder(0, 25, 0, 0);
        leftPanel.setBorder(paddingLeftPanel);

        midPanel.setBounds(175, 60, 250, 300);

        rightPanel.setSize(175, 300);
        rightPanel.setBounds(425, 60, 175, 300);
        Border paddingRightPanel = BorderFactory.createEmptyBorder(0, 0, 0, 25);
        rightPanel.setBorder(paddingRightPanel);

        Border paddingTopPanel = BorderFactory.createEmptyBorder(0, 20, 0, 20);
        topPanel.setBorder(paddingTopPanel);
        topPanel.add(titlePanel);
        topPanel.add(nikPanel);

        JLabel labelTitle = new JLabel(stringTitle);
        labelTitle.setFont(new Font("Georia", Font.PLAIN, 20));

        JLabel lbl_NIK = new JLabel("NIK");
        JLabel labelNIK = new JLabel(": " + stringNIK);
        lbl_NIK.setFont(new Font("Courier New", Font.BOLD, 20));
        labelNIK.setFont(new Font("Courier New", Font.BOLD, 20));

        JLabel lbl_Nama = new JLabel("Nama");
        JLabel labelNama = new JLabel(": " + stringNama);

        JLabel lbl_TTL = new JLabel("Tempat/Tgl Lahir");
        JLabel labelTTL = new JLabel(": " + stringTempatLahir + ", " + stringTanggalLahir);

        JLabel lbl_JenisKelamin = new JLabel("Jenis Kelamin");
        JLabel labelJenisKelamin = new JLabel(": " + stringJenisKelamin);

        JLabel lbl_GolonganDarah = new JLabel("Gol.Darah");
        JLabel labelGolonganDarah = new JLabel(": " + stringGolDarah);

        JLabel lbl_Alamat = new JLabel("Alamat");
        JLabel labelAlamat = new JLabel(": " + stringAlamat);

        Border leftPadding = BorderFactory.createEmptyBorder(0, 35, 0, 0);
        JLabel lbl_RTRW = new JLabel("RT/RW");
        lbl_RTRW.setBorder(leftPadding);
        JLabel labelRTRW = new JLabel(": " + stringRTRW);

        JLabel lbl_KelDesa = new JLabel("Kel/Desa");
        lbl_KelDesa.setBorder(leftPadding);
        JLabel labelKelDesa = new JLabel(": " + stringKelDes);

        JLabel lbl_Kecamatan = new JLabel("Kecamatan");
        lbl_Kecamatan.setBorder(leftPadding);
        JLabel labelKecamatan = new JLabel(": " + stringKecamatan);

        JLabel lbl_Agama = new JLabel("Agama");
        JLabel labelAgama = new JLabel(": " + stringAgama);

        JLabel lbl_StatusPerkawinan = new JLabel("Status Perkawinan");
        JLabel labelStatusPerkawinan = new JLabel(": " + stringStatusPerkawinan);

        JLabel lbl_Pekerjaan = new JLabel("Pekerjaan");
        JLabel labelPekerjaan = new JLabel(": " + stringPekerjaan);

        JLabel lbl_Kewarganegaraan = new JLabel("Kewarganegaraan");
        JLabel labelKewarganegaraan = new JLabel(": " + stringKewarganegaraaan);

        JLabel lbl_Berlaku = new JLabel("Berlaku Hingga");
        JLabel labelBerlaku = new JLabel(": " + stringBerlakuHingga);

        JLabel pasFoto = new JLabel();
        JLabel ttdFoto = new JLabel();

        pasFoto.setIcon(new ImageIcon(new ImageIcon(pathPas).getImage().getScaledInstance(120, 160, Image.SCALE_DEFAULT)));
        JLabel labelKota = new JLabel("     " + stringKotaPembuatan + "     ");
        JLabel labelTanggalPembuatan = new JLabel("     " + stringTanggalPembuatan + "     ");
        ttdFoto.setIcon(new ImageIcon(new ImageIcon(pathTandaTangan).getImage().getScaledInstance(100, 75, Image.SCALE_DEFAULT)));

        titlePanel.add(labelTitle);
        nikPanel.add(lbl_NIK);
        nikPanel.add(labelNIK);

        leftPanel.add(lbl_Nama);
        midPanel.add(labelNama);

        leftPanel.add(lbl_TTL);
        midPanel.add(labelTTL);

        leftPanel.add(lbl_JenisKelamin);
        midPanel.add(labelJenisKelamin);

        leftPanel.add(lbl_GolonganDarah);
        midPanel.add(labelGolonganDarah);

        leftPanel.add(lbl_Alamat);
        midPanel.add(labelAlamat);

        leftPanel.add(lbl_RTRW);
        midPanel.add(labelRTRW);

        leftPanel.add(lbl_KelDesa);
        midPanel.add(labelKelDesa);

        leftPanel.add(lbl_Kecamatan);
        midPanel.add(labelKecamatan);

        leftPanel.add(lbl_Agama);
        midPanel.add(labelAgama);

        leftPanel.add(lbl_StatusPerkawinan);
        midPanel.add(labelStatusPerkawinan);

        leftPanel.add(lbl_Pekerjaan);
        midPanel.add(labelPekerjaan);

        leftPanel.add(lbl_Kewarganegaraan);
        midPanel.add(labelKewarganegaraan);

        leftPanel.add(lbl_Berlaku);
        midPanel.add(labelBerlaku);

        rightPanel.add(pasFoto);
        rightPanel.add(labelKota);
        rightPanel.add(labelTanggalPembuatan);
        rightPanel.add(ttdFoto);

        topPanel.add(titlePanel);
        topPanel.add(nikPanel);

        // Back Button
        backToMain.setBounds(0,400,600,100);
        JButton btnExit = new JButton("Exit");
        btnExit.setFont(new Font("Consolas", Font.BOLD, 40));
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnExit) {
                    new Main();
                    frame.dispose();
                }
            }
        });
        backToMain.add(btnExit);

        frame.add(topPanel);
        frame.add(leftPanel);
        frame.add(midPanel);
        frame.add(rightPanel);
        frame.add(backToMain);
        JPanel sentinel = new JPanel();
        frame.add(sentinel);

        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }

}
