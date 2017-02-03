package org.samovich.cop2800.chapter12;

import javax.swing.*;

/**
 * Filename PickMenu.java
 * Created by Valery Samovich
 * Written on 7/9/16
 */
public class PickMenu {
    // declare fields
    private Menu briefMenu;
    private String guestChoice;

    /**
     * Counstructor
     * @param theMenu
     */
    public PickMenu(Menu theMenu) {
        briefMenu = theMenu;
        setGuestChoice();

    }

    /**
     * Setter
     */
    private void setGuestChoice() {
        JOptionPane.showMessageDialog(null, "Choose from the following menu:");
        guestChoice = briefMenu.displayMenu();
    }

    /**
     * Getter
     * @return
     */
    public String getGuestChoice() {
        return guestChoice;
    }

}
