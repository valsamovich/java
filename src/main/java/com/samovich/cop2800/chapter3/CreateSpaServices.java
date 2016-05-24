package com.samovich.cop2800.chapter3;

import java.util.Scanner;

/**
 * Filename CreateSpaServices.java
 * Created by Valery Samovich
 * Written on 5/23/2016
 */
public class CreateSpaServices {

    public static void main(String[] args) {

        // declare objects
        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();
        SpaService thirdService = new SpaService();

        firstService = getData(firstService);
        secondService = getData(secondService);

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

    public static SpaService getData(SpaService s){

        // declare variables
        String service;
        double price;

        // declare object
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter service >> ");
        service = keyboard.nextLine();
        System.out.print("Enter price >> ");
        price = keyboard.nextDouble();
        keyboard.nextLine();

        s.setServiceDescription(service);
        s.setPrice(price);
        return s;
    }
}
