package com.samovich.cop2800.chapter2;

import javax.swing.JOptionPane;

/**
 * Filename Eggs.java
 * Created by Valery Samovich
 * Written on 5/18/16
 */
public class Eggs {

    public static void main(String[] args) {

        // declare variables
        String eggString;
        int eggNumber;
        int dozenNumber;
        int dozenRemainder;
        final double COST_PER_DOZEN = 3;
        final double COST_PER_EGG = 0.3;
        double totalPrice;

        // prompt the user to accept value
        eggString = JOptionPane.showInputDialog(
                null,
                "Enter the number of eggs you purchased:",
                "Egg Count",
                JOptionPane.INFORMATION_MESSAGE);

        // convert string to an number
        eggNumber = Integer.parseInt(eggString);

        // dozen calculation based on input
        dozenNumber = eggNumber / 12;
        dozenRemainder = eggNumber % 12;

        System.out.println("Dozen number: " + dozenNumber);
        System.out.println("Dozen remainder: " + dozenRemainder);

        // total price calculation
        totalPrice = dozenNumber * COST_PER_DOZEN + dozenRemainder * COST_PER_EGG;
        System.out.println("Total price: " + totalPrice);

        // prompt the dialog box with price information
        JOptionPane.showMessageDialog(null,
                "The total price of your eggs is $" + String.format("%.2f", totalPrice),
                "Egg Prices",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
