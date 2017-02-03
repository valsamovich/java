package org.samovich.cop2800.chapter13;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;

/**
 * Filename <filenme>.java
 * Created by Valery Samovich
 * Written on 7/14/2016
 */
public class WriteEmployeeFile {
    public static void main(String[] args) {
        // declare fields, objects
        Scanner input = new Scanner(System.in);
        String filePath = "C:\\Users\\vsamov\\GitHub\\java-technologies\\src\\main\\resources\\Employees.txt";
        Path file = Paths.get(filePath);
        String s = "";
        String delimiter = ",";
        int id;
        String name;
        double payRate;
        final int QUIT = 999;

        try {
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
            System.out.print("Enter employee ID number >> ");
            id = input.nextInt();
            while(id != QUIT) {
                // accept user input for employee #
                System.out.print("Enter name for employee #" + id + " >> ");
                input.nextLine();
                name = input.nextLine();
                // accept user input for pay rate
                System.out.print("Enter pay rate >> ");
                payRate = input.nextDouble();
                s = id + delimiter + name + delimiter + payRate;
                writer.write(s, 0, s.length());
                writer.newLine();
                System.out.print("Enter next ID number or " + QUIT + " to quit >> ");
                id = input.nextInt();
            }
            writer.close();
        } catch(Exception e) {
            System.out.println("Message: " + e);
        }
    }
}
