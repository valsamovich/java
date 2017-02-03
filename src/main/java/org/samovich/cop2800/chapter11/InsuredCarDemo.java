package org.samovich.cop2800.chapter11;

import javax.swing.*;

/**
 * Filename InsuredCarDemo.java
 * Created by Valery Samovich
 * Written on 7/2/2016
 */
public class InsuredCarDemo {
    public static void main(String[] args) {
        InsuredCar myCar = new InsuredCar();
        JOptionPane.showMessageDialog(null, myCar.toString());
    }
}
