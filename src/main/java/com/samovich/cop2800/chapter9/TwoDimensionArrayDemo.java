package com.samovich.cop2800.chapter9;

import java.util.Scanner;

/**
 * Filename TwoDimensionArrayDemo.java
 * Created by Valery Samovich
 * Written on 6/25/2016
 */
public class TwoDimensionArrayDemo {
    /**
     * Main method.
     * @param args
     */
    public static void main(String[] args) {
        // declare fields and objects
        int [][] count = new int[3][3];
        Scanner input = new Scanner(System.in);
        int row, column;
        final int QUIT = 99;

        // prompt the user to enter a row
        System.out.print("Enter a row or " + QUIT + " to quit > ");
        row = input.nextInt();

        while (row != QUIT) {
            System.out.print("Enter a column > ");
            column = input.nextInt();
            if (row < count.length && column < count[row].length) {
                count[row][column]++;
                // nested loop that displays each row and column
                // of the newly incremented array
                for (int r = 0; r < count.length; ++r) {
                    for (int c = 0; c < count[r].length; ++c) {
                        System.out.print(count[r][c] + " ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Invalid position selected");
            }
            System.out.print("Enter a row or " + QUIT + " to quit >");
            row = input.nextInt();
        }
    }
}
