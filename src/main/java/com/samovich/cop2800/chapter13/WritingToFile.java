package com.samovich.cop2800.chapter13;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.CREATE;

/**
 * Filename WritingToFile.java
 * Created by Valery Samovich
 * Written on 7/13/2016
 */
public class WritingToFile {
    public static void main(String[] args) {
        String path = "C:\\Users\\vsamov\\GitHub\\java-technologies\\src\\main\\resources\\Employees.txt";
        Path file = Paths.get(path);
        String s = "ABCDF";
        byte[] data = s.getBytes();
        OutputStream output = null;
        try {
            output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            output.write(data);
            output.flush();
            output.close();
        } catch (Exception e) {
            System.out.println("Message: " + e);
        }
    }
}
