package org.samovich.cop2800.chapter11;

import javax.swing.*;

/**
 * Filename VehicleDatabase.java
 * Created by Valery Samovich
 * Written on 7/2/2016
 */
public class VehicleDatabase {
    public static void main(String[] args) {
        // declare fields and object
        Vehicle[] vehicles = new Vehicle[5];
        int x;

        for (x = 0; x < vehicles.length; ++x) {
            String userEntry;
            int vehicleType;
            userEntry = JOptionPane.showInputDialog(
                    null,
                    "Please select the type of\n " +
                            "vehicle you want to enter: \n1 — Sailboat\n" +
                            " 2 — Bicycle");
            vehicleType = Integer.parseInt(userEntry);
            if(vehicleType == 1)
                vehicles[x] = new Sailboat();
            else
                vehicles[x] = new Bicycle();
        }

        StringBuffer outString = new StringBuffer();
        for(x = 0; x < vehicles.length; ++x) {
            outString.append("\n#" + (x + 1) + " ");
            outString.append(vehicles[x].toString());
        }
        JOptionPane.showMessageDialog(
                null,
                "Our available Vehicles include:\n" + outString);
    }
}
