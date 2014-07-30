/**
 * The example is demonstrate the use switch control flow statement with string.
 * 
 * @file SwitchStringExample.java
 * @author - Valery Samovich
 * @version 1.0
 * @date 07/24/2014
 */

package com.valerysamovich.java.trail.basics.statements.exampleswitch;

public class SwitchStringExample {
    /**
     * Main method call print out the result
     */
    public static void main(String[] args) {
        
        String month = "August";
        
        int returnedMOnthNumber = SwitchStringExample.getMonthNumber(month);
        
        if (returnedMOnthNumber == 0) {
            System.out.println("Invalid month");
        } else {
            System.out.println(returnedMOnthNumber);
        }

    }
    /**
     * In Java SE 7 and later, you can use a String object in the switch 
     * statement's expression. The following code example, SwitchStringDemo, 
     * displays the number of the month based on the value of the String 
     * named month.
     * 
     * @param month
     * @return
     */
    public static int getMonthNumber (String month) {
        
        int monthNumber = 0;
        
        if (month == null) {
            return monthNumber;
        }
        
        switch (month.toLowerCase()) {
            case "january":
                monthNumber = 1;
                break;
            case "february":
                monthNumber = 2;
                break;
            case "march":
                monthNumber = 3;
                break;
            case "april":
                monthNumber = 4;
                break;
            case "may":
                monthNumber = 5;
                break;
            case "june":
                monthNumber = 6;
                break;
            case "july":
                monthNumber = 7;
                break;
            case "august":
                monthNumber = 8;
                break;
            case "september":
                monthNumber = 9;
                break;
            case "october":
                monthNumber = 10;
                break;
            case "november":
                monthNumber = 11;
                break;
            case "december":
                monthNumber = 12;
                break;
            default: 
                monthNumber = 0;
                break;
        }
        
        return monthNumber;
        
    }

}
