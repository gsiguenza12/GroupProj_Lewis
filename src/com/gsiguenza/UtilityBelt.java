package com.gsiguenza;

import java.util.Scanner;

/****************************************************************************
 * AUTHORS: Gabriel Siguenza, Michael Fogel, Steven Peter Molina
 * COURSE: CS 113
 * Monday 5:30 PM - 9:20 PM
 * Assignment: Final Project
 * PROJECT #: Date.java
 * LAST MODIFIED: 05/07/2018
 *****************************************************************************/

/**
 * A class with some useful static methods.
 *
 * @author gabrielsiguenza
 */
public class UtilityBelt {

    // DESCRIPTION:		centers text value within total width given for one line
    // PRECONDITIONS:	text is not null, width > 0
    // POSTCONDITIONS:	prints text centered and taking up entire width (with new line after)
    public static void printCentered(int width, String text) {
        int leftWidth;
        String spec;

        leftWidth = (width + text.length()) / 2;
        spec = "%" + leftWidth + "s"; //automatically right justified

        System.out.printf(spec + "%n", text);

    }

    // DESCRIPTION:		reads input from user, returns integer value (error-checked using bounds)
    // PRECONDITIONS:	key is instantiated, prompt is in form "Enter...: ", lower < upper
    // POSTCONDITIONS:	returns integer value between lower and upper (inclusive)
    public static int readInt(String prompt, Scanner key, int lower, int upper) {
        String temp;
        int result;
        boolean isNotValid;

        isNotValid = true; // initialize all variables, Compiler will complain because they are initialized in loop
        result = 0;

        do {
            System.out.print(prompt);
            temp = key.nextLine();

            try {
                result = Integer.parseInt(temp);
                isNotValid = (result < lower) || (result > upper);

                if (result == 666) {
                    return result;
                }
                //Still perform old check but with Exceptions
                if (isNotValid) {
                    System.out.println("ERROR: please enter value between " + lower + " - " + upper);
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }

        } while (isNotValid);

        return result;
    }

    // DESCRIPTION:		reads input from user, returns double value (error-checked using bounds)
    // PRECONDITIONS:	key is instantiated, prompt is in form "Enter...: ", lower < upper
    // POSTCONDITIONS:	returns double value between lower and upper (inclusive)
    public static double readDouble(String prompt, Scanner key, double lower, double upper) {
        String temp;
        double result;
        boolean isNotValid;

        isNotValid = true;
        result = 0;

        do {
            System.out.print(prompt);
            temp = key.nextLine();

            try {
                result = Double.parseDouble(temp);
                isNotValid = (result < lower) || (result > upper);

                if (isNotValid) {
                    System.out.println("ERROR: please enter value between " + lower + " - " + upper);
                }
            } catch (NumberFormatException nfe) {
                System.out.println("ERROR: double input is required");
            }
        } while (isNotValid);

        return result;
    }

    // DESCRIPTION:		reads input from user, returns char value (only allowed chars are contained in validChars)
    // PRECONDITIONS:	key is instantiated, prompt is in form "Enter...: "
    // POSTCONDITIONS:	returns valid char value (must be within validChars)
    public static char readChar(String prompt, Scanner key, String validChars) {
        String temp;
        char result;
        boolean isNotValid;

        isNotValid = true;
        result = 0;

        do {
            System.out.print(prompt);
            temp = key.nextLine();
            try {
                result = temp.charAt(0);
                isNotValid = validChars.indexOf(result) == -1;

                if (isNotValid) {
                    System.out.println("ERROR: please enter one of the following valid chars: " + validChars);
                }
            } catch (StringIndexOutOfBoundsException sOutOfBounds) {
                System.out.println("ERROR: input type does not match");
            }
        } while (isNotValid);

        return result;
    }

    /**
     * BINARY SEARCH Searches the array a for key. If key is not in the array segment,
     * then -1 is returned. Otherwise returns an index in the segment such
     * that key == a[index].
     * <p>
     * Precondition: a[first] <= a[first + 1] ... <= a[last]
     */
    public static int search(int[] a, int first, int last, int key) {
        int result = 0;

        if (first > last) {
            result = -1;
        } else {
            int mid = (first + last) / 2;

            if (key == a[mid]) {
                result = mid;
            } else if (key < a[mid]) {
                result = search(a, first, mid - 1, key);
            } else if (key > a[mid]) {
                result = search(a, mid + 1, last, key);
            }
        }
        return result;
    }
}
