// Nim  : 1119023
// Nama : Jedediah Fanuel
package com;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Main implements ActionListener {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel(new GridLayout(2,1));
    JPanel panelButton = new JPanel(new GridLayout(1,3, 10, 0));
    Border padding = BorderFactory.createEmptyBorder(30, 30, 30, 30);

    public Main() {

        JLabel labelTitle = new JLabel("KTP EXPRESS");
        labelTitle.setHorizontalAlignment(JLabel.CENTER);
        labelTitle.setFont(new Font("Consolas", Font.ITALIC, 100));

        JButton btnPerekaman = new JButton("Perekaman");
        btnPerekaman.setFont(new Font("Consolas", Font.PLAIN, 40));
        btnPerekaman.setActionCommand("Perekaman");
        btnPerekaman.addActionListener(this);

        JButton btnPencarian = new JButton("Pencarian");
        btnPencarian.setFont(new Font("Consolas", Font.PLAIN, 40));
        btnPencarian.setActionCommand("Pencarian");
        btnPencarian.addActionListener(this);

        JButton btnExit = new JButton("Exit");
        btnExit.setFont(new Font("Consolas", Font.BOLD, 40));
        btnExit.setActionCommand("Exit");
        btnExit.addActionListener(this);

        panelButton.add(btnPerekaman);
        panelButton.add(btnPencarian);
        panelButton.add(btnExit);

        panel.add(labelTitle);
        panel.add(panelButton);
        panel.setBorder(padding);

        frame.add(panel);
        frame.setSize(1280, 720);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "Perekaman":
                new Perekaman();
                frame.dispose();
                break;
            case "Pencarian":
                new Pencarian();
                frame.dispose();
                break;
            case "Exit":
                System.exit(0);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + command);
        }
    }

    public static void main(String[] args) {

        new Main();

    }
}
