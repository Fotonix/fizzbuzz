package com.vimond.fizzbuzz;

/**
 * FizzBuzz test application.<br>
 *
 * Write a program that prints the numbers from 1 to 100.
 * But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
 * For numbers which are multiples of both three and five print “FizzBuzz".
 *
 * @author Aleksei Zabezhinsky
 */
public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    /**
     * Main method.<br>
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a string storage and allocate max possible capacity
        StringBuilder result = new StringBuilder(FIZZ.length() + BUZZ.length());
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                result.append(FIZZ);
            }
            if (i % 5 == 0) {
                result.append(BUZZ);
            }
            if (result.length() == 0) {
                result.append(i);
            }
            System.out.println(result.toString());
            // Clear the string storage
            result.setLength(0);
        }
    }

}
