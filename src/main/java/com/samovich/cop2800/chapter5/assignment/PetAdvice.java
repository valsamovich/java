package com.samovich.cop2800.chapter5.assignment;

import javax.swing.JOptionPane;

/**
 * Filename PetAdvice.java
 * Created by Valery Samovich
 * Written on 5/31/2016
 */
public class PetAdvice {

    public static void main(String[] args) {

        // declare variables
        String dwellingType;
        int dwellingNumber;

        // prompt the user to accept value
        dwellingType = JOptionPane.showInputDialog(
                null,
                "Enter 1 (apartment), 2 (house), 3 (dorm):",
                "Dwelling Type",
                JOptionPane.QUESTION_MESSAGE);

        // convert string to an number
        dwellingNumber = Integer.parseInt(dwellingType);

        // test if entered value is valid
        if (dwellingNumber < 1 || dwellingNumber > 3) {
            // display error message
            JOptionPane.showMessageDialog(
                    null,
                    "The value for dwelling type must be 1 (apartment), 2 (house), or 3 (dorm)",
                    "Dwelling Type Error",
                    JOptionPane.ERROR_MESSAGE);
            // stop the application
            System.exit(0);
        }

        // print the entered value
        System.out.println(dwellingNumber);
    }
}
