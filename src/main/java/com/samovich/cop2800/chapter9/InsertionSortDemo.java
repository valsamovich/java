package com.samovich.cop2800.chapter9;

import java.util.Scanner;

/**
 * Filename BubbleSortDemo.java
 * Created by Valery Samovich
 * Written on 6/21/2016
 */
public class InsertionSortDemo {

    /**
     * Main method.
     * @param args
     */
    public static void main(String[] args) {
        // declare fields
        int[] someNums = new int[5];
        Scanner keyboard = new Scanner(System.in);
        int a, b, temp;

        // loop to store user input in array
        for (a = 0; a < someNums.length; ++a) {
            System.out.print("Enter number " + (a + 1) + " >> ");
            someNums[a] = keyboard.nextInt();
        }

        // call display method
        display(someNums, 0);

        // statements that perform the insertion sort
        a = 1;
        while (a < someNums.length) {
            temp = someNums[a];
            b = a - 1;
            while ( b >= 0 && someNums[b] > temp) {
                someNums[b + 1] = someNums[b];
                --b;
            }
            someNums[b + 1] = temp;
            display(someNums, a);
            ++a;
        }
    }

    /**
     * Loop over array and print numbers
     * @param someNums array of numbers
     * @param a represent a number
     */
    private static void display(int[] someNums, int a) {
        System.out.print("Iteration " + a + ": ");
        for (int x = 0; x < someNums.length; ++x) {
            System.out.print(someNums[x] + " ");
        }
        System.out.println();
    }
}
