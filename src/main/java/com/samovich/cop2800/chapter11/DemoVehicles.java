package com.samovich.cop2800.chapter11;

import javax.swing.*;

/**
 * Filename DemoVehicles.java
 * Created by Valery Samovich
 * Written on 7/2/2016
 */
public class DemoVehicles {
    public static void main(String[] args) {
        // declare objects
        Sailboat aBoat = new Sailboat();
        Bicycle aBike = new Bicycle();
        JOptionPane.showMessageDialog(
                null,
                "\nVehicle descriptions:\n" +
                        aBoat.toString() + "\n" +
                        aBike.toString());
    }
}
