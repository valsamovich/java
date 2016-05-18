package com.samovich.cop2800.chapter2;

import javax.swing.*;

/**
 * Filename Eggs.java
 * Created by Valery Samovich
 * Written on 5/16/16
 */
public class Eggs {

    public static void main(String[] args) {

        // declare variables
        String eggsAsString;
        int eggsAsNumber;
        int numberOfDozen;
        int remainderDozen;
        double dozenOfEggs = 3;
        double singleEggPrize = 0.3;
        double totalPrice;

        // prompt the user to accept value
        eggsAsString = JOptionPane.showInputDialog(
                null,
                "Enter the number of eggs purchased:",
                "Egg Count",
                JOptionPane.INFORMATION_MESSAGE);

        // convert string to an number
        eggsAsNumber = Integer.parseInt(eggsAsString);

        // dozen calculation based on input
        numberOfDozen= eggsAsNumber/12;
        remainderDozen = eggsAsNumber%12;

        // total price calculation
        totalPrice = numberOfDozen * dozenOfEggs + remainderDozen * singleEggPrize;

        // prompt the dialog box with price information
        JOptionPane.showMessageDialog(null,
                "The total price of your eggs is " + totalPrice,
                "Egg Prices",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
