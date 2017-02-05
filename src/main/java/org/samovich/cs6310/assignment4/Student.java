package org.samovich.cs6310.assignment4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Student Class.
 * @author  Valery Samovich
 */
public class Student {

    // attributes
    public String jobInfo;

    // operations
    public void selectCourse(){}

    /**
     * Get number of students.
     * @throws IOException
     */
    static void getNUmberOfStudents() throws IOException {
        int lines = 0;
        FileInputStream inputStream = new FileInputStream("./students.csv");
        InputStreamReader streamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        while (bufferedReader.readLine() != null) lines++;
        bufferedReader.close();
        System.out.println(lines);
    }
}