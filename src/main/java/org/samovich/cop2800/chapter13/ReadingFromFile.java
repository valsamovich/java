package org.samovich.cop2800.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Filename ReadingFromFile.java
 * Created by Valery Samovich
 * Written on 7/13/2016
 */
public class ReadingFromFile {
    public static void main(String[] args) {
        String path = "C:\\Users\\vsamov\\GitHub\\java-technologies\\src\\main\\resources\\Grades.txt";
        Path file = Paths.get(path);
        InputStream input = null;
        try {
            input = Files.newInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String s = null;
            s = reader.readLine();
            System.out.println(s);
            input.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
