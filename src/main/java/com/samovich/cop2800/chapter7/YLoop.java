package com.samovich.cop2800.chapter7;

import javax.swing.JOptionPane;

/**
 * Filename YLoop.java
 * Created by Valery Samovich
 * Written on 6/17/16
 */
public class YLoop {

    public static void main(String[] args) {

        // declare vars
        final char YES_OPTION = 'y';
        String entryString;
        char entryChar;
        int count = 0;

        // prompt the user
        entryString = JOptionPane.showInputDialog(
                null,
                "Do you want to see greeting?");

        // assign first char
        entryChar = entryString.charAt(0);

        // loop do control more greetings
        while(Character.toLowerCase(entryChar) == YES_OPTION){
            ++count;
            entryString = JOptionPane.showInputDialog(
                    null,
                    "Greeting #" + count + " Hello!\nDo you want to see another greeting?");
            entryChar = entryString.charAt(0);
        }
    }
}
