package com.samovich.cop2800.chapter12;

import javax.swing.*;

/**
 * Filename MultipleException.java
 * Created by Valery Samovich
 * Written on 7/8/2016
 */
public class MultipleException {
    public static void main(String[] args) {
        // declare fields
        int numerator = 0;
        int denominator = 0;
        int result;
        String inputString;

        // prompt the user and proceed with calculation
        try {
            inputString = JOptionPane.showInputDialog(null,
                    "Enter a number to be divided:");
            numerator = Integer.parseInt(inputString);
            inputString  = JOptionPane.showInputDialog(null,
                    "Enter a number to divide into the first number:");
            denominator = Integer.parseInt(inputString);
            result = numerator / denominator;
        } catch (ArithmeticException exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage());
            result = 0;
        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(null,
                    "This application accepts digits only!");
            numerator = 999;
            denominator = 999;
            result = 1;
        }

        // display the result
        JOptionPane.showMessageDialog(null, numerator + " / " +
                denominator + "\nResult is " + result);
    }
}
