package com.gsiguenza;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;



public class test{

    public static void main(String[] args) {
        //HAshMap that holds multiple values with the same key
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        //testing if it works
        List<String> setOne = new ArrayList<String>();
        setOne.add("Hello");
        setOne.add("bye");

    for (Map.Entry<String, List<String>> entry : map.entrySet()) {

            System.out.println("\n"+entry.getKey()+" "+setOne.get(0));

        }
    }
}