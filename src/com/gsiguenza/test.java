package com.gsiguenza;

import java.io.*;
import java.util.*;

/**
 * A class for reading in data from text files, creates instances of the Currency class to be stored into hashMap.
 */
public class test{

    /**
     * Static method to read in Coin information from files.
     *
     * @post original Map is passed in by reference so changes should be reflected in main.
     *
     * @param coinName the current coin name to be paired with the list of coins.
     * @param FILEPATH the location of the text file.
     * @param originalMap pass in a tree map from main that will be used to build the database.
     *
     */
    public static void readFile(String coinName, String coinSymbol, String FILEPATH, TreeMap<String, ArrayList<Currency>> originalMap) {

        //This variables will be use to hold the variables from the file
        int count = 0;

        Scanner in;
        String[] wordChunk;
        int chunkSize = 9;

        ArrayList<Currency> coinsList = new ArrayList<>();

        originalMap.put(coinName, coinsList);
//        Currency[] a = new Currency[];

//        coins.
        //TODO: Move into method that handles all the file reading.
        /*
        Alternatively could consolidate all 3 files into one text file.
         */
        try {
            Currency test = new Currency();
            in = new Scanner(new FileReader(FILEPATH));
//            in.useDelimiter(",");

            wordChunk = new String[chunkSize];

            while (in.hasNextLine()) {
                count++;
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

//                for (int i = 0; i < chunkSize; i++) {
//                    System.out.println("String: " + wordChunk[i]);
//                }

                test.setCoinName(coinName);
                test.setCoinSymbol(coinSymbol);
                test.setDate(new Date(wordChunk[0],Integer.parseInt(removePunctuation(wordChunk[1])),Integer.parseInt(wordChunk[2])));
                test.setCoinOpenPrice(Double.parseDouble(wordChunk[3]));
                test.setCoinPriceHigh(Double.parseDouble(wordChunk[4]));
                test.setCoinPriceLow(Double.parseDouble(wordChunk[5]));
                test.setCoinClosePrice(Double.parseDouble(wordChunk[6]));
                test.setCoinOpenPrice(Float.parseFloat(removePunctuation(wordChunk[7])));
                test.setCoinClosePrice(Float.parseFloat(removePunctuation(wordChunk[8])));

                System.out.println(test);

                coinsList.add(test);
//                System.out.println(); // print a line.


            }
            in.close();

        } catch (NoSuchElementException e) {
//            System.out.println("Caught: NoSuchElementException");
            // terminate loop?

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Finished reading files...");

        System.out.println(originalMap);
//        System.out.println("Current HashMap size " + coins.size());

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