package com.samovich.cop2800.chapter7.assignment;

import javax.swing.JOptionPane;

/**
 * Filename PasswordInput.java
 * Created by Valery Samovich
 * Written on 6/17/2016
 */
public class PasswordInput {

    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        // declare fields
        String password;
        // prompt a user to type password
        password = JOptionPane.showInputDialog(
                null,
                "Please enter your password",
                "Password",
                JOptionPane.QUESTION_MESSAGE);
        // validate the password
        if (PasswordChecker.checkPassword(password)) {
            // display valid message
            JOptionPane.showMessageDialog(
                    null,
                    "Password is valid!",
                    "Password Check Result",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            // display error message
            JOptionPane.showMessageDialog(
                    null,
                    "Password is invalid!\n" +
                            "Password must contain a uppercase letter, \n" +
                            "a lowercase letter, a number, a special character,\n" +
                            "and be 8 characters or longer with no spaces.",
                    "Password Check Result",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
