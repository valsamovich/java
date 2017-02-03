package org.samovich.cop2800.chapter7;

import java.util.Scanner;

/**
 * Filename CompareStrings.java
 * Created by Valery Samovich
 * Written on 6/17/2016
 */
public class CompareStrings {
    public static void main(String[] args) {
        // declare fields
        String aName = "Carmen";
        String anotherName;
        // prompt the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name > ");
        anotherName = input.nextLine();
        // condition
        if(aName.equals(anotherName)){
            System.out.println(aName + " equals " + anotherName);
        } else {
            System.out.println(aName + " does not equal " + anotherName);
        }
    }
}
