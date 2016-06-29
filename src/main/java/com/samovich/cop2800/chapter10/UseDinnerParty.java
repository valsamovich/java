package com.samovich.cop2800.chapter10;

import java.util.Scanner;

/**
 * Example demonstrating inheritance.
 * Filename UseDinnerParty.java
 * Created by Valery Samovich
 * Written on 6/28/2016
 */
public class UseDinnerParty {

    /**
     * Main method.
     * @param args
     */
    public static void main(String[] args) {
        // declare fields and objects
        int guests;
        int choice;
        Party aParty = new Party();
        DinnerParty aDinnerParty = new DinnerParty();

        // prompt the user for input
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number of guests for the party >> ");
        guests = keyboard.nextInt();
        aParty.setGuests(guests);
        System.out.println("The party has " + aParty.getGuests() + " guests.");

        // display the party information
        aParty.displayInvitation();
        System.out.println();

        // prompt the user for input for dinner party
        System.out.print("Enter number of guests for the dinner party >> ");
        guests = keyboard.nextInt();
        aDinnerParty.setGuests(guests);
        System.out.print ("Enter the menu option —— 1 for chicken or 2 for beef >> ");
        choice = keyboard.nextInt();
        aDinnerParty.setDinnerChoice(choice);
        System.out.println("The dinner party has " + aDinnerParty.getGuests() + " guests.");
        System.out.println("Menu option " + aDinnerParty.getDinnerChoice () + " will be served.");

        // display the party information
        aParty.displayInvitation();
    }
}
