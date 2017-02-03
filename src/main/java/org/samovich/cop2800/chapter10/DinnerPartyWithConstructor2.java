package org.samovich.cop2800.chapter10;

/**
 * Example demonstrating inheritance.
 * Filename DinnerParty.java
 * Created by Valery Samovich
 * Written on 6/28/2016
 */
public class DinnerPartyWithConstructor2 extends PartyWithConstructor2 {
    // declare fields
    private int dinnerChoice;

    /**
     * Constructor method.
     * @param numGuests
     */
    public DinnerPartyWithConstructor2(int numGuests) {
        super(numGuests);
    }

    /**
     * Getter method.
     * @return
     */
    public int getDinnerChoice() {
        return dinnerChoice;
    }

    /**
     * Setter method.
     * @param dinnerChoice
     */
    public void setDinnerChoice (int dinnerChoice) {
        this.dinnerChoice = dinnerChoice;
    }

    public void displayInvitation() {
        System.out.println("Please come to my dinner party!");
    }
}
