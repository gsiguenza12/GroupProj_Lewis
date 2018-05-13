package com.gsiguenza;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

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
    //Strings for coins
    public static final String ADA = "/Users/gabrielsiguenza/Documents/GitHub/GroupProj_Lewis/src/com/gsiguenza/Coins/ADA.txt";
    public static final String BCH = "/Users/gabrielsiguenza/Documents/GitHub/GroupProj_Lewis/src/com/gsiguenza/Coins/BCH.txt";
    public static final String EOS = "/Users/gabrielsiguenza/Documents/GitHub/GroupProj_Lewis/src/com/gsiguenza/Coins/EOS.txt";
    public static final String ETH = "/Users/gabrielsiguenza/Documents/GitHub/GroupProj_Lewis/src/com/gsiguenza/Coins/ETH.txt";
    public static final String LTC = "/Users/gabrielsiguenza/Documents/GitHub/GroupProj_Lewis/src/com/gsiguenza/Coins/LTC.txt";
    public static final String MIOTA = "/Users/gabrielsiguenza/Documents/GitHub/GroupProj_Lewis/src/com/gsiguenza/Coins/MIOTA.txt";
    public static final String TRX = "/Users/gabrielsiguenza/Documents/GitHub/GroupProj_Lewis/src/com/gsiguenza/Coins/TRX.txt";
    public static final String XLM = "/Users/gabrielsiguenza/Documents/GitHub/GroupProj_Lewis/src/com/gsiguenza/Coins/XLM.txt";
    public static final String XRP = "/Users/gabrielsiguenza/Documents/GitHub/GroupProj_Lewis/src/com/gsiguenza/Coins/XRP.txt";

    public GUI() {
        buttonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int choice = 0;
                String temp;
                boolean run = true;
                int day = 0;
                int date = 0;
                String dateString = null;
                StringBuilder sb = new StringBuilder();

                while (run) {
                        temp = JOptionPane.showInputDialog
                            (null, "Please enter a date between Feb. 2018 - Apr. 2018" +
                                    "\n To Use date from february select '1'" + "\n To use date from March select '2'" +
                                    "\n To use date from April select '3'");

                    try {
                        choice = Integer.parseInt(temp);
                    } catch (Exception i) {
                        JOptionPane.showMessageDialog(null, "Invalid option.");
                    }

                    //If user selected "february"
                    if (choice == 1) {
                        //adds month & '/' to sb
                        sb.append("02/");
                        //breaks loop
                        run = false;
                    }

                    //If user selected "march"
                    else if (choice == 2) {
                        //adds month & '/' to sb
                        sb.append("03/");
                        //breaks loop
                        run = false;
                    }

                    //If user selected "april"
                    else if (choice == 3) {
                        //adds month & '/' to sb
                        sb.append("04/");
                        //breaks loop
                        run = false;
                    }
                    //User input invalid choice
                    else {
                        JOptionPane.showMessageDialog(null, "\nInvalid choice! Try again!");
                    }
                }
                run = true;

                if (choice == 1) {
                    while (run) {
                        //output
                        temp = JOptionPane.showInputDialog(null, "Please enter a day for February (1-28)");
                        //Attempt to parse
                        try {
                            day = Integer.parseInt(temp);
                        } catch (Exception j) {
                            JOptionPane.showMessageDialog(null, "\nInvalid choice! Try again!");
                        }

                        //if day is between 1st & 9th
                        if (day > 0 && day < 10) {
                            //adds '0'before int if below 10 in String
                            sb.append("0");
                            //adds day to String sb
                            sb.append(day);
                            //breaks loop
                            run = false;
                        }
                        //if day is between 10th & 30th
                        else if (day > 9 && day < 29) {
                            //adds day to String sb
                            sb.append(day);
                            //breaks loop
                            run = false;
                        }
                        //invalid value
                        else {
                            JOptionPane.showMessageDialog(null, "\nInvalid choice! Try again!");
                        }
                    }
                }

                //User enters a date for March
                else if (choice == 2) {
                    while (run) {
                        //Output
                        temp = JOptionPane.showInputDialog(null, "Please enter a day for March (1-31)");
                        //Parse int
                        try {
                            day = Integer.parseInt(temp);
                        } catch (Exception j) {
                            JOptionPane.showMessageDialog(null, "\nInvalid choice! Try again!");
                        }
                        //if day is between 1st & 9th
                        if (day > 0 && day < 10) {
                            //adds '0'before int if below 10 in String
                            sb.append("0");
                            //adds day to String sb
                            sb.append(day);
                            //breaks loop
                            run = false;
                        }
                        //if day is between 10th & 31st
                        else if (day > 9 && day < 32) {
                            //adds day to String sb
                            sb.append(day);
                            //breaks loop
                            run = false;
                        }
                        //invalid value
                        else {
                            JOptionPane.showMessageDialog(null, "\nInvalid choice! Try again!");
                        }
                    }
                }

                //User enters a date for April
                else {
                    while (run) {
                        //Output
                        temp = JOptionPane.showInputDialog(null, "Please enter a day for April (1-30): ");
                        //Attempt to parse Int
                        try {
                            day = Integer.parseInt(temp);
                        } catch (Exception j) {
                            JOptionPane.showMessageDialog(null, "\nInvalid choice! Try again!");
                        }
                        //if day is between 1st & 9th
                        if (day > 0 && day < 10) {
                            //adds '0'before int if below 10 in String
                            sb.append("0");
                            //adds day to String sb
                            sb.append(day);
                            //breaks loop
                            run = false;
                        }
                        //if day is between 10th & 30th
                        else if (day > 9 && day < 31) {
                            //adds day to String sb
                            sb.append(day);
                            //breaks loop
                            run = false;
                        }
                        //invalid value
                        else {
                            JOptionPane.showMessageDialog(null, "\nInvalid choice! Try again!");
                        }
                    }
                }
                //Returns string for hashmap in format xx/xx
                //return dateString;
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

        //Can be removed & replaced with getName() with coin object
        HashMap<String, String> coins = new HashMap<String, String>();

        //Can be removed & replaced with .getSymbol() with coin object
        HashMap<String, String> symbol = new HashMap<String, String>();

        // populating coin and symbol HashMap
        populateCoinMap(coins);
        populateSymbolMap(symbol);

    }
    /**
     * @param coins
     */
    public static void populateCoinMap(HashMap<String, String> coins) {
        coins.put("btc", "Bitcoin");
        coins.put("eth", "Ethereum");
        coins.put("xrp", "Ripple");
        coins.put("bch", "Bitcoin Cash");
        coins.put("eos", "EOS");
        coins.put("ada", "Cardano");
        coins.put("ltc", "Litecoin");
        coins.put("xlm", "Stellar");
        coins.put("neo", "NEO");
        coins.put("trx", "TRON");
    }

    /**
     * @param symbol
     */
    public static void populateSymbolMap(HashMap<String, String> symbol) {
        symbol.put("btc", "(BTC)");
        symbol.put("eth", "(ETH)");
        symbol.put("xrp", "(XRP)");
        symbol.put("bch", "(BCH)");
        symbol.put("eos", "(EOS)");
        symbol.put("ada", "(ADA)");
        symbol.put("ltc", "(LTC)");
        symbol.put("xlm", "(XLM)");
        symbol.put("neo", "(NEO)");
        symbol.put("trx", "(TRX)");
    }

}
