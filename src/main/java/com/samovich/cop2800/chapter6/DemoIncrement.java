package com.samovich.cop2800.chapter6;

/**
 * Filename DemoIncrement.java
 * Created by Valery Samovich
 * Written on 6/7/2016
 */
public class DemoIncrement {

    public static void main(String[] args) {

        // declare variables
        int v = 4;
        int plusPlusV = ++v;
        v = 4;
        int vPlusPlus = v++;

        // display values
        System.out.println("v is " + v);
        System.out.println("++v is " + plusPlusV);
        System.out.println("v++ is " + vPlusPlus);

        int w = 17, x = 17, y = 18;
        boolean compare1 = (++w == y);
        boolean compare2 = (x++ == y);

        // display values
        System.out.println("First compare is " + compare1);
        System.out.println("Second compare is " + compare2);
    }
}
