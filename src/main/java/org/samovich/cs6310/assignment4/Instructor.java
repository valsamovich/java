package org.samovich.cs6310.assignment4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Instructor Class.
 * @author  Valery Samovich
 */
public class Instructor extends Person {
    // attributes
    // operations

    static void getNUmberOfInstructors() throws IOException {
        int lines = 0;
        FileInputStream inputStream = new FileInputStream("./instructors.csv");
        InputStreamReader streamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        while (bufferedReader.readLine() != null) lines++;
        bufferedReader.close();
        System.out.println(lines);
    }
}