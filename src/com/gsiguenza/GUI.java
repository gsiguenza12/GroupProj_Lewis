package com.gsiguenza;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

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

        //Can be removed & replaced with getName() with coin object
        HashMap<String, String> coins = new HashMap<String, String>();

        //Can be removed & replaced with .getSymbol() with coin object
        HashMap<String, String> symbol = new HashMap<String, String>();

        // populating hashMaps
        populateCoinMap(coins);
        populateSymbolMap(symbol);

        TreeMap<String, ArrayList<Currency>> mainList;
        mainList = new TreeMap<>();

        /* Call the read file method here, for each coin text file. */
        test.readFile("Cardano", "(ADA)", ADA, mainList); /* Do this for each file */
        test.readFile("Bitcoin Cash", "(BCH)", BCH, mainList);
        test.readFile("Eos", "(EOS)", EOS, mainList);
        test.readFile("Ethereum", "(ETH)", ETH, mainList);
        test.readFile("Litecoin", "(LTC)", LTC, mainList);
        test.readFile("Ioda", "(MIOTA)", MIOTA, mainList);
        test.readFile("Tron", "(TRX)", TRX, mainList);
        test.readFile("Stellar", "(XLM)", XLM, mainList);
        test.readFile("Ripple", "(XRP)", XRP, mainList);

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

                JOptionPane.showMessageDialog(null, mainList.get("Cardano")
                                                +"\n" +mainList.get("Bitcoin Cash")
                        +"\n" +mainList.get("Eos")
                        +"\n" +mainList.get("Ethereum") +"\n" +mainList.get("Litecoin")
                        +"\n" +mainList.get("Ioda")+"\n" +mainList.get("Tron")
                        +"\n" +mainList.get("Stellar")+"\n" +mainList.get("Ripple"));

            }
        });
        buttonTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coinChoiceForData = JOptionPane.showInputDialog
                        (null, "Please enter a coin you would like to view data for: ");
                if (coinChoiceForData.equalsIgnoreCase("Cardano")){
                    JOptionPane.showMessageDialog(null, mainList.get("Cardano"));
                }
                else if (coinChoiceForData.equalsIgnoreCase("Bitcoin Cash")){
                    JOptionPane.showMessageDialog(null, mainList.get("Bitcoin Cash"));
                }
                else if (coinChoiceForData.equalsIgnoreCase("Eos")){
                    JOptionPane.showMessageDialog(null, mainList.get("Eos"));
                }
                else if (coinChoiceForData.equalsIgnoreCase("Ethereum")){
                    JOptionPane.showMessageDialog(null, mainList.get("Ethereum"));
                }
                else if (coinChoiceForData.equalsIgnoreCase("Litecoin")){
                    JOptionPane.showMessageDialog(null, mainList.get("Litecoin"));
                }
                else if (coinChoiceForData.equalsIgnoreCase("Ioda")){
                    JOptionPane.showMessageDialog(null, mainList.get("Ioda"));
                }
                else if (coinChoiceForData.equalsIgnoreCase("Tron")){
                    JOptionPane.showMessageDialog(null, mainList.get("Tron"));
                }
                else if (coinChoiceForData.equalsIgnoreCase("Stellar")){
                    JOptionPane.showMessageDialog(null, mainList.get("Stellar"));
                }
                else if (coinChoiceForData.equalsIgnoreCase("Ripple")){
                    JOptionPane.showMessageDialog(null, mainList.get("Ripple"));
                }
                //if userEntry is not equal to a coin
                else
                {
                    JOptionPane.showMessageDialog(null, "Coin not found in our database");
                }
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
