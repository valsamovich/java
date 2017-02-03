package org.samovich.cop2800.chapter5;

import java.util.Scanner;

/**
 * Filename AssignVolunteer.java
 * Created by Valery Samovich
 * Written on 5/31/16
 */
public class AssignVolunteer {

    public static void main(String[] args) {

        // declare fields
        int donationType;
        String volunteer;
        String message;
        final int CLOTHING_CODE = 1;
        final int OTHER_CODE = 2;
        final String CLOTHING_PRICER = "Regina";
        final String OTHER_PRICER = "Marco";

        // accept user input
        Scanner input = new Scanner(System.in);
        System.out.println("What type od donation is this?");
        System.out.print("Enter " + CLOTHING_CODE + " for clothing, " +
                OTHER_CODE + " for anything else >> ");
        donationType = input.nextInt();

        // determine donation type
        if (donationType == CLOTHING_CODE) {
            volunteer = CLOTHING_PRICER;
            message = "a clothing donation";
        } else {
            volunteer = OTHER_PRICER;
            message = "another donation type";
        }

        // display information
        System.out.println("You entered " + donationType);
        System.out.println("The volunteer who will price this item is "+ volunteer);
        System.out.println("The is " + message);

    }
}
