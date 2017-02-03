/**
 * @file MultiplicationTable.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 11/22/2014
 *
 * This java program to prints multiplication tables of a number entered by the
 * user using a for loop.
 */

package org.samovich.technologies.programs;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        // Local vars.
        int n, c;

        System.out.println(
                "Enter an integer to print it's multiplication table:");
        // A simple text Scanner which can parse primitive types and strings.
        Scanner in = new Scanner(System.in);

        // Scans the next token of the input as an int.
        n = in.nextInt();

        System.out.println("Multiplication table of "  + n + " is :-");

        // For loop
        for (c = 1; c <= 10; c++) {
            System.out.println(n + " * " + c + " = " + (n * c));
        }
    }

}

