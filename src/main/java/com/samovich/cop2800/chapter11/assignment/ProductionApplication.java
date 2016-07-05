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
        Part[] parts = new Part[2];
        int userChoice = 0;
        int[] counts = new int[3];
        int count;

        for(count = 0; count < counts.length; ++count) {
            if (userChoice != 5) {
                userChoice = getUserChoice();
                if (userChoice == 1) {
                    System.out.print("One: ");
                    int one = scan.nextInt();
                    /*System.out.print("Enter the part ID: ");
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
                    double handlingCost = scan.nextInt();*/
                    //TODO: Create Purchased Part object with user input
                }
                // accept user input. if choice equal 2
                if (userChoice == 2) {
                    System.out.print("Two: ");
                    int two = scan.nextInt();
                    /*System.out.print("Enter the part ID: ");
                    int partId = scan.nextInt();
                    System.out.print("Enter the part description: ");
                    String partDescription = scan.nextLine();
                    scan.nextLine();
                    System.out.print("Enter the part sell price: ");
                    double partSellPrice = scan.nextDouble();
                    System.out.print("Enter the labor cost: ");
                    double laborCost = scan.nextDouble();
                    System.out.print("Enter the material cost: ");
                    double materialCost = scan.nextDouble();*/
                    //TODO: Create Manufactured Part object with user input
                }
                // accept user input. if choice equal 3
                if (userChoice == 3) {
                    System.out.print("Three: ");
                    int three = scan.nextInt();
                    /*System.out.print("Enter the part ID: ");
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
                    double subcontractCost = scan.nextDouble();*/
                    //TODO: Create Subcontracted Part object with user input
                }
            } else {
                System.out.println("The array is full");
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
