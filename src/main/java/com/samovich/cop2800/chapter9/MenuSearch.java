package com.samovich.cop2800.chapter9;

import javax.swing.*;
import java.util.Arrays;

/**
 * Applicationthat demostrates several Arrays class methods.
 *
 * Filename MenuSearch.java
 * Created by Valery Samovich
 * Written on 6/25/2016
 */
public class MenuSearch {
    /**
     * Main method.
     * @param args
     */
    public static void main(String[] args) {
        // declare fields
        String[] menuChoices = new String[5];
        String entry = "", menuString = "";
        int x = 0;
        int numEntered;
        int highestSub = menuChoices.length - 1;

        // fill the menu array with characters
        Arrays.fill(menuChoices, "zzzzzzz");

        // display an input dialog box into which the user can enter a menu item
        menuChoices[x] = JOptionPane.showInputDialog(
                null,
                "Enter an item for today’s menu, or 222 to quit:");
        while (!menuChoices[x].equals("zzz") && x < highestSub) {
            menuString = menuString + menuChoices[x] + "\n";
            ++x;
            if (x < highestSub) {
                menuChoices[x] = JOptionPane.showInputDialog(
                        null,
                        "Enter an item for today’s menu, or 222 to quit");
            }
        }
        numEntered = x;
        entry = JOptionPane.showInputDialog(
                null,
                "Today's menu is:\n" + menuString + "Please make a selection:");
        Arrays.sort(menuChoices, 0, numEntered);
        x = Arrays.binarySearch(menuChoices, entry);
        if (x >= 0 && x < numEntered) {
            JOptionPane.showMessageDialog(
                    null,
                    "Excellent choice");
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Sorry — that item is not on tonight’s menu");
        }
    }
}
