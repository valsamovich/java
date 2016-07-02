package com.samovich.cop2800.chapter11;

import javax.swing.*;

/**
 * Filename Bicycle.java
 * Created by Valery Samovich
 * Written on 7/2/2016
 */
public class Bicycle extends Vehicle {

    /**
     * Public constructor.
     */
    public Bicycle () {
        super("a person ", 2);
    }

    /**
     * Setter(mutator) method.
     */
    public void setPrice () {
        // declare fields
        String entry;
        final int MAX = 4000;
        entry = JOptionPane.showInputDialog (
                null,
                "Enter bicycle price "
        );
        price = Integer.parseInt(entry);
        if (price > MAX)
            price = MAX;
    }

    /**
     * Method that converts any objects to a string.
     * @return
     */
    public String toString () {
        return("The bicycle is powered by " + getPowerSource() +
                "; it has " + getWheels() + " wheels and costs $" + getPrice());
    }
}
