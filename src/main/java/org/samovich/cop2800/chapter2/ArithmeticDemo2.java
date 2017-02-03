package org.samovich.cop2800.chapter2;

import java.util.Scanner;

/**
 * Filename ArithmeticDemo2.java
 * Created by Valery Samovich
 * Written on 5/16/16
 */
public class ArithmeticDemo2 {

    public static void main(String[] args) {

        // declare variables
        double firstNumber;
        double secondNumber;
        double sum;
        double difference;
        double average;

        // declare a Scanner to accept the keyboard input
        Scanner input = new Scanner(System.in);

        // prompt the user to accept two integers
        System.out.print("Please enter a double >> ");
        firstNumber = input.nextDouble();
        System.out.print("Please enter another double >> ");
        secondNumber = input.nextDouble();

        // perform the arithmetic operations
        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
        average = sum / 2;

        // display the values
        System.out.println(firstNumber + " + " + secondNumber + " is " + sum);
        System.out.println(firstNumber + " — " + secondNumber + " is " + difference);
        System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + average);

    }
}
