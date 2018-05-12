package com.gsiguenza;


import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JButton buttonOne;
    private JButton buttonTwo;
    private JButton buttonThree;
    private JButton buttonFour;
    private JButton buttonFive;
    private JButton buttonSix;
    private JButton buttonSeven;
    private JButton buttonEight;
    private JButton buttonNine;
    private JButton buttonTen;
    private JPanel MAIN_PANEL;

    public GUI() {
        buttonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showInputDialog
                        (null, "Please enter a date between Feb. 2018 - Apr. 2018");
            }
        });
        buttonTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showInputDialog
                        (null, "Please enter a coin you would like to view data for: ");
            }
        });
        buttonThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showInputDialog
                        (null, "Please enter a coin you would like to view highest % change for: ");
            }
        });
        buttonFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showInputDialog
                        (null, "Please enter a coin you would like to view lowest % change for: ");
            }
        });
        buttonFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showInputDialog
                        (null, "Please enter a coin you would like to view highest prices for: ");
            }
        });
        buttonSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showInputDialog
                        (null, "Please enter a coin you would like to view lowest prices for: ");
            }
        });
        buttonSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showInputDialog
                        (null, "Please enter a coin you would like to view highest opening prices for: ");
            }
        });
        buttonEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showInputDialog
                        (null, "Please enter a coin you would like to view lowest opening prices for: ");
            }
        });
        buttonNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showInputDialog
                        (null, "Please enter a coin you would like to view highest closing prices for: ");
            }
        });
        buttonTen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showInputDialog
                        (null, "Please enter a coin you would like to view lowest closing prices for: ");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CryptoTrack");
        frame.setContentPane(new GUI().MAIN_PANEL);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
