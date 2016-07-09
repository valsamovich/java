package com.samovich.cop2800.chapter12;

import javax.swing.*;

/**
 * Filename PlanMenu.java
 * Created by Valery Samovich
 * Written on 7/9/16
 */
public class PlanMenu {
    public static void main(String[] args) {
        // declare fields, objects
        Menu briefMenu = new Menu();
        PickMenu entree = null;
        String guestChoice;

        // try-catch block
        try {
            PickMenu selection = new PickMenu(briefMenu);
            entree = selection;
            guestChoice = entree.getGuestChoice();
        } catch(Exception error) {
            guestChoice = "an invalid selection";
        }

        // display user choice
        JOptionPane.showMessageDialog(null, "You chose " + guestChoice);
    }
}
