package com.samovich.cop2800.chapter13;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * To run this class: WriteEmployeeFile.java run first to create Employee.txt
 * Filename <filenme>.java
 * Created by Valery Samovich
 * Written on 7/14/2016
 */
public class ReadEmployeeFile {
    public static void main(String[] args) {
        Path file = Paths.get("C:\\Users\\vsamov\\GitHub\\java-technologies\\src\\main\\resources\\Grades.txt");
        String s = "";
        try {
            InputStream input = new BufferedInputStream(Files.newInputStream(file));
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            s = reader.readLine();
            while(s != null) {
                System.out.println(s);
                s = reader.readLine();
            }
            reader.close();
        } catch(Exception e) {
            System.out.println("Message: " + e);
        }
    }
}
