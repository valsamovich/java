package org.samovich.cop2800.chapter13.assignment;
/*
 * AUTHOR:	R Grant
 * DATE:	3/2014
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductionApplication {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Part> inventory = new ArrayList<Part>();
        int idx = 0;
        int userChoice = 0;

        File output = new File("parts.dat");
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        while (userChoice != 5) {
            userChoice = getUserChoice();
            switch (userChoice) {
                case 1:
                    PurchasedPart pp;
                    try {
                        pp = new PurchasedPart();
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
                        inventory.add(idx++, pp);
                    } catch (NullPointerException e) {
                        System.out.println("Failed to create a purchased part due to a data error.");
                        System.out.println(e.getMessage());
                        System.out.println("Please retry.");
                    } catch (InvalidProductionArgumentException e) {
                        System.out.println("Failed to create a purchased part due to a data error.");
                        System.out.println(e.getMessage());
                        System.out.println("Please retry.");
                    }
                    break;
                case 2:
                    ManufacturedPart mp = null;
                    try {
                        mp = new ManufacturedPart();
                        // only want to do code below if no exception occurs
                        getPartInfo(mp);
                        getMfgPartInfo(mp);
                        inventory.add(idx++, mp);
                    } catch (InvalidProductionArgumentException e) {
                        System.out.println("Failed to create a manufactured part due to a data error.");
                        System.out.println(e.getMessage());
                        System.out.println("Please retry.");
                    }
                    break;
                case 3:
                    SubcontractedPart sp;
                    try {
                        sp = new SubcontractedPart();
                        getPartInfo(sp);
                        getMfgPartInfo(sp);

                        System.out.print("Enter the subcontract process description: ");
                        String temp = scan.nextLine();
                        sp.setProcessDescription(temp);
                        System.out.print("Enter the subcontract cost: ");
                        temp = scan.nextLine();
                        sp.setSubcontractCost(Double.parseDouble(temp));
                        inventory.add(idx++, sp);
                    } catch (InvalidProductionArgumentException e) {
                        System.out.println("Failed to create a manufactured part due to a data error.");
                        System.out.println(e.getMessage());
                        System.out.println("Please retry.");
                    }
                    break;
                case 4:
                    if (inventory.isEmpty() && !(output.exists())) {
                        System.out.println("There are no parts to lists.");
                    } else {
                        if (!(output.exists())) {
                            // display all objects
                            displayPartInfo(inventory);
                        } else {
                            try {
                                // create File Object
                                output = new File("parts.dat");
                                // use File object
                                fis = new FileInputStream(output);
                                ois = new ObjectInputStream(fis);
                                ArrayList<Part> inventoryFile = (ArrayList<Part>) ois.readObject();
                                displayPartInfo(inventoryFile);
                                ois.close();
                            } catch (NullPointerException e) {
                                System.out.print("Message: " + e);
                            } catch (FileNotFoundException e) {
                                System.out.print("Message: " + e);
                            } catch (IOException e) {
                                System.out.print("Message: " + e);
                            } catch (ClassNotFoundException e) {
                                e.printStackTrace();
                            }
                            // display all objects
                            displayPartInfo(inventory);
                        }
                    }
                    break;
            }
        } // end while

        if(userChoice == 5) {
            try {
                // use File object
                fos = new FileOutputStream(output, true);
                oos = new ObjectOutputStream(fos);
                oos.writeObject(inventory);
                oos.reset();
                oos.flush ();
                oos.close();
            } catch (NullPointerException e) {
                System.out.print("Message: " + e);
            } catch (FileNotFoundException e) {
                System.out.print("Message: " + e);
            } catch (StreamCorruptedException e) {
                System.out.print("Message: " + e);
            } catch (IOException e) {
                System.out.print("Message: " + e);
            }
        }
    }

    public static int getUserChoice() {
        Scanner scan = new Scanner(System.in);
        int userResponse = 0;
        do {
            System.out.println("Enter your choice: ");
            System.out.println("1. Create Purchased Part ");
            System.out.println("2. Create Manufactured Part");
            System.out.println("3. Create Subcontracted Part");
            System.out.println("4. List All Products");
            System.out.println("5. Exit");
            userResponse = scan.nextInt();
        } while (userResponse < 1 || userResponse > 6);
        return userResponse;
    }

    public static void displayPartInfo(ArrayList<Part> p) {
        for (Part part : p)
            if (part != null) {
                System.out.println("********");
                System.out.println(part);
                System.out.println("The product cost is " + part.getProductCost());
            }
    }

    public static void getPartInfo(Part p) throws InvalidProductionArgumentException {
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

    public static void getMfgPartInfo(ManufacturedPart mp) throws NumberFormatException, InvalidProductionArgumentException {
        System.out.print("Enter the labor cost: ");
        String temp = scan.nextLine();
        mp.setLaborCost(Double.parseDouble(temp));
        System.out.print("Enter the material cost: ");
        temp = scan.nextLine();
        mp.setMaterialCost(Double.parseDouble(temp));
    }
}
