package org.samovich.cop2800.chapter8;

import javax.swing.JOptionPane;

/**
 * Filename ParallelArray.java
 * Created by Valery Samovich
 * Written on 6/21/2016
 */
public class ParallelArray {
    public static void main(String[] args) {
        // declare fields
        final int NUMBER_OF_ITEMS = 10;
        int[] validValues = {101, 108, 201, 213, 266, 304, 311, 409, 411, 412};
        double[] prices = {0.29, 1.23, 3.50, 0.69, 6.79, 3.19, 0.99, 0.89, 1.26, 8.00};
        String strItem;
        int itemOrdered;
        double itemPrice = 0.0;
        boolean validItem = false;

        // accept user input
        strItem = JOptionPane.showInputDialog(
                null,
                "Enter the item number you want to order");
        itemOrdered = Integer.parseInt(strItem);

        // process user input
        for (int x = 0; x < NUMBER_OF_ITEMS; x++) {
            if (itemOrdered == validValues[x]) {
                validItem = true;
                itemPrice = prices[x];
            }
        }

        if (validItem) {
            JOptionPane.showMessageDialog(
                    null,
                    "The price for item " + itemOrdered + " is $" + itemPrice);
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Sorry - invalid item entered"
            );
        }
    }
}
