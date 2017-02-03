package org.samovich.cop2800.chapter10;

/**
 * Example demonstrating inheritance.
 * Filename Party.java
 * Created by Valery Samovich
 * Written on 6/28/2016
 */
public class Party {
    // declare fields
    private int guests;

    /**
     * Getter method.
     * @return
     */
    public int getGuests() {
        return guests;
    }

    /**
     * Setter method.
     * @param numGuests
     */
    public void setGuests (int numGuests) {
        guests = numGuests;
    }

    /**
     * Display message.
     */
    public void displayInvitation () {
        System.out.println("Please come to my party!");
    }
}
