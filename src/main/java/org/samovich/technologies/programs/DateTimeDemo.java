/**
 * @file DateTimeDemo.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 09/03/2014
 */

package org.samovich.technologies.programs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeDemo {
    
    /**
     * Main Method. Getting current Date and Time. Display the input as String.
     * @param args
     */
    public static void main(String[] args) {
        // Instantiate the Date Object
        Date date1 = new Date();
        Date date2 = new Date();
        Date date3 = new Date();

        // Create simple format
        SimpleDateFormat simple = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

        // Display Date and Time using toString();
        System.out.println(date1.toString());
        
        // Display Date and Time using simple format
        System.out.println("Current date: " + simple.format(date2));

        // YYYY-MM-DD HH:MM:SS
        SimpleDateFormat sdfDate2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now2 = new Date();
        String strDate2 = sdfDate2.format(now2);
        System.out.println(strDate2);

    }

}
