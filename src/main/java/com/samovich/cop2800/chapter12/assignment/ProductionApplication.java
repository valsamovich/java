package com.samovich.cop2800.chapter12.assignment;/*
 * AUTHOR:	R Grant
 * DATE:	3/2014
 */

import java.util.Scanner;

public class ProductionApplication {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Part[] inventory = new Part[10];
        int idx = 0;
        int userChoice = 0;

        while (userChoice != 4) //while user wants to continue ...
        {
            userChoice = getUserChoice();  //determine user choice
            if (idx >= inventory.length && userChoice != 4) {
                System.out.println("The array is full");
            } else //if array is not full do the following ....
                switch (userChoice) {
                    case 1:
                        PurchasedPart pp = new PurchasedPart();
                        getPartInfo(pp);
                        System.out.print("Enter the purchase price: ");
                        String temp = scan.nextLine();
                        pp.setPurchasePrice(Double.parseDouble(temp));
                        System.out.print("Enter the vendor: ");
                        temp = scan.nextLine();
                        pp.setVendor(temp);
                        System.out.print("Enter the handling cost: ");
                        temp = scan.nextLine();
                        pp.setHandlingCost(Double.parseDouble(temp));
                        inventory[idx++] = pp;
                        break;
                    case 2:
                        ManufacturedPart mp = new ManufacturedPart();
                        getPartInfo(mp);
                        getMfgPartInfo(mp);
                        inventory[idx++] = mp;
                        break;
                    case 3:
                        SubcontractedPart sp = new SubcontractedPart();
                        getPartInfo(sp);
                        getMfgPartInfo(sp);

                        System.out.print("Enter the subcontract process description: ");
                        temp = scan.nextLine();
                        sp.setProcessDescription(temp);
                        System.out.print("Enter the subcontract cost: ");
                        temp = scan.nextLine();
                        sp.setSubcontractCost(Double.parseDouble(temp));
                        inventory[idx++] = sp;
                        break;
                    case 4:
                        //display all objects
                        displayPartInfo(inventory);    // <--------------------- New method call added
                        break;
                }
        }//end while
    }//end main

    public static int getUserChoice() {
        Scanner scan = new Scanner(System.in);
        int userResponse = 0;
        do {
            System.out.println("Enter your choice: ");
            System.out.println("1. Create Purchased Part ");
            System.out.println("2. Create Manufactured Part");
            System.out.println("3. Create Subcontracted Part");
            System.out.println("4. Exit");
            userResponse = scan.nextInt();
        } while (userResponse < 1 || userResponse > 5);
        return userResponse;
    }

    public static void displayPartInfo(Part[] p)   // <--------------------- notice type for array is Part
    {
        for (Part part : p)
            if (part != null) {
                System.out.println("********");
                System.out.println(part);      // <--------------------- display object data using toString  added
                System.out.println("The product cost is " + part.getProductCost());  // <--------------------- display product cost
            }
    }

    //Code below is used for each part object to get common data
    public static void getPartInfo(Part p) {
        System.out.print("Enter the part ID: ");
        String temp = scan.nextLine();
        int ID = Integer.parseInt(temp);
        p.setPartID(ID);

        System.out.print("Enter the part description: ");
        temp = scan.nextLine();
        p.setPartDescription(temp);

        System.out.print("Enter the part sell price: ");
        temp = scan.nextLine();
        double price = Double.parseDouble(temp);
        p.setPartSellPrice(price);
    }

    //Code below is used for each "manufactured" part object to get common data
    public static void getMfgPartInfo(ManufacturedPart mp) {
        System.out.print("Enter the labor cost: ");
        String temp = scan.nextLine();
        mp.setLaborCost(Double.parseDouble(temp));
        System.out.print("Enter the material cost: ");
        temp = scan.nextLine();
        mp.setMaterialCost(Double.parseDouble(temp));
    }
}
