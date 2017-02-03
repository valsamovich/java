package org.samovich.cop2800.chapter7;

import javax.swing.*;

/**
 * Filename NumberInput.java
 * Created by Valery Samovich
 * Written on 6/17/2016
 */
public class NumberInput {
    public static void main(String[] args) {
        // declare fields
        String inputString;
        int inputNumber;
        int result;
        final int FACTOR = 10;
        // prompt a user
        inputString = JOptionPane.showInputDialog(
                null,
                "Enter a number");
        inputNumber = Integer.parseInt(inputString);
        result = inputNumber * FACTOR;
        JOptionPane.showMessageDialog(
                null,
                inputNumber + " * " + FACTOR + " = " + result);
    }
}
