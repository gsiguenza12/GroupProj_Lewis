package com.gsiguenza;

/****************************************************************************
 * AUTHORS: Gabriel Siguenza, Michael Fogel, Steven Peter Molina
 * COURSE: CS 113
 * Monday 5:30 PM - 9:20 PM
 * Assignment: Final Project
 * PROJECT #: CryptoDatabase.java
 * LAST MODIFIED: 05/06/2018
 *****************************************************************************
 * CryptoDatabase.java
 *****************************************************************************
 * PROGRAM DESCRIPTION:
 * Program CryptoDatabase keeps track of data for the top ten Crypto Currencies
 * and provides various sorting methods for data analysis for the user.
 *****************************************************************************
 * ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
 * Scanner = used for console input
 *****************************************************************************/

import java.util.HashMap;
import java.util.Scanner;
public class Main
{
    public static final String BORDER = "-------------------------------";
    public static final String ADA = "/Users/gabrielsiguenza/Documents/GitHub/GroupProj_Lewis/src/com/gsiguenza/Coins/ADA.txt";
    public static final String BCH = "/Users/gabrielsiguenza/Documents/GitHub/GroupProj_Lewis/src/com/gsiguenza/Coins/BCH.txt";
    public static final String EOS = "/Users/gabrielsiguenza/Documents/GitHub/GroupProj_Lewis/src/com/gsiguenza/Coins/EOS.txt";
    public static final String ETH = "/Users/gabrielsiguenza/Documents/GitHub/GroupProj_Lewis/src/com/gsiguenza/Coins/ETH.txt";
    public static final String LTC = "/Users/gabrielsiguenza/Documents/GitHub/GroupProj_Lewis/src/com/gsiguenza/Coins/LTC.txt";
    public static final String MIOTA = "/Users/gabrielsiguenza/Documents/GitHub/GroupProj_Lewis/src/com/gsiguenza/Coins/MIOTA.txt";
    public static final String TRX = "/Users/gabrielsiguenza/Documents/GitHub/GroupProj_Lewis/src/com/gsiguenza/Coins/TRX.txt";
    public static final String XLM = "/Users/gabrielsiguenza/Documents/GitHub/GroupProj_Lewis/src/com/gsiguenza/Coins/XLM.txt";
    public static final String XRP = "/Users/gabrielsiguenza/Documents/GitHub/GroupProj_Lewis/src/com/gsiguenza/Coins/XRP.txt";


    public static void main(String[] args)
    {
        /** Initializations and Declarations **/
        Scanner keyboard = new Scanner (System.in);
        String temp;
        int choice = 0;
        boolean run = true;

        //Can be removed & replaced with getName() with coin object
        HashMap<String, String> coins = new HashMap<String, String>();

        //Can be removed & replaced with .getSymbol() with coin object
        HashMap<String, String> symbol = new HashMap<String, String>();


        /** Program Output **/
        System.out.println("Welcome to the Crypto Currency Database!");
        printCoins(coins,symbol);

        /** User Input + Processing**/
        while(run)
        {
            System.out.println("\nPlease select from the following options:");
            System.out.println("To display ALL coin data for a specific date.... Enter '1'");
            System.out.println("To search for data on a specific coin........... Enter '2'");
            System.out.println("To sort by highest % change (vs. previous day).. Enter '3'");
            System.out.println("To sort by lowest % change (vs. previous day)... Enter '4'");
            System.out.println("To sort by highest price........................ Enter '5'");
            System.out.println("To sort by lowest price......................... Enter '6'");
            System.out.println("To sort by highest opening price................ Enter '7'");
            System.out.println("To sort by lowest opening price................. Enter '8'");
            System.out.println("To sort by highest closing price................ Enter '9'");
            System.out.println("To sort by lowest closing price................. Enter '10'");
            System.out.print("Choice: ");

            //User input
            temp = keyboard.nextLine();

            //Error checking user input
            try
            {
                choice = Integer.parseInt(temp);
            }
            catch(Exception e)
            {
                System.out.println("\nInvalid choice! Try again!");
            }

            /** User options **/

            /* Should be replaced with switch */
            //Displays all coin data for specific date
            if(choice == 1)
            {
                System.out.println("Please enter a date between between Feb. 2018 - Apr. 2018");

                //INPUT AND RETRIEVAL METHODS TO BE ADDED


                //End of choice
                run = Main.repeat();
            }

            //Search for data for a specific coin, user enters date range
            else if(choice == 2)
            {
                System.out.print("Please enter a coin you would like to view data for: ");
                //INPUT to be added

                System.out.println("Please enter a date range to retrieve data from: ");
                //INPUT to be added


                //INPUT AND RETRIEVAL METHODS TO BE ADDED


                //End of choice
                run = Main.repeat();
            }

            //Sorts highest % change for a specific coin (vs. previous day)
            else if(choice == 3)
            {
                System.out.print("Please enter a coin you would like to view highest % change for: ");
                //INPUT to be added

                //INPUT AND SORTING METHODS TO BE ADDED

                //End of choice
                run = Main.repeat();
            }

            //Sorts lowest % change for a specific coin (vs. previous day)
            else if(choice == 4)
            {
                System.out.print("Please enter a coin you would like to view lowest % change for: ");
                //INPUT to be added

                //INPUT AND SORTING METHODS TO BE ADDED

                //End of choice
                run = Main.repeat();
            }

            //Sorts highest - lowest coin price for specific coin
            else if(choice ==5)
            {
                System.out.print("Please enter a coin you would like to view highest prices for: ");
                //INPUT to be added

                //INPUT AND SORTING METHODS TO BE ADDED

                //End of choice
                run = Main.repeat();
            }

            //Sorts lowest - highest coin price for specific coin
            else if(choice == 6)
            {
                System.out.print("Please enter a coin you would like to view lowest prices for: ");
                //INPUT to be added

                //INPUT AND SORTING METHODS TO BE ADDED

                //End of choice
                run = Main.repeat();
            }

            //Sorts highest - lowest opening coin price
            else if(choice == 7)
            {
                System.out.print("Please enter a coin you would like to view highest opening prices for: ");
                //INPUT to be added

                //INPUT AND SORTING METHODS TO BE ADDED

                //End of choice
                run = Main.repeat();
            }

            //Sorts lowest - highest opening coin price
            else if(choice == 8)
            {
                System.out.print("Please enter a coin you would like to view lowest opening prices for: ");
                //INPUT to be added

                //INPUT AND SORTING METHODS TO BE ADDED

                //End of choice
                run = Main.repeat();
            }

            //Sorts highest - lowest closing coin price
            else if(choice == 9)
            {
                System.out.print("Please enter a coin you would like to view highest closing prices for: ");
                //INPUT to be added

                //INPUT AND SORTING METHODS TO BE ADDED

                //End of choice
                run = Main.repeat();
            }

            //Sorts lowest - highest closing coin price
            else if(choice == 10)
            {
                System.out.print("Please enter a coin you would like to view lowest closing prices for: ");
                //INPUT to be added

                //INPUT AND SORTING METHODS TO BE ADDED

                //End of choice
                run = Main.repeat();
            }

            //User input invalid choice
            else
            {
                System.out.println("\nInvalid choice! Try again!");
            }
        }

        //End of program
        System.exit(0);
    }

    //Method determines whether user wants to rerun the program or exit
    public static boolean repeat()
    {
        /**Initializations + Declarations */
        Scanner keyboard = new Scanner(System.in);
        String repeat = null;

        /** Output + prompt for input */
        System.out.println("\nWould you like to select another choice? (Yes/No)");
        repeat = keyboard.nextLine();

        /** Processing */
        //if yes
        if(repeat.equalsIgnoreCase("yes"))
        {
            System.out.println("\nReturning back to the main menu!\n");
            return true;
        }
        //if no
        else if(repeat.equalsIgnoreCase("no"))
        {
            System.out.println("\nThank you for using the Crypto Currency Database. Goodbye!");
            return false;
        }

        // Second chance if user inputs incorrect values (before program exits)
        else
        {
            System.out.println("\nWould you like to select another choice? (Yes/No)");
            repeat = keyboard.nextLine();
            //if yes
            if(repeat.equalsIgnoreCase("yes"))
            {
                System.out.println("\nReturning back to the main menu!\n");
                return true;
            }
            //if no or incorrect values
            else
            {
                System.out.println("\nThank you for using the Crypto Currency Database. Goodbye!");
                return false;
            }
        }
    }
    
    //User menu for date selection, outputs String value to use for hashmap
    public static String dateConvert()
    {
	Scanner keyboard = new Scanner(System.in);
	String temp = null;
	int choice = 0;
	boolean run = true;
	int day = 0;
	int date = 0;
	String dateString = null;
	StringBuilder sb = new StringBuilder();
		
	//User selects month from menu
	while(run)
	{
		//Output
		System.out.println("\nPlease select from the following options:\n");
        	System.out.println("To use a date from February.. Enter '1'");
       		System.out.println("To use a date from March..... Enter '2'");
            	System.out.println("To use a date from April..... Enter '3'");
            	
		//Input
            	temp = keyboard.nextLine();
		
		//Attempt to parse month choice
            	try
            	{
			choice = Integer.parseInt(temp);
		}
		catch(Exception e)
		{
			System.out.println("\nInvalid choice! Try again!\n");
		}
            	
		//If user selected "february"
            	if(choice == 1)
            	{
			//adds month & '/' to sb
			sb.append("02/");
			//breaks loop
			run = false;
            	}
		
		//If user selected "march"
            	else if(choice == 2)
            	{
			//adds month & '/' to sb
                	sb.append("03/");
			//breaks loop
                	run = false;
            	}

		//If user selected "april"
            	else if(choice == 3)
            	{
			//adds month & '/' to sb
               		sb.append("04/");
			//breaks loop
               		run = false;
            	}
            	//User input invalid choice
            	else
            	{
                	System.out.println("\nInvalid choice! Try again!\n");
            	}	
	}
	//Reset to run next loop
	run = true;
	
	//If user selects february
	if(choice == 1)
	{
		while(run)
		{
			//output
			System.out.print("Please enter a day for February (1-28): ");
			//input
			temp = keyboard.nextLine();
			//Attempt to parse	
			try
			{
				day = Integer.parseInt(temp);
			}
			catch(Exception e)
			{
				System.out.println("\nInvalid choice! Try again!\n");
			}
			
			//if day is between 1st & 9th
			if(day > 0 && day < 10)
			{
				//adds '0'before int if below 10 in String
				sb.append("0");
				//adds day to String sb
				sb.append(day);
				//breaks loop
				run = false;
			} 
			//if day is between 10th & 30th
			else if(day > 9 && day < 29)
			{
				//adds day to String sb
				sb.append(day);
				//breaks loop
				run = false;
			} 
			//invalid value
			else
			{
				System.out.println("\nInvalid choice! Try again!\n");
			}
		}
	}
			
	//User enters a date for March 
	else if(choice == 2)
	{
		while(run)
		{			
			//Output							
			System.out.print("Please enter a day for March (1-31): ");
			temp = keyboard.nextLine();
				
			//Parse int
			try
			{
				day = Integer.parseInt(temp);
			}
			catch(Exception e)
			{
				System.out.println("\nInvalid choice! Try again!\n");
			}
			//if day is between 1st & 9th		
			if(day > 0 && day < 10)
			{
				//adds '0'before int if below 10 in String
				sb.append("0");
				//adds day to String sb
				sb.append(day);
				//breaks loop
				run = false;
			} 
			//if day is between 10th & 31st
			else if(day > 9 && day < 32)
			{
				//adds day to String sb
				sb.append(day);
				//breaks loop
				run = false;
			}
			//invalid value
			else
			{
				System.out.println("\nInvalid choice! Try again!\n");
			}
		}
	}
			
	//User enters a date for April
	else
	{
		while(run)
		{
			//Output
			System.out.print("Please enter a day for April (1-30): ");
			temp = keyboard.nextLine();
					
			//Attempt to parse Int
			try
			{
				day = Integer.parseInt(temp);
			}
			catch(Exception e)
			{
				System.out.println("\nInvalid choice! Try again!\n");
			}
			//if day is between 1st & 9th
			if(day > 0 && day < 10)
			{
				//adds '0'before int if below 10 in String
				sb.append("0");
				//adds day to String sb
				sb.append(day);
				//breaks loop
				run = false;
			} 
			//if day is between 10th & 30th
			else if(day > 9 && day < 31)
			{
				//adds day to String sb
				sb.append(day);
				//breaks loop
				run = false;
			} 
			//invalid value
			else
			{
				System.out.println("\nInvalid choice! Try again!\n");
			}
		}
	}
	//Returns string for hashmap in format xx/xx
	return dateString;
    }

    /**
     *
     * @param coins
     * @param symbol
     */
    public static void printCoins(HashMap<String, String> coins, HashMap<String, String> symbol) {
        System.out.println("\nHere is our selection of the top coins available");
        System.out.println("for analysis from 02/01/2018 - 04/30/2018:");
        System.out.println(BORDER);
        System.out.printf("| 1.  %-15s %5s   |\n", coins.get("btc"), symbol.get("btc") ); //Can replace with .getName() method for each coin
        System.out.printf("| 2.  %-15s %5s   |\n", coins.get("eth"), symbol.get("eth") ); //Can replace with .getName() method for each coin
        System.out.printf("| 3.  %-15s %5s   |\n", coins.get("xrp"), symbol.get("xrp") ); //Can replace with .getName() method for each coin
        System.out.printf("| 4.  %-15s %5s   |\n", coins.get("bch"), symbol.get("bch") ); //Can replace with .getName() method for each coin
        System.out.printf("| 5.  %-15s %5s   |\n", coins.get("eos"), symbol.get("eos") ); //Can replace with .getName() method for each coin
        System.out.printf("| 6.  %-15s %5s   |\n", coins.get("ada"), symbol.get("ada") ); //Can replace with .getName() method for each coin
        System.out.printf("| 7.  %-15s %5s   |\n", coins.get("ltc"), symbol.get("ltc") ); //Can replace with .getName() method for each coin
        System.out.printf("| 8.  %-15s %5s   |\n", coins.get("xlm"), symbol.get("xlm") ); //Can replace with .getName() method for each coin
        System.out.printf("| 9.  %-15s %5s   |\n", coins.get("neo"), symbol.get("neo") ); //Can replace with .getName() method for each coin
        System.out.printf("| 10. %-14s  %5s   |\n", coins.get("trx"), symbol.get("trx") ); //Can replace with .getName() method for each coin
        System.out.println(BORDER);
    }

    /**
     *
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
     *
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
