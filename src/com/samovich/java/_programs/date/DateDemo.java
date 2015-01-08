/**
 * @file DateDemo.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 09/03/2014
 */

package com.samovich.java._programs.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    
    /**
     * Main Method. Getting current Date and Time. Display the input as String.
     * @param args
     */
    public static void main(String[] args) {
        // Instantiate the Date Object
        Date date1 = new Date();
        Date date2 = new Date();
        
        // Create simple format
        SimpleDateFormat simple = 
                new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        
        // Display Date and Time using toString();
        System.out.println(date1.toString());
        
        // Display Date and Time using simple format
        System.out.println("Current date: " + simple.format(date2));
    }

}
