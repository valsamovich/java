/**
 * @file AssertTest.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 12/16/2014
 *
 * Demonstrates the assert with if statement with input.
 */

package com.samovich.specialized.junit;

import java.util.Scanner;

public class AssertTest {

    public static void main(String[] args) {

        // Create instance of Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number between 0 to 10: ");
        int number = input.nextInt();

        // Assert that the absolute value is >= 0
        if (!(number >= 0 && number <= 10))
            throw new AssertionError("Bad number: " + number);

        // Print the response
        System.out.printf("You entered %d\n", number);

    }
}
