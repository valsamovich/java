/**
 * @file MultiplicationTables.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 11/22/2014
 *
 * This java program to prints tables of number between a given range say a to b.
 */

package com.samovich.technologies.programs;

import java.util.Scanner;

public class MultiplicationTables {

    public static void main(String[] args) {

        // Local vars.
        int a, b, c, d;

        System.out.println(
                "Enter range of numbers to print their multiplication table:");

        // A simple text Scanner which can parse primitive types and strings.
        Scanner in = new Scanner(System.in);

        // Vars declaration.
        a = in.nextInt();
        b = in.nextInt();

        for (c = a; c <= b; c++) {
            System.out.println("Multiplication table of " + c);
        }

        for (d = 1; d <= 10; d++) {
            System.out.println(c + " * " + d + " = " + (c * d));
        }
    }
}
