package com.samovich.cop2800.chapter10;

/**
 * Example demonstrating inheritance.
 * Filename PartyWithConstructor.java
 * Created by Valery Samovich
 * Written on 6/28/2016
 */
public class PartyWithConstructor {
    // declare fields
    private int guests;

    /**
     * Constructor method.
     */
    public PartyWithConstructor () {
        System.out.println("Creating a Party");
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
