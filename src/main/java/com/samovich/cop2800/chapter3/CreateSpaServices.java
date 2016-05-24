package com.samovich.cop2800.chapter3;

import java.util.Scanner;

/**
 * Filename CreateSpaServices.java
 * Created by Valery Samovich
 * Written on 5/23/2016
 */
public class CreateSpaServices {

    public static void main(String[] args) {

        // declare variables
        String service;
        double price;

        // declare objects
        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();
        SpaService thirdService = new SpaService();
        Scanner keyboard = new Scanner(System.in);

        // prompt the user for first service
        System.out.print("Enter service >> ");
        service = keyboard.nextLine();
        System.out.print("Enter price >> ");
        price = keyboard.nextDouble();

        // recall the set methods
        firstService.setServiceDescription(service);
        firstService.setPrice(price);

        // remove the enter key thar remains in buffer
        keyboard.nextLine();

        // prompt the user for second service
        System.out.print("Enter service >> ");
        service = keyboard.nextLine();
        System.out.print("Enter price >> ");
        price = keyboard.nextDouble();

        // recall the set methods
        secondService.setServiceDescription(service);
        secondService.setPrice(price);

        // display the details for first service
        System.out.println("First service details:");
        System.out.println(firstService.getServiceDescription() + " $" +
                firstService.getPrice());
        System.out.println("Second service details:");
        System.out.println(secondService.getServiceDescription() + " $" +
                secondService.getPrice());
        System.out.println("Third service details:");
        System.out.println(thirdService.getServiceDescription() + " $" +
                thirdService.getPrice());
    }
}
