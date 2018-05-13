package com.gsiguenza;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/****************************************************************************
 * AUTHORS: Gabriel Siguenza, Michael Fogel, Steven Peter Molina
 * COURSE: CS 113
 * Monday 5:30 PM - 9:20 PM
 * Assignment: Final Project
 * PROJECT #: Date.java
 * LAST MODIFIED: 05/07/2018
 *****************************************************************************/

public class GUI {

    //Buttons
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
    //Panels
    private JPanel MAIN_PANEL;
    private JPanel listPanel;
    //Labels
    private JLabel listTitle;
    private JLabel numOne;
    private JLabel numTwo;
    private JLabel numThree;
    private JLabel numFour;
    private JLabel numFive;
    private JLabel numSix;
    private JLabel numSeven;
    private JLabel numEight;
    private JLabel numNine;
    private JLabel numTen;
    //Strings for input
    private String coinChoiceForData;
    private String coinChoiceForHighChange;
    private String coinChoiceForLowChange;
    private String highPriceCoin;
    private String lowPriceCoin;
    private String openHigh;
    private String openLow;
    private String closeHigh;
    private String closeLow;

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
                coinChoiceForData = JOptionPane.showInputDialog
                        (null, "Please enter a coin you would like to view data for: ");
            }
        });
        buttonThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coinChoiceForHighChange = JOptionPane.showInputDialog
                        (null, "Please enter a coin you would like to view highest % change for: ");
            }
        });
        buttonFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coinChoiceForLowChange = JOptionPane.showInputDialog
                        (null, "Please enter a coin you would like to view lowest % change for: ");
            }
        });
        buttonFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                highPriceCoin = JOptionPane.showInputDialog
                        (null, "Please enter a coin you would like to view highest prices for: ");
            }
        });
        buttonSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lowPriceCoin = JOptionPane.showInputDialog
                        (null, "Please enter a coin you would like to view lowest prices for: ");
            }
        });
        buttonSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openHigh = JOptionPane.showInputDialog
                        (null, "Please enter a coin you would like to view highest opening prices for: ");
            }
        });
        buttonEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openLow = JOptionPane.showInputDialog
                        (null, "Please enter a coin you would like to view lowest opening prices for: ");
            }
        });
        buttonNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closeHigh = JOptionPane.showInputDialog
                        (null, "Please enter a coin you would like to view highest closing prices for: ");
            }
        });
        buttonTen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closeLow = JOptionPane.showInputDialog
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
