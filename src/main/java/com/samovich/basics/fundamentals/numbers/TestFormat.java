/**
 * @file TestFormat.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/02/06
 */

package com.samovich.basics.fundamentals.numbers;

import java.util.Calendar;

public class TestFormat {

    public static void main(String[] args) {

        // "n" A new line character appropriate to the platform running
        // the application. You should always use %n, rather than \n.

        System.out.println("Integers:");
        long n = 461012;
        // A decimal integer with new line
        System.out.format("%d%n", n);
        // Eight characters in width, with leading zeroes as necessary.
        System.out.format("%08d%n", n);
        System.out.println("");

        System.out.println("Floats:");
        System.out.println("Numbers:");
        double pi = Math.PI;
        // A float
        System.out.format("%f%n", pi);
        // Three places after decimal point.
        System.out.format("%.3f%n", pi);
        System.out.println("");

        System.out.println("Date & Time Conversation:");
        Calendar c = Calendar.getInstance();
        // http://docs.oracle.com/javase/tutorial/java/data/numberformat.html
        System.out.format("%tB %te, %tY%n", c, c, c);
        System.out.format("%tl:%tM %tp%n", c, c, c);
        System.out.format("%tD%n", c);

    }

}
