package com.samovich.cop2800.chapter11;

import javax.swing.*;

/**
 * Filename Sailboat.java
 * Created by Valery Samovich
 * Written on 7/2/2016
 */
public class Sailboat extends Vehicle {
    // declare fields
    private int length;

    /**
     * Public constructor.
     */
    public Sailboat () {
        super("wind", 0);
        setLength();
    }

    /**
     * Setter(mutator) method.
     */
    public void setLength () {
        String entry;
        entry = JOptionPane.showInputDialog(
                null,
                "Enter sailboat length in feet "
        );
        length = Integer.parseInt(entry);
    }

    /**
     * Getter(accessor) method.
     * @return
     */
    public int getLength () {
        return length;
    }

    /**
     * Setter(mutator) method.
     */
    public void setPrice () {
        String entry;
        final int MAX = 100000;
        entry = JOptionPane.showInputDialog(
            null,
            "Enter sailboat price ");
        price = Integer.parseInt(entry);
        if (price > MAX)
            price = MAX;
    }

    /**
     * Method that converts any objects to a string.
     * @return
     */
    public String toString () {
        return("The " + getLength() + " foot sailboat is powered by " +
                getPowerSource() + "; it has " + getWheels() +
                " wheels and costs $" + getPrice());
    }
}
