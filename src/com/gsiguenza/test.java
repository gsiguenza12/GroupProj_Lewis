package com.gsiguenza;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;



public class test{

    public static void main(String[] args) {
        //This variables will be use to hold the variables from the file
        String key;
        String openPrices;
        String high;
        String low;
        String closePrice;
        String volume;
        String market;



        //will make a for lope that will go by each line store the values
        // and after when it reaches the end. Then have an other for lope that will put them in
        //the hashMap.
        //reading in file
        try {
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));

        }catch (IOException e){
            System.out.println("File not found");
        }

        //HAshMap that holds multiple values with the same key
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        //testing if it works
        List<String> setOne = new ArrayList<String>();
        setOne.add("Hello");
        setOne.add("bye");
//print out the entry for the key
    for (Map.Entry<String, List<String>> entry : map.entrySet()) {

            System.out.println("\n"+entry.getKey()+" "+setOne.get(0));

        }
    }
}