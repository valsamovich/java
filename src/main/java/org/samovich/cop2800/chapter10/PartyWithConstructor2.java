package org.samovich.cop2800.chapter10;

/**
 * Example demonstrating inheritance.
 * Filename PartyWithConstructor2.java
 * Created by Valery Samovich
 * Written on 6/28/2016
 */
public class PartyWithConstructor2 {
    // declare fields
    private int guests;

    /**
     * Constructor method.
     */
    public PartyWithConstructor2(int numGuests) {
        System.out.println("Creating a Party");
        guests = numGuests;
    }

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
