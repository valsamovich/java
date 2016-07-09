package com.samovich.cop2800.chapter12;

import javax.swing.*;

/**
 * Class Automatically Throws Exception
 * Filename Menu,java
 * Created by Valery Samovich
 * Written on 7/9/16
 */
public class Menu {
    // declare fields
    protected String[] entreeChoice = {"Rosemary Chiken",
            "Beef Wellington", "Maine Lobster"};
    private String menu = "";
    private int choice;
    // list each entree option for user to make a decision
    public String displayMenu() {
        for (int x = 0; x < entreeChoice.length; ++x){
            menu  = menu + "\n" + (x + 1) + " for " + entreeChoice[x];
        }
        String input = JOptionPane.showInputDialog(null,
                "Type your selection, then press Enter." + menu);
        choice = Integer.parseInt(input);
        return(entreeChoice[choice - 1]);
    }
}

