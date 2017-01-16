package com.samovich.technologies.programs;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Filename DateTimeConversion
 * Created by Valery Samovich
 * Written on 7/28/16
 */
public class DateTimeConversion {
    public static void main(String[] args) {
        DateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateFormat inputFormat  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");

        String inputText = "2016-07-07 11:59:07.0";
        System.out.println("Before formatting:  " + inputText);
        try {
            Date date = inputFormat.parse(inputText);
            String outputText = outputFormat.format(date);
            System.out.println("After formatting:   " + outputText);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
