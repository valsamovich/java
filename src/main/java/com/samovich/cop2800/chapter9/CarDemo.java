package com.samovich.cop2800.chapter9;

/**
 * Filename CarDemo.java
 * Created by Valery Samovich
 * Written on 6/25/2016
 */
public class CarDemo {
    /**
     * main method.
     * @param args
     */
    public static void main(String[] args) {
        Car firstCar = new Car(2009, Model.MINIVAN, Color.BLUE);
        Car secondCar = new Car(2011, Model.CONVERTIBLE, Color.RED);
        firstCar.display();
        secondCar.display();
    }
}
