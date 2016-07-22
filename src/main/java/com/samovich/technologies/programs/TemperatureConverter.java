/**
 * @file TemperatureConverter.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 11/22/2014
 *
 * Java Program to convert Fahrenheit to Celsius
 */

package com.samovich.technologies.programs;

import java.util.Scanner;

public class TemperatureConverter {

    // Main method.
    public static void main(String[] args) {

        float temperature;

        // Creating the object
        Scanner in = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit:");
        temperature = in.nextInt();

        // For Celsius to Fahrenheit conversion: T = 9 * T / 5 + 32;
        temperature = ((temperature - 32) * 5) / 9;

        System.out.println("Temperature in Celsius = " + temperature);
    }
}
