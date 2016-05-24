package com.samovich.cop2800.chapter3;

import java.util.Scanner;

/**
 * Filename ParadiseInfo2.java
 * Created by Valery Samovich
 * Written on 5/20/16
 */
public class ParadiseInfo2 {

    public static void main(String[] args) {

        // declare variables
        double price;
        double discount;
        double savings;

        // create scanner object
        Scanner keyboard = new Scanner(System.in);

        // accept user input for price and discount
        System.out.print("Enter cutoff price for discount >> ");
        price = keyboard.nextDouble();
        System.out.print("Enter discount rate as a whole number >> ");
        discount = keyboard.nextDouble();

        // call displayInfo() method
        displayInfo();

        // call to computeDiscountInfo()
        savings = computeDiscountInfo(price, discount);

        // display saving information
        System.out.println("Special this week on any service over " + price);
        System.out.println("Discount of " + discount + " percent");
        System.out.println("That's a saving of at least $" + savings);
    }

    public static void displayInfo(){
        System.out.println("Paradise Day Spa wants to pamper you.");
        System.out.println("We will make you look good.");
    }

    private static double computeDiscountInfo(double prc, double dscnt) {
        double savings;
        savings = prc * dscnt / 100;
        return savings;
    }
}
