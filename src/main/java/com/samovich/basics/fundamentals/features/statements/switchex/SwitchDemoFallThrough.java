/**
 * @file SwitchDemoFallThrough.java
 * @author - Valery Samovich
 * @version 1.0
 * @date 07/23/2014
 */

package com.samovich.basics.fundamentals.features.statements.switchex;

public class SwitchDemoFallThrough {

    public static void main(String[] args) {
        
        // resizable-array implementation of the List interface
        java.util.ArrayList<String> futureMonths = 
                new java.util.ArrayList<String>();
        
        // variable
        int month = 8;
        
        // switch statement
        switch(month) {
            case 1: futureMonths.add("January");
            case 2: futureMonths.add("February");
            case 3: futureMonths.add("March");
            case 4: futureMonths.add("April");
            case 5: futureMonths.add("May");
            case 6: futureMonths.add("June");
            case 7: futureMonths.add("July");
            case 8: futureMonths.add("August");
            case 9: futureMonths.add("September");
            case 10: futureMonths.add("October");
            case 11: futureMonths.add("November");
            case 12: futureMonths.add("December");
                break;
            default: break;
        }
        
        // if-else statement
        // isEmpty() - returns true if, and only if, length() is 0.
        if (futureMonths.isEmpty()) {
            System.out.println("Invalid month number");
        } else {
            // for statement
            for (String monthName : futureMonths) {
                System.out.println(monthName);
            }
        }
    }

}
