package org.samovich.cop2800.chapter8;

/**
 * Filename PassArrayElement.java
 * Created by Valery Samovich
 * Written on 6/21/2016
 */
public class PassArrayElement {

    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {
        // declare fields
        final int NUM_ELEMENTS = 4;
        int[] someNums = {5, 10, 15, 20};
        int x;

        // print info and run loop over elements
        System.out.print("At start of main: ");
        for (x = 0; x < NUM_ELEMENTS; ++x)
            System.out.print(" " + someNums[x]);
        System.out.println();
        for (x = 0; x < NUM_ELEMENTS; ++x)
            methodGetsOneInt(someNums[x]);
        System.out.print("At end of main: ");
        for (x = 0; x < NUM_ELEMENTS; ++x)
            System.out.print(" " + someNums[x]);
        System.out.println();
    }

    /**
     *
     * @param one
     */
    private static void methodGetsOneInt(int one) {
        System.out.print("At start of method one is: " + one);
        one = 999;
        System.out.println(" and at end of method one is: " + one);
    }
}
