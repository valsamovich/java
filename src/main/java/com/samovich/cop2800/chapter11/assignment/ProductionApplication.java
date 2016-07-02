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
        int userChoice = 0;

        while (userChoice != 5) {
            userChoice = getUserChoice();
            switch (userChoice) {
                case 1:
                    Part p = new Part(1001, "52 inch HD TV", 1100.55);
                    System.out.println("Part info: " );
                    System.out.println(p);  // remember this calls p.toString
                    break;
                case 2:
                    /*
                     * public PurchasedPart(int id, String desc, double sellPrice,    //for Part object
                            double purPrice, String vend, double hCost)  //for this object
                     */
                    PurchasedPart pp = new PurchasedPart(1002, "AAA battery for rmeote control", 1.12,
                            0.28, "Tesla Electric", .59);
                    System.out.println("Purchased Part info: " );
                    System.out.println(pp);//remember this calls pp.toString
                    break;
                case 3:
                    /*
                     * 	public ManufacturedPart(int id, String desc, double sellPrice,  //for Part object
                            double lCost, double mCost)  //for this object
                     */
                    ManufacturedPart mp = new ManufacturedPart(1003, "3 inch standard plastic stand", 98.59,
                            45.99, 12.99);
                    System.out.println("Manufactured Part info: ");
                    System.out.println(mp);		//remember this calls mp.toString
                    break;
                case 4:
                    /*
                     * public SubcontractedPart(int id, String partDesc, double sellPrice,   //for Part object
                            double  lCost, double mCost,  //for ManufacturedCost object
                            String processDesc, double sCost)  //for SubcontractedPArt object
                     */
                    SubcontractedPart sp = new SubcontractedPart(1004, "1/8 inch x 52 inch gorilla glass", 1210.99,
                            45.15, 12.59,
                            "add high glaze finish", 800.52);
                    System.out.println("Subcontracted Part info: ");
                    System.out.println(sp); //remember this calls sp.toString
                    break;
            }
        } // end while
    }

    /**
     * Get user input.
     * @return
     */
    public static int getUserChoice() {
        Scanner scan = new Scanner(System.in);
        int userResponse = 0;
        do {
            System.out.println("Enter your choice: ");
            System.out.println("1. Create Part ");
            System.out.println("2. Create Purchased Part ");
            System.out.println("3. Create Manufactured Part");
            System.out.println("4. Create Subcontracted Part");
            System.out.println("5. Exit");
            userResponse = scan.nextInt();
        } while (userResponse < 1 || userResponse > 5);
        return userResponse;
    }
}
