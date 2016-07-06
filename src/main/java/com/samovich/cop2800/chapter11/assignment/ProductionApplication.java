package com.samovich.cop2800.chapter11.assignment;

import java.util.Scanner;

/**
 * Filename ProductionApplication.java
 * Created by Valery Samovich
 * Written on 6/25/2016
 */
public class ProductionApplication {
    /**
     * Main method.
     * @param args
     */
    public static void main(String [] args) {
        // declare fields, objects.
        Scanner scan = new Scanner(System.in);
        Part[] parts = new Part[3];
        int userChoice = 0;
        int i = 0;

        while (userChoice != 5 && i < parts.length) {
            userChoice = getUserChoice();
            if (userChoice == 1) {
                System.out.print("Enter the part ID: ");
                int partId = scan.nextInt();
                System.out.print("Enter the part description: ");
                String partDescription = scan.nextLine();
                scan.nextLine();
                System.out.print("Enter the part sell price: ");
                double partSellPrice = scan.nextDouble();
                System.out.print("Enter the purchase price: ");
                double purchasePrice = scan.nextDouble();
                System.out.print("Enter the vendor: ");
                String vendor = scan.nextLine();
                scan.nextLine();
                System.out.print("Enter the handling cost: ");
                double handlingCost = scan.nextDouble();
                // create Purchased Part object with user input
                // TODO: store object in array
                parts[i] = new PurchasedPart(
                        partId,
                        partDescription,
                        partSellPrice,
                        purchasePrice,
                        vendor,
                        handlingCost);

            }
            // accept user input. if choice equal 2
            if (userChoice == 2) {
                System.out.print("Enter the part ID: ");
                int partId = scan.nextInt();
                System.out.print("Enter the part description: ");
                String partDescription = scan.nextLine();
                scan.nextLine();
                System.out.print("Enter the part sell price: ");
                double partSellPrice = scan.nextDouble();
                System.out.print("Enter the labor cost: ");
                double laborCost = scan.nextDouble();
                System.out.print("Enter the material cost: ");
                double materialCost = scan.nextDouble();
                // create Manufactured Part object with user input
                // TODO: store object in array
                parts[i] = new ManufacturedPart(
                        partId,
                        partDescription,
                        partSellPrice,
                        laborCost,
                        materialCost);
            }
            // accept user input. if choice equal 3
            if (userChoice == 3) {
                System.out.print("Enter the part ID: ");
                int partId = scan.nextInt();
                System.out.print("Enter the part description: ");
                String partDescription = scan.nextLine();
                scan.nextLine();
                System.out.print("Enter the part sell price: ");
                double partSellPrice = scan.nextDouble();
                System.out.print("Enter the labor cost: ");
                double laborCost = scan.nextDouble();
                System.out.print("Enter the material cost: ");
                double materialCost = scan.nextDouble();
                System.out.print("Enter the subcontract process description: ");
                String subcontractProcessDescription = scan.nextLine();
                scan.nextLine();
                System.out.print("Enter the subcontract cost: ");
                double subcontractCost = scan.nextDouble();
                // create Subcontracted Part object with user input
                // TODO: store object in array
                parts[i] = new SubcontractedPart(
                        partId,
                        partDescription,
                        partSellPrice,
                        laborCost,
                        materialCost,
                        subcontractProcessDescription,
                        subcontractCost);
            }
            // accept user input. if choice equal 4
            if (userChoice == 4) {
                break;
            }
            i++;
        }

        // display that array is full
        System.out.println("The array is full");

        // loop over objects and display information
        for (i = 0; i < parts.length; ++i) {
            if (parts[i] instanceof PurchasedPart) {
                System.out.println("********");
                System.out.println(parts[i].toString());
            }
            if (parts[i] instanceof ManufacturedPart) {
                System.out.println("********");
                System.out.println(parts[i].toString());
            }
            if (parts[i] instanceof SubcontractedPart) {
                System.out.println("********");
                System.out.println(parts[i].toString());
            }
        }
    }

        /*  switch (userChoice) {
                case 1:
                    // Part p = new Part(1001, "52 inch HD TV", 1100.55);
                    // System.out.println("Part info: " );
                    // System.out.println(p);  // remember this calls p.toString
                    break;
                case 2:
                    *//*
                     * public PurchasedPart(int id, String desc, double sellPrice,    //for Part object
                            double purPrice, String vend, double hCost)  //for this object
                     *//*
                    PurchasedPart pp = new PurchasedPart(1002, "AAA battery for rmeote control", 1.12,
                            0.28, "Tesla Electric", .59);
                    System.out.println("Purchased Part info: " );
                    System.out.println(pp);//remember this calls pp.toString
                    break;
                case 3:
                    *//*
                     * 	public ManufacturedPart(int id, String desc, double sellPrice,  //for Part object
                            double lCost, double mCost)  //for this object
                     *//*
                    ManufacturedPart mp = new ManufacturedPart(1003, "3 inch standard plastic stand", 98.59,
                            45.99, 12.99);
                    System.out.println("Manufactured Part info: ");
                    System.out.println(mp);		//remember this calls mp.toString
                    break;
                case 4:
                    *//*
                     * public SubcontractedPart(int id, String partDesc, double sellPrice,   //for Part object
                            double  lCost, double mCost,  //for ManufacturedCost object
                            String processDesc, double sCost)  //for SubcontractedPArt object
                     *//*
                    SubcontractedPart sp = new SubcontractedPart(1004, "1/8 inch x 52 inch gorilla glass", 1210.99,
                            45.15, 12.59,
                            "add high glaze finish", 800.52);
                    System.out.println("Subcontracted Part info: ");
                    System.out.println(sp); //remember this calls sp.toString
                    break;
            }
        } // end while*/


    /**
     * Get user input.
     * @return
     */
    public static int getUserChoice() {
        Scanner scan = new Scanner(System.in);
        int userResponse = 0;
        do {
            System.out.println("Enter your choice: ");
            System.out.println("1. Create Purchased Part");
            System.out.println("2. Create Manufactured Part");
            System.out.println("3. Create Subcontracted part");
            System.out.println("4. Exit");
            userResponse = scan.nextInt();
        } while (userResponse < 1 || userResponse > 4);
        return userResponse;
    }
}
