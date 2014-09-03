/**
 * @file DateDemo.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 009/03/2014
 */

package com.valerysamovich.java.basics.date;

import java.util.Date;

public class DateDemo {
    
    /**
     * Main Method. Getting current Date and Time. Display the input as String.
     * @param args
     */
    public static void main(String[] args) {
        // Instantiate the Date Object
        Date date = new Date();
        
        // Display Date and Time using toString();
        System.out.println(date.toString());

    }

}
