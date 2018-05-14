package com.gsiguenza;

import java.io.*;
import java.util.*;

/**
 * A class for reading in data from text files, creates instances of the Currency class to be stored into hashMap.
 */
public class test{
    public static final String BORDER = "-------------------------------";
    public static final String ADA = "/Users/gabrielsiguenza/Documents/GitHub/GroupProj_Lewis/src/com/gsiguenza/Coins/ADA.txt";
    public static final String BCH = "/Users/gabrielsiguenza/Documents/GitHub/GroupProj_Lewis/src/com/gsiguenza/Coins/BCH.txt";
    public static final String EOS = "/Users/gabrielsiguenza/Documents/GitHub/GroupProj_Lewis/src/com/gsiguenza/Coins/EOS.txt";
    public static final String ETH = "/Users/gabrielsiguenza/Documents/GitHub/GroupProj_Lewis/src/com/gsiguenza/Coins/ETH.txt";
    public static final String LTC = "/Users/gabrielsiguenza/Documents/GitHub/GroupProj_Lewis/src/com/gsiguenza/Coins/LTC.txt";
    public static final String MIOTA ="/Users/gabrielsiguenza/Documents/GitHub/GroupProj_Lewis/src/com/gsiguenza/Coins/MIOTA.txt";
    public static final String TRX = "/Users/gabrielsiguenza/Documents/GitHub/GroupProj_Lewis/src/com/gsiguenza/Coins/TRX.txt";
    public static final String XLM = "/Users/gabrielsiguenza/Documents/GitHub/GroupProj_Lewis/src/com/gsiguenza/Coins/XLM.txt";
    public static final String XRP = "/Users/gabrielsiguenza/Documents/GitHub/GroupProj_Lewis/src/com/gsiguenza/Coins/XRP.txt";

    public static void main(String[] args) {
        //This variables will be use to hold the variables from the file
        String key;
        String openPrices;
        String high;
        String low;
        String closePrice;
        String volume;
        String marketCap;
        Scanner in;
        String[] wordChunk;
        int chunkSize = 9;

        //useless
        TreeMap<String, Currency> coins = new TreeMap<>();

        //TODO: Move into method that handles all the file reading.
        /*
        Alternatively could consolidate all 3 files into one text file.
         */
        try {
            Currency test = new Currency();
            in = new Scanner(new FileReader(ADA));
//            in.useDelimiter(",");

            wordChunk = new String[chunkSize];

            test.setCoinName(in.next());

            while (in.hasNextLine()) {

                // reading in 7 variables for coin.
                for (int i = 0; i < chunkSize; i++) {

                    wordChunk[i] = (in.next());

                }

                // each index of wordChunk should hold 1 of the String variables.

                /*
                public Currency(String coinName, String coinSymbol, double coinPriceHigh, double coinPriceLow, double coinOpenPrice, double coinClosePrice,
                    double coinCirculating, double coinMarket){
                setAll(coinName,coinSymbol,coinPriceHigh,coinPriceLow,coinOpenPrice,coinClosePrice,coinCirculating,coinMarket);
                }
                 */

                for (int i = 0; i < chunkSize; i++) {
                    System.out.println("String: " + wordChunk[i]);
                }

                test.setCoinName("Cardano");
                test.setDate(new Date(wordChunk[0],Integer.parseInt(removePunctuation(wordChunk[1])),Integer.parseInt(wordChunk[2])));
                System.out.println(test);
                test.setCoinOpenPrice(Double.parseDouble(wordChunk[3]));
                test.setCoinPriceHigh(Double.parseDouble(wordChunk[4]));
                test.setCoinPriceLow(Double.parseDouble(wordChunk[5]));
                test.setCoinClosePrice(Double.parseDouble(wordChunk[6]));
                test.setCoinOpenPrice(Double.parseDouble(removePunctuation(wordChunk[7])));
                test.setCoinClosePrice(Double.parseDouble(removePunctuation(wordChunk[8])));

            }
            in.close();

        } catch (NoSuchElementException e) {
            System.out.println("Caught: NoSuchElementException");
            // terminate loop?

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    /**
     * Uses String regex to remove punctuation from Strings read from file.
     *
     * @param word String original word that may contain punctuation
     * @return removed String with punctuation removed
     */
    public static String removePunctuation(String word) {
        // remove all punctuation using regex.
        String removed = word.replaceAll("\\W", "").trim();

        return removed;
    }
}