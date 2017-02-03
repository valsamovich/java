package org.samovich.cop2800.chapter9;

/**
 * Filename Car.java
 * Created by Valery Samovich
 * Written on 6/25/2016
 */
public class Car {
    // declare fields
    private int year;
    private Model model;
    private Color color;

    /**
     * Constructor
     * @param y
     * @param m
     * @param c
     */
    public Car (int y, Model m, Color c) {
        year = y;
        model = m;
        color = c;
    }

    public  void display () {
        System.out.println("Car is a " + year + " " + color + " " + model);
    }
}
