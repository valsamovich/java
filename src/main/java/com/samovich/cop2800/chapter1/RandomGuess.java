package com.samovich.cop2800.chapter1;

import javax.swing.JOptionPane;

/**
 * Filename RandomGuess.java
 * Created by Valery Samovich
 * Written on 5/13/16
 */
public class RandomGuess {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Think about the number from 1 to 10");
        JOptionPane.showMessageDialog(null, "The number is " +
                (1 + (int)(Math.random() * 10)));
    }
}
