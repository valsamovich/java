/**
 * @file Example.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/01/13
 */

package com.samovich.basics.concepts.objects.treehouse;

public class Example {

    public static void main(String[] args) {

        System.out.println("Wea are making a new Pez Dispenser.");
        PezDispenser dispenser = new PezDispenser("Yoda");
        System.out.println("The dispenser character is " + dispenser.getCharacterName() + ".");

        // Check if dispenser is empty.
        if (dispenser.isEmpty()) {
            System.out.println("It is currently empty!");
        }

        System.out.println("Loading...");
        // Load the dispenser.
        dispenser.load();

        if (!dispenser.isEmpty()) {
            System.out.println("It is no longer empty.");
        }
        while(dispenser.despense()) {
            System.out.println("Chomp!");
        }

        if (dispenser.isEmpty()) {
            System.out.println("It is currently empty.");
        }
    }
}
