// Nim  : 1119023
// Nama : Jedediah Fanuel
package com;

import com.Controller.Controller;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Properties;

public class Perekaman implements ActionListener{
    // Deklarasi
    private boolean lanjut;
    Controller controller = new Controller();

    String stringNIK = "";
    String stringNama = "";
    String stringTempatLahir = "";
    String stringTanggalLahir = "";
    String stringJenisKelamin = "";
    String stringGolDarah = "";
    String stringAlamat = "";
    String stringRT = "";
    String stringRW = "";
    String stringRTRW = "";
    String stringKelDes = "";
    String stringKecamatan = "";
    String stringAgama = "";
    String stringStatusPerkawinan = "";
    String stringPekerjaan;
    String stringKewarganegaraan = "";
    String stringBerlakuHingga = "";
    String stringKotaPembuatan = "";
    String stringTanggalPembuatann = "";
    String stringTitle = "";
    String pathPas = "";
    String pathTandaTangan = "";

    JFrame frame = new JFrame("KTP Express");
    JPanel panel = new JPanel(new GridLayout(22,2, 10, 0));

    Border padding = BorderFactory.createEmptyBorder(30, 30, 30, 30);

    JLabel labelNIK = new JLabel("NIK");
    JTextField nik = new JTextField();

    JLabel labelNama = new JLabel("Nama");
    JTextField nama = new JTextField();

    JLabel labelTempatLahir = new JLabel("Tempat Lahir");
    JTextField tempatLahir = new JTextField();

    JLabel labelTanggalLahir = new JLabel("Tanggal Lahir");
    UtilDateModel model = new UtilDateModel();
    //model.setDate(20,04,2014);
    // Need this...
    Properties p = new Properties();

    JLabel labelJenisKelamin = new JLabel("Jenis Kelamin");
    JRadioButton radioPria = new JRadioButton("Pria", true);
    JRadioButton radioWanita = new JRadioButton("Wanita");
    ButtonGroup bgJenisKelamin = new ButtonGroup();

    JLabel labelGolonganDarah = new JLabel("Golongan Darah");
    JRadioButton radioGolA = new JRadioButton("A", true);
    JRadioButton radioGolB = new JRadioButton("B");
    JRadioButton radioGolO = new JRadioButton("O");
    JRadioButton radioGolAB = new JRadioButton("AB");
    ButtonGroup bgGolDarah = new ButtonGroup();

    JLabel labelAlamat = new JLabel("Alamat");
    JTextField alamat = new JTextField();

    JLabel labelRT = new JLabel("RT");
    JTextField rt = new JTextField();

    JLabel labelRW = new JLabel("RW");
    JTextField rw = new JTextField();

    JLabel labelKelDesa = new JLabel("Kel/Desa");
    JTextField kelDesa = new JTextField();

    JLabel labelKecamatan = new JLabel("Kecamatan");
    JTextField kecamatan = new JTextField();

    JLabel labelAgama = new JLabel("Agama");
    String[] agama ={"Islam","Kristen","Katolik","Hindu","Budha", "Kong Hu Cu"};
    JComboBox pilihAgama = new JComboBox(agama);

    JLabel labelStatusPerkawinan = new JLabel("Status Perkawinan");
    String[] statusPerkawinan ={"Belum Menikah", "Menikah", "Janda/Duda"};
    JComboBox pilihStatusPerkawinan = new JComboBox(statusPerkawinan);

    JLabel labelPekerjaan = new JLabel("Pekerjaan");
    JCheckBox pekerjaan1 = new JCheckBox("Pengangguran");
    JCheckBox pekerjaan2 = new JCheckBox("Karyawan Swasta");
    JCheckBox pekerjaan3 = new JCheckBox("PNS");
    JCheckBox pekerjaan4 = new JCheckBox("Wiraswasta");
    JCheckBox pekerjaan5 = new JCheckBox("Akademisi");
    JPanel panelPekerjaan = new JPanel();

    JLabel labelKewarganegaraan = new JLabel("Kewarganegaraan");
    JRadioButton radioWNI = new JRadioButton("WNI", true);
    JRadioButton radioWNA = new JRadioButton("WNA");
    JTextField negaraWNA = new JTextField("Masukkan nama negara");
    ButtonGroup bgKewarganegaraan = new ButtonGroup();
    JPanel panelKewarganegaraan = new JPanel();

    JPanel fotoPanel = new JPanel(new GridLayout(1, 2));
    JPanel ttdPanel = new JPanel(new GridLayout(1, 2));
    JFileChooser chooser = new JFileChooser();
    File f;
    Image image;
    ImageIcon icon;
    String filename;

    JLabel labelFoto = new JLabel("Foto");
    JButton btnFoto = new JButton("Attach Foto");

    JLabel labelTandaTangan = new JLabel("Tanda Tangan");
    JButton btnTandaTangan = new JButton("Attach Tanda Tangan");

    JLabel labelBerlaku = new JLabel("Berlaku Hingga");
    JTextField berlakuHingga = new JTextField();

    JLabel labelKota = new JLabel("Kota Pembuatan KTP");
    JTextField kotaPembuatan = new JTextField();

    JLabel labelTanggalPembuatanKTP = new JLabel("Tanggal Pembuatan KTP");
    LocalDate date = LocalDate.now();
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    JLabel labelTanggalPembuatan = new JLabel(date.format(dateTimeFormatter));

    JLabel labelTitle = new JLabel("Title");
    JLabel labelTitleValue = new JLabel("Republik Harapan Bangsa");

    JButton btnInsert = new JButton("Submit");
    JButton btnUpdate = new JButton("Update");
    JButton btnDelete = new JButton("Delete");

    JTextField pathPasFoto = new JTextField("");
    JLabel pasFoto = new JLabel();

    JTextField pathTTD = new JTextField("");
    JLabel ttdFoto = new JLabel();

    JButton btnBTM = new JButton("Back To Menu");

    public Perekaman() {

        pasFoto.setIcon(null);
        ttdFoto.setIcon(null);
        panel.setBorder(padding);
        // Another Text Field
        panel.add(labelNIK);
        panel.add(nik);
        panel.add(labelNama);
        panel.add(nama);
        panel.add(labelTempatLahir);
        panel.add(tempatLahir);

        // Date Picker
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        // Don't know about the formatter, but there it is...
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        panel.add(labelTanggalLahir);
        panel.add(datePicker);

        // Gender
        bgJenisKelamin.add(radioPria);
        bgJenisKelamin.add(radioWanita);
        JPanel panelJenisKelamin = new JPanel();
        panelJenisKelamin.add(radioPria);
        panelJenisKelamin.add(radioWanita);
        panel.add(labelJenisKelamin);
        panel.add(panelJenisKelamin);

        // Gol Darah
        bgGolDarah.add(radioGolA);
        bgGolDarah.add(radioGolB);
        bgGolDarah.add(radioGolO);
        bgGolDarah.add(radioGolAB);
        JPanel panelGolDarah = new JPanel();
        panelGolDarah.add(radioGolA);
        panelGolDarah.add(radioGolB);
        panelGolDarah.add(radioGolO);
        panelGolDarah.add(radioGolAB);
        panel.add(labelGolonganDarah);
        panel.add(panelGolDarah);

        // Another Text Field
        panel.add(labelAlamat);
        panel.add(alamat);
        panel.add(labelRT);
        panel.add(rt);
        panel.add(labelRW);
        panel.add(rw);
        panel.add(labelKelDesa);
        panel.add(kelDesa);
        panel.add(labelKecamatan);
        panel.add(kecamatan);

        // Checkbox Agama
        panel.add(labelAgama);
        panel.add(pilihAgama);

        // Perkawinann Combo Box
        panel.add(labelStatusPerkawinan);
        panel.add(pilihStatusPerkawinan);

        // Pekerjaan Check Box
        panelPekerjaan.add(pekerjaan1);
        panelPekerjaan.add(pekerjaan2);
        panelPekerjaan.add(pekerjaan3);
        panelPekerjaan.add(pekerjaan4);
        panelPekerjaan.add(pekerjaan5);
        panel.add(labelPekerjaan);
        panel.add(panelPekerjaan);

        pekerjaan1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pekerjaan1.isSelected()) {
                    pekerjaan2.setSelected(false);
                    pekerjaan3.setSelected(false);
                    pekerjaan4.setSelected(false);
                    pekerjaan5.setSelected(false);
                    pekerjaan2.setEnabled(false);
                    pekerjaan3.setEnabled(false);
                    pekerjaan4.setEnabled(false);
                    pekerjaan5.setEnabled(false);
                } else {
                    pekerjaan2.setEnabled(true);
                    pekerjaan3.setEnabled(true);
                    pekerjaan4.setEnabled(true);
                    pekerjaan5.setEnabled(true);
                }
                frame.setVisible(true);
            }
        });

        // Radio Kewarganegaraan
        negaraWNA.setVisible(false);
        bgKewarganegaraan.add(radioWNI);
        bgKewarganegaraan.add(radioWNA);
        panelKewarganegaraan.add(radioWNI);
        panelKewarganegaraan.add(radioWNA);
        panelKewarganegaraan.add(negaraWNA);

        radioWNA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioWNA.isSelected()) {
                    negaraWNA.setVisible(true);
                }
                frame.setVisible(true);
            }
        });
        radioWNI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioWNI.isSelected()) {
                    negaraWNA.setText("Masukkan nama negara");
                    negaraWNA.setVisible(false);
                }
                frame.setVisible(true);
            }
        });
        panel.add(labelKewarganegaraan);
        panel.add(panelKewarganegaraan);

        // File Choose Pas Photo
        btnFoto.setActionCommand("Foto");
        btnFoto.addActionListener(this);
        pathPasFoto.setEditable(false);
        fotoPanel.add(pathPasFoto);
        fotoPanel.add(btnFoto);
        panel.add(labelFoto);
        panel.add(fotoPanel);

        // File Choose Tanda Tangan
        btnTandaTangan.setActionCommand("TTD");
        btnTandaTangan.addActionListener(this);
        pathTTD.setEditable(false);
        ttdPanel.add(pathTTD);
        ttdPanel.add(btnTandaTangan);
        panel.add(labelTandaTangan);
        panel.add(ttdPanel);

        // Another Text Field
        panel.add(labelBerlaku);
        panel.add(berlakuHingga);
        panel.add(labelKota);
        panel.add(kotaPembuatan);

        // Another Hard Data
        panel.add(labelTanggalPembuatanKTP);
        panel.add(labelTanggalPembuatan);
        panel.add(labelTitle);
        panel.add(labelTitleValue);

        // Button Submit
        panel.add(btnInsert);
        btnInsert.setActionCommand("Insert");
        btnInsert.addActionListener(this);

        // Button Back To Menu
        panel.add(btnBTM);
        btnBTM.setActionCommand("Back To Menu");
        btnBTM.addActionListener(this);

        frame.setSize(1280,720);
        frame.add(panel);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }

    public Perekaman(String stringNIK, String stringNama, String stringTempatLahir, String stringTanggalLahir, String stringJenisKelamin, String stringGolDarah, String stringAlamat, String stringRT, String stringRW, String stringKelDes, String stringKecamatan, String stringAgama, String stringStatusPerkawinan, String stringPekerjaan, String stringKewarganegaraan, String stringBerlakuHingga, String stringKotaPembuatan, String stringTanggalPembuatann, String stringTitle, String pathPas, String pathTandaTangan) {
        this.stringNIK = stringNIK;
        this.stringNama = stringNama;
        this.stringTempatLahir = stringTempatLahir;
        this.stringTanggalLahir = stringTanggalLahir;
        this.stringJenisKelamin = stringJenisKelamin;
        this.stringGolDarah = stringGolDarah;
        this.stringAlamat = stringAlamat;
        this.stringRT = stringRT;
        this.stringRW = stringRW;
        this.stringKelDes = stringKelDes;
        this.stringKecamatan = stringKecamatan;
        this.stringAgama = stringAgama;
        this.stringStatusPerkawinan = stringStatusPerkawinan;
        this.stringPekerjaan = stringPekerjaan;
        this.stringKewarganegaraan = stringKewarganegaraan;
        this.stringBerlakuHingga = stringBerlakuHingga;
        this.stringKotaPembuatan = stringKotaPembuatan;
        this.stringTanggalPembuatann = stringTanggalPembuatann;
        this.stringTitle = stringTitle;
        this.pathPas = pathPas;
        this.pathTandaTangan = pathTandaTangan;

        pasFoto.setIcon(null);
        ttdFoto.setIcon(null);
        panel.setBorder(padding);
        // Another Text Field
        panel.add(labelNIK);
        nik.setText(stringNIK);
        panel.add(nik);
        panel.add(labelNama);
        nama.setText(stringNama);
        panel.add(nama);
        panel.add(labelTempatLahir);
        tempatLahir.setText(stringTempatLahir);
        panel.add(tempatLahir);

        // Date Picker
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");

        // Split String Date yg sudah digabung
        String[] arrDate = stringTanggalLahir.split("-");

        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);

        // Nampilin di field nya
        datePanel.getModel().setDate(Integer.parseInt(arrDate[2]), Integer.parseInt(arrDate[1]), Integer.parseInt(arrDate[0]));
        datePanel.getModel().setSelected(true);

        // Don't know about the formatter, but there it is...
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        panel.add(labelTanggalLahir);
        panel.add(datePicker);

        // Gender
        bgJenisKelamin.add(radioPria);
        bgJenisKelamin.add(radioWanita);
        if (stringJenisKelamin.equals("Pria")) {
            radioPria.setSelected(true);
        } else if (stringJenisKelamin.equals("Wanita")) {
            radioWanita.setSelected(true);
        }
        JPanel panelJenisKelamin = new JPanel();
        panelJenisKelamin.add(radioPria);
        panelJenisKelamin.add(radioWanita);
        panel.add(labelJenisKelamin);
        panel.add(panelJenisKelamin);

        // Gol Darah
        bgGolDarah.add(radioGolA);
        bgGolDarah.add(radioGolB);
        bgGolDarah.add(radioGolO);
        bgGolDarah.add(radioGolAB);
        switch (stringGolDarah) {
            case "A":
                radioGolA.setSelected(true);
                break;
            case "B":
                radioGolB.setSelected(true);
                break;
            case "O":
                radioGolO.setSelected(true);
                break;
            case "AB":
                radioGolAB.setSelected(true);
                break;
        }

        JPanel panelGolDarah = new JPanel();
        panelGolDarah.add(radioGolA);
        panelGolDarah.add(radioGolB);
        panelGolDarah.add(radioGolO);
        panelGolDarah.add(radioGolAB);
        panel.add(labelGolonganDarah);
        panel.add(panelGolDarah);

        // Another Text Field
        panel.add(labelAlamat);
        alamat.setText(stringAlamat);
        panel.add(alamat);
        panel.add(labelRT);
        rt.setText(stringRT);
        panel.add(rt);
        panel.add(labelRW);
        rw.setText(stringRW);
        panel.add(rw);
        panel.add(labelKelDesa);
        kelDesa.setText(stringKelDes);
        panel.add(kelDesa);
        panel.add(labelKecamatan);
        kecamatan.setText(stringKecamatan);
        panel.add(kecamatan);

        // Checkbox Agama
        panel.add(labelAgama);
        switch (stringAgama) {
            case "Islam":
                pilihAgama.setSelectedIndex(0);
                break;
            case "Kristen":
                pilihAgama.setSelectedIndex(1);
                break;
            case "Katolik":
                pilihAgama.setSelectedIndex(2);
                break;
            case "Hindu":
                pilihAgama.setSelectedIndex(3);
                break;
            case "Budha":
                pilihAgama.setSelectedIndex(4);
                break;
            case "Kong Hu Cu":
                pilihAgama.setSelectedIndex(5);
                break;
        }
        panel.add(pilihAgama);

        // Perkawinan Combo Box
        panel.add(labelStatusPerkawinan);
        switch (stringStatusPerkawinan) {
            case "Belum Menikah":
                pilihStatusPerkawinan.setSelectedIndex(0);
                break;
            case "Menikah":
                pilihStatusPerkawinan.setSelectedIndex(1);
                break;
            case "Janda/Duda":
                pilihStatusPerkawinan.setSelectedIndex(2);
                break;
        }
        panel.add(pilihStatusPerkawinan);

        // Pekerjaan Check Box
        panelPekerjaan.add(pekerjaan1);
        panelPekerjaan.add(pekerjaan2);
        panelPekerjaan.add(pekerjaan3);
        panelPekerjaan.add(pekerjaan4);
        panelPekerjaan.add(pekerjaan5);
        String[] arrPekerjaan = stringPekerjaan.split(", ");
        for (int i = 0; i < arrPekerjaan.length; i++) {
            switch (arrPekerjaan[i]) {
                case "Pengangguran":
                    pekerjaan1.setSelected(true);
                    pekerjaan2.setEnabled(false);
                    pekerjaan3.setEnabled(false);
                    pekerjaan4.setEnabled(false);
                    pekerjaan5.setEnabled(false);
                    break;
                case "Karyawan Swasta":
                    pekerjaan2.setSelected(true);
                    break;
                case "PNS":
                    pekerjaan3.setSelected(true);
                    break;
                case "Wiraswasta":
                    pekerjaan4.setSelected(true);
                    break;
                case "Akademisi":
                    pekerjaan5.setSelected(true);
                    break;
            }
        }

        panel.add(labelPekerjaan);
        panel.add(panelPekerjaan);

        pekerjaan1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pekerjaan1.isSelected()) {
                    pekerjaan2.setSelected(false);
                    pekerjaan3.setSelected(false);
                    pekerjaan4.setSelected(false);
                    pekerjaan5.setSelected(false);
                    pekerjaan2.setEnabled(false);
                    pekerjaan3.setEnabled(false);
                    pekerjaan4.setEnabled(false);
                    pekerjaan5.setEnabled(false);
                } else {
                    pekerjaan2.setEnabled(true);
                    pekerjaan3.setEnabled(true);
                    pekerjaan4.setEnabled(true);
                    pekerjaan5.setEnabled(true);
                }
                frame.setVisible(true);
            }
        });

        // Radio Kewarganegaraan
        negaraWNA.setVisible(false);
        bgKewarganegaraan.add(radioWNI);
        bgKewarganegaraan.add(radioWNA);
        if (stringKewarganegaraan.equals("WNI")) {
            radioWNI.setSelected(true);
        } else {
            radioWNI.setSelected(false);
            negaraWNA.setText(stringKewarganegaraan.substring(4,stringKewarganegaraan.length()-1));
        }
        panelKewarganegaraan.add(radioWNI);
        panelKewarganegaraan.add(radioWNA);
        panelKewarganegaraan.add(negaraWNA);

        radioWNA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioWNA.isSelected()) {
                    negaraWNA.setVisible(true);
                }
                frame.setVisible(true);
            }
        });
        radioWNI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioWNI.isSelected()) {
                    negaraWNA.setText("Masukkan nama negara");
                    negaraWNA.setVisible(false);
                }
                frame.setVisible(true);
            }
        });
        panel.add(labelKewarganegaraan);
        panel.add(panelKewarganegaraan);

        // File Choose Pas Photo
        btnFoto.setActionCommand("Foto");
        btnFoto.addActionListener(this);
        pathPasFoto.setEditable(false);

        pathPasFoto.setText(pathPas);
        fotoPanel.add(pathPasFoto);
        fotoPanel.add(btnFoto);
        panel.add(labelFoto);
        panel.add(fotoPanel);

        // File Choose Tanda Tangan
        btnTandaTangan.setActionCommand("TTD");
        btnTandaTangan.addActionListener(this);
        pathTTD.setEditable(false);

        pathTTD.setText(pathTandaTangan);
        ttdPanel.add(pathTTD);
        ttdPanel.add(btnTandaTangan);
        panel.add(labelTandaTangan);
        panel.add(ttdPanel);

        // Another Text Field
        panel.add(labelBerlaku);
        berlakuHingga.setText(stringBerlakuHingga);
        panel.add(berlakuHingga);
        panel.add(labelKota);
        kotaPembuatan.setText(stringKotaPembuatan);
        panel.add(kotaPembuatan);

        // Another Hard Data
        panel.add(labelTanggalPembuatanKTP);
        labelTanggalPembuatan.setText(stringTanggalPembuatann);
        panel.add(labelTanggalPembuatan);
        panel.add(labelTitle);
        labelTitleValue.setText(stringTitle);
        panel.add(labelTitleValue);

        // Button Submit
        panel.add(btnUpdate);
        btnUpdate.setActionCommand("Update");
        btnUpdate.addActionListener(this);

        // Button Delete
        panel.add(btnDelete);
        btnDelete.setActionCommand("Delete");
        btnDelete.addActionListener(this);

        frame.setSize(1280,720);
        frame.add(panel);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        FileFilter imageFilter = new FileNameExtensionFilter(
                "Image files", ImageIO.getReaderFileSuffixes());
        chooser.setFileFilter(imageFilter);
        switch (command) {
            case "Foto":
                chooser.showOpenDialog(null);
                f = chooser.getSelectedFile();
                filename = f.getAbsolutePath();
                pathPasFoto.setText(filename);
                icon = new ImageIcon(filename);
                image = icon.getImage().getScaledInstance(75,100, Image.SCALE_SMOOTH);
                pasFoto.setIcon(icon);
                break;
            case "TTD":
                chooser.showOpenDialog(null);
                f = chooser.getSelectedFile();
                filename = f.getAbsolutePath();
                pathTTD.setText(filename);
                icon = new ImageIcon(filename);
                image = icon.getImage().getScaledInstance(150,100, Image.SCALE_SMOOTH);
                ttdFoto.setIcon(icon);
                break;
            case "Insert":
                stringNIK = nik.getText();
                stringNama = nama.getText();
                stringTempatLahir = tempatLahir.getText();
                stringTanggalLahir = model.getDay() + "-" + model.getMonth() + "-" + model.getYear();
                stringJenisKelamin = "";
                if (radioPria.isSelected()) {
                    stringJenisKelamin = radioPria.getText();
                } else if (radioWanita.isSelected()) {
                    stringJenisKelamin = radioWanita.getText();
                }

                stringGolDarah = "";
                if (radioGolA.isSelected()) {
                    stringGolDarah = radioGolA.getText();
                } else if (radioGolB.isSelected()) {
                    stringGolDarah = radioGolB.getText();
                } else if (radioGolO.isSelected()) {
                    stringGolDarah = radioGolO.getText();
                } else if (radioGolAB.isSelected()) {
                    stringGolDarah = radioGolAB.getText();
                }
                stringAlamat = alamat.getText();
                stringRTRW = rt.getText() + " / " + rw.getText();
                stringKelDes = kelDesa.getText();
                stringKecamatan = kecamatan.getText();
                stringAgama = String.valueOf(pilihAgama.getSelectedItem());
                stringStatusPerkawinan = String.valueOf(pilihStatusPerkawinan.getSelectedItem());

                ArrayList listPekerjaan = new ArrayList<String>();
                if (pekerjaan1.isSelected()) {
                    stringPekerjaan = pekerjaan1.getText();
                } else {
                    stringPekerjaan = "";
                    listPekerjaan.clear();
                    if (pekerjaan2.isSelected()) {
                        listPekerjaan.add(pekerjaan2.getText());
                    }
                    if (pekerjaan3.isSelected()) {
                        listPekerjaan.add(pekerjaan3.getText());
                    }
                    if (pekerjaan4.isSelected()) {
                        listPekerjaan.add(pekerjaan4.getText());
                    }
                    if (pekerjaan5.isSelected()) {
                        listPekerjaan.add(pekerjaan5.getText());
                    }
                    stringPekerjaan = String.join(", ", listPekerjaan);
                }

                stringKewarganegaraan = "";
                if (radioWNA.isSelected()) {
                    if ((negaraWNA.getText().equals("Indonesia") || negaraWNA.getText().equals("indonesia"))) {
                        stringKewarganegaraan = radioWNI.getText();
                    } else {
                        stringKewarganegaraan = radioWNA.getText() + " (" + negaraWNA.getText() + ")";
                    }
                } else if (radioWNI.isSelected()) {
                    stringKewarganegaraan = radioWNI.getText();
                }

                stringBerlakuHingga = berlakuHingga.getText();
                stringKotaPembuatan = kotaPembuatan.getText();
                stringTanggalPembuatann = labelTanggalPembuatan.getText();
                stringTitle = labelTitleValue.getText();
                pathPas = pathPasFoto.getText();
                pathTandaTangan = pathTTD.getText();

                lanjut = true;

                if (stringNIK.equals("") || stringNama.equals("") || stringTempatLahir.equals("") || stringAlamat.equals("")
                        || rt.getText().equals("") || rw.getText().equals("") || stringKelDes.equals("") || stringKecamatan.equals("")
                        || stringBerlakuHingga.equals("") || stringPekerjaan.equals("") || stringKotaPembuatan.equals("")) {
                    JOptionPane.showMessageDialog(frame, "Pastikan semua field terisi", "Perhatian", JOptionPane.WARNING_MESSAGE);
                    lanjut = false;
                }
                if (stringKewarganegaraan.equals("WNA (Masukkan nama negara)")) {
                    JOptionPane.showMessageDialog(frame, "Pastikan nama negara di isi dengan benar", "Warga Negara Asing", JOptionPane.WARNING_MESSAGE);
                    lanjut = false;
                }

                if (pathPas.equals("") || pathTandaTangan.equals("")) {
                    JOptionPane.showMessageDialog(frame, "Pastikan mencantumkan foto dan tanda tangan", "Pas Foto", JOptionPane.INFORMATION_MESSAGE);
                    lanjut = false;
                }

                if (Controller.checkKTP(stringNIK)) {
                    JOptionPane.showMessageDialog(frame, "NIK sudah dipakai, cari yang lain", "NIK", JOptionPane.WARNING_MESSAGE);
                    lanjut = false;
                }

                if (lanjut) {
                    // Get Filename
//                    String filenamePas = pathPas.substring(pathPas.lastIndexOf('\\')+1, pathPas.length());
                    String filenamePas = stringNIK + "_NIK.jpg";
//                    String filenameTTD = pathTandaTangan.substring(pathTandaTangan.lastIndexOf('\\')+1, pathTandaTangan.length());
                    String filenameTTD = stringNIK + "_TTD.jpg";

                    // Copy file
                    String desFilePas = null;
                    try {
//                        desFilePas = new File(".").getCanonicalPath() + "\\img\\" + filenamePas;
                        desFilePas = new File(".") + "\\img\\" + filenamePas;
                        Files.copy(Paths.get(pathPas),Paths.get(desFilePas),
                                StandardCopyOption.COPY_ATTRIBUTES,StandardCopyOption.REPLACE_EXISTING);
                    } catch (IOException e1) {
                        // Auto-generated catch block
                        e1.printStackTrace();
                    }

                    String desFileTTD = null;
                    try {
//                        desFileTTD = new File(".").getCanonicalPath() + "\\img\\" + filenameTTD;
                        desFileTTD = new File(".") + "\\img\\" + filenameTTD;
                        Files.copy(Paths.get(pathTandaTangan),Paths.get(desFileTTD),
                                StandardCopyOption.COPY_ATTRIBUTES,StandardCopyOption.REPLACE_EXISTING);
                    } catch (IOException e1) {
                        // Auto-generated catch block
                        e1.printStackTrace();
                    }

                    KTP ktp = new KTP(stringNIK, stringNama, stringTempatLahir, stringTanggalLahir, stringJenisKelamin,
                            stringGolDarah, stringAlamat, rt.getText(), rw.getText(), stringKelDes, stringKecamatan,
                            stringAgama, stringStatusPerkawinan, stringPekerjaan, stringKewarganegaraan,
                            stringBerlakuHingga, stringKotaPembuatan, stringTanggalPembuatann,
                            stringTitle, desFilePas, desFileTTD);

                    boolean isInsert;
                    isInsert = Controller.insertNewKTP(ktp);
                    if (isInsert) {
                        new Result(stringNIK, stringNama, stringTempatLahir, stringTanggalLahir, stringJenisKelamin,
                                stringGolDarah, stringAlamat, stringRTRW, stringKelDes, stringKecamatan,
                                stringAgama, stringStatusPerkawinan, stringPekerjaan, stringKewarganegaraan,
                                stringBerlakuHingga, stringKotaPembuatan, stringTanggalPembuatann,
                                stringTitle, pathPas, pathTandaTangan);
                        frame.dispose();
                    } else {
                        JOptionPane.showMessageDialog(frame, "Gagal merekam data KTP", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                break;
            case "Update":
                stringNIK = nik.getText();
                stringNama = nama.getText();
                stringTempatLahir = tempatLahir.getText();
                stringTanggalLahir = model.getDay() + "-" + model.getMonth() + "-" + model.getYear();
                stringJenisKelamin = "";
                if (radioPria.isSelected()) {
                    stringJenisKelamin = radioPria.getText();
                } else if (radioWanita.isSelected()) {
                    stringJenisKelamin = radioWanita.getText();
                }

                stringGolDarah = "";
                if (radioGolA.isSelected()) {
                    stringGolDarah = radioGolA.getText();
                } else if (radioGolB.isSelected()) {
                    stringGolDarah = radioGolB.getText();
                } else if (radioGolO.isSelected()) {
                    stringGolDarah = radioGolO.getText();
                } else if (radioGolAB.isSelected()) {
                    stringGolDarah = radioGolAB.getText();
                }
                stringAlamat = alamat.getText();
                stringRTRW = rt.getText() + " / " + rw.getText();
                stringKelDes = kelDesa.getText();
                stringKecamatan = kecamatan.getText();
                stringAgama = String.valueOf(pilihAgama.getSelectedItem());
                stringStatusPerkawinan = String.valueOf(pilihStatusPerkawinan.getSelectedItem());

                listPekerjaan = new ArrayList<String>();
                if (pekerjaan1.isSelected()) {
                    stringPekerjaan = pekerjaan1.getText();
                } else {
                    stringPekerjaan = "";
                    listPekerjaan.clear();
                    if (pekerjaan2.isSelected()) {
                        listPekerjaan.add(pekerjaan2.getText());
                    }
                    if (pekerjaan3.isSelected()) {
                        listPekerjaan.add(pekerjaan3.getText());
                    }
                    if (pekerjaan4.isSelected()) {
                        listPekerjaan.add(pekerjaan4.getText());
                    }
                    if (pekerjaan5.isSelected()) {
                        listPekerjaan.add(pekerjaan5.getText());
                    }
                    stringPekerjaan = String.join(", ", listPekerjaan);
                }

                stringKewarganegaraan = "";
                if (radioWNA.isSelected()) {
                    if ((negaraWNA.getText().equals("Indonesia") || negaraWNA.getText().equals("indonesia"))) {
                        stringKewarganegaraan = radioWNI.getText();
                    } else {
                        stringKewarganegaraan = radioWNA.getText() + " (" + negaraWNA.getText() + ")";
                    }
                } else if (radioWNI.isSelected()) {
                    stringKewarganegaraan = radioWNI.getText();
                }

                stringBerlakuHingga = berlakuHingga.getText();
                stringKotaPembuatan = kotaPembuatan.getText();
                stringTanggalPembuatann = labelTanggalPembuatan.getText();
                stringTitle = labelTitleValue.getText();
                pathPas = pathPasFoto.getText();
                pathTandaTangan = pathTTD.getText();

                lanjut = true;

                if (stringNIK.equals("") || stringNama.equals("") || stringTempatLahir.equals("") || stringAlamat.equals("")
                        || rt.getText().equals("") || rw.getText().equals("") || stringKelDes.equals("") || stringKecamatan.equals("")
                        || stringBerlakuHingga.equals("") || stringPekerjaan.equals("") || stringKotaPembuatan.equals("")) {
                    JOptionPane.showMessageDialog(frame, "Pastikan semua field terisi", "Perhatian", JOptionPane.WARNING_MESSAGE);
                    lanjut = false;
                }
                if (stringKewarganegaraan.equals("WNA (Masukkan nama negara)")) {
                    JOptionPane.showMessageDialog(frame, "Pastikan nama negara di isi dengan benar", "Warga Negara Asing", JOptionPane.WARNING_MESSAGE);
                    lanjut = false;
                }

                if (pathPas.equals("") || pathTandaTangan.equals("")) {
                    JOptionPane.showMessageDialog(frame, "Pastikan mencantumkan foto dan tanda tangan", "Pas Foto", JOptionPane.INFORMATION_MESSAGE);
                    lanjut = false;
                }

                if (lanjut) {
                    // Set Filename
                    String filenamePas = stringNIK + "_NIK.jpg";
                    String filenameTTD = stringNIK + "_TTD.jpg";

                    // TODO, kalau UPDATE tapi foto ga di pick ulang, ada catch, tapi works fine
                    // Copy file
                    String desFilePas = null;
                    try {
//                        desFilePas = new File(".").getCanonicalPath() + "\\img\\" + filenamePas;
                        desFilePas = new File(".") + "\\img\\" + filenamePas;
                        Files.copy(Paths.get(pathPas),Paths.get(desFilePas),
                                StandardCopyOption.COPY_ATTRIBUTES,StandardCopyOption.REPLACE_EXISTING);
                    } catch (IOException e1) {
                        // Auto-generated catch block
//                        e1.printStackTrace();
                    }

                    String desFileTTD = null;
                    try {
//                        desFileTTD = new File(".").getCanonicalPath() + "\\img\\" + filenameTTD;
                        desFileTTD = new File(".") + "\\img\\" + filenameTTD;
                        Files.copy(Paths.get(pathTandaTangan),Paths.get(desFileTTD),
                                StandardCopyOption.COPY_ATTRIBUTES,StandardCopyOption.REPLACE_EXISTING);
                    } catch (IOException e1) {
                        // Auto-generated catch block
//                        e1.printStackTrace();
                    }

                    KTP ktp = new KTP(stringNIK, stringNama, stringTempatLahir, stringTanggalLahir, stringJenisKelamin,
                            stringGolDarah, stringAlamat, rt.getText(), rw.getText(), stringKelDes, stringKecamatan,
                            stringAgama, stringStatusPerkawinan, stringPekerjaan, stringKewarganegaraan,
                            stringBerlakuHingga, stringKotaPembuatan, stringTanggalPembuatann,
                            stringTitle, desFilePas, desFileTTD);

                    boolean isUpdate;
                    isUpdate = Controller.updateKTP(ktp);
                    if (isUpdate) {
                        JOptionPane.showMessageDialog(null, "Success meng-update KTP data", "Update", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Gagal meng-update data KTP", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                    new Main();
                    frame.dispose();
                }
                break;
            case "Delete":
                boolean isDelete;
                isDelete = Controller.deleteKTP(stringNIK);
                if (isDelete) {
                    JOptionPane.showMessageDialog(null, "Success men-delete KTP data", "Delete", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Gagal men-delete KTP data", "Delete", JOptionPane.INFORMATION_MESSAGE);
                }
                new Main();
                frame.dispose();
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
