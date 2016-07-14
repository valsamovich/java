package com.samovich.cop2800.chapter13;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.DoubleBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * To run this class: WriteEmployeeFile.java run first to create Employee.txt
 * Filename <filenme>.java
 * Created by Valery Samovich
 * Written on 7/14/2016
 */
public class ReadEmployeeFile2 {
    public static void main(String[] args) {
        Path file = Paths.get("C:\\Users\\vsamov\\GitHub\\java-technologies\\src\\main\\resources\\Employees.txt");
        String[] array = new String[3];
        String s = "";
        String delimiter = ",";
        int id;
        String name;
        double payRate;
        double gross;
        final double HRS_IN_WEEK = 40;
        double total = 0;
        try {
            InputStream input = new BufferedInputStream(Files.newInputStream(file));
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            s = reader.readLine();
            while(s != null) {
                array = s.split(delimiter);
                id = Integer.parseInt(array[0]);
                name = array[1];
                payRate = Double.parseDouble(array[2]);
                gross = payRate * HRS_IN_WEEK;
                System.out.println("ID#" + id + " " + name + "\t$" + payRate + "\t$" + gross);
                total += gross;
                s = reader.readLine();
            }
            reader.close();
        } catch(Exception e) {
            System.out.println("Message: " + e);
        }
        System.out.println("\tTotal gross payroll is $" + total);
    }
}
