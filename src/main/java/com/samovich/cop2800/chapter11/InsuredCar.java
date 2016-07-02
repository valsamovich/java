package com.samovich.cop2800.chapter11;

import javax.swing.*;

/**
 * Filename InsuredCar.java
 * Created by Valery Samovich
 * Written on 7/2/2016
 */
public class InsuredCar extends Vehicle implements Insured {
    // declare fields
    private int coverage;
    public InsuredCar () {
        super("gas", 4);
        setCoverage();
    }

    public void setPrice () {
        String entry;
        final int MAX = 60000;
        entry = JOptionPane.showInputDialog(null, "Enter car price ");
        price = Integer.parseInt(entry);
        if (price > MAX)
            price = MAX;
    }

    /**
     * Setter(mutator) method.
     */
    public void setCoverage(){
        coverage = (int)(price * 0.9);
    }

    /**
     * Getter(accessor) method.
     * @return
     */
    public int getCoverage(){
        return coverage;
    }

    /**
     * Convert to String.
     * @return
     */
    public String toString() {
        return("The insured car is powered by " + getPowerSource() +
                "; it has " + getWheels() + " wheels, costs $" +
                getPrice() + " and is insured for $" + getCoverage()); }
}
