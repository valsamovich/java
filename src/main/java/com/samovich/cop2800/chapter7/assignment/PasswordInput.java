package com.samovich.cop2800.chapter7.assignment;

import javax.swing.JOptionPane;

/**
 * Filename PasswordInput.java
 * Created by Valery Samovich
 * Written on 6/17/2016
 */
public class PasswordInput {
    public static void main(String[] args) {
        String inputString;
        // prompt a user
        inputString = JOptionPane.showInputDialog(
                null,
                "Please enter your password",
                "Password",
                JOptionPane.QUESTION_MESSAGE);
    }
}
