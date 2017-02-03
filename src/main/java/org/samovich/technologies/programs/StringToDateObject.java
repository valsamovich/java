package org.samovich.technologies.programs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author samov004
 * @version 1.0.0
 * @file FileName.java
 * @date 11/16/15
 */
public class StringToDateObject {

    public static void main(String[] args) {

        // Example 1: 7-Jun-2013
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
        String dateInString = "7-Jun-2013";

        // Example 2: 7-Jun-2013
        SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy");
        String dateInString2 = "07/06/2013";

        // Example 3: 7-Jun-2013
        SimpleDateFormat formatter3 = new SimpleDateFormat("MMM dd, yyyy");
        String dateInString3 = "Jun 7, 2013";

        try {

            Date date = formatter.parse(dateInString);
            // Print date without formatting
            System.out.println(date);
            // Print formatted date
            System.out.println(formatter.format(date));

            Date date2 = formatter2.parse(dateInString2);
            // Print date without formatting
            System.out.println(date2);
            // Print formatted date
            System.out.println(formatter2.format(date2));

            Date date3 = formatter3.parse(dateInString3);
            // Print date without formatting
            System.out.println(date3);
            // Print formatted date
            System.out.println(formatter3.format(date3));

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
