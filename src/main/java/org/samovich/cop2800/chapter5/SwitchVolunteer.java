package org.samovich.cop2800.chapter5;

import java.util.Scanner;

/**
 * Filename AssignVolunteer.java
 * Created by Valery Samovich
 * Written on 5/31/16
 */
public class SwitchVolunteer {

    public static void main(String[] args) {

        // declare fields
        int donationType;
        String volunteer;
        String message;
        final int CLOTHING_CODE = 1;
        final int FURNITURE_CODE = 2;
        final int ELECTRONICS_CODE = 3;
        final int OTHER_CODE = 4;

        final String CLOTHING_PRICER = "Regina";
        final String OTHER_PRICER = "Marco";
        final String FURNITURE_PRICER = "Wlater";
        final String ELECTRONICS_PRICER = "Lydia";

        // accept user input
        Scanner input = new Scanner(System.in);
        System.out.println("What type od donation is this?");
        System.out.print("Enter the integer >> ");
        donationType = input.nextInt();

        switch (donationType) {
            case (CLOTHING_CODE):
                volunteer = CLOTHING_PRICER;
                message = "a clothing donation";
                break;
            case (FURNITURE_CODE):
                volunteer = FURNITURE_PRICER;
                message = "a furniture donation";
                break;
            case (ELECTRONICS_CODE):
                volunteer = ELECTRONICS_PRICER;
                message = "an electronics donation";
                break;
            case (OTHER_CODE):
                volunteer = OTHER_PRICER;
                message = "another donation type";
                break;
            default:
                volunteer = "invalid";
                message = "an invalid donation type";
        }

        // display information
        System.out.println("You entered " + donationType);
        System.out.println("The is " + message);
        System.out.println("The volunteer who will price this item is " + volunteer);

    }
}