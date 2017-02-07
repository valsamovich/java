package org.samovich.cs6310.assignment4.legacy;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Student Class.
 * @author  Valery Samovich
 */
public class Student {

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

    public static void isInstructor() throws IOException {
        int intersectionRecords = 0;
        String splitBy = ",";
        String studentLine;
        String instructorLine;
        String studentFile = "./students.csv";
        String instructorFile = "./instructors.csv";
        BufferedReader studentBufferedReader = getBufferedReader(studentFile);
        BufferedReader instructorBufferedReader = getBufferedReader(instructorFile);

        // loop over students records
        while ((studentLine = studentBufferedReader.readLine()) != null) {
            String[] studentValues = studentLine.split(splitBy);
            // loop over instructors records
            while ((instructorLine = instructorBufferedReader.readLine()) != null) {
                String[] instructorValues = instructorLine.split(splitBy);
                if (studentValues[0].equals(instructorValues[0])) {
                    intersectionRecords++;
                }
            }
            // return stream to top of file
            instructorBufferedReader = getBufferedReader(instructorFile);
        }
        studentBufferedReader.close();
        System.out.println(String.valueOf(intersectionRecords));
    }

    /**
     * Create reading stream.
     * @param inputFile
     * @return
     * @throws IOException
     */
    private static BufferedReader getBufferedReader(String inputFile) throws IOException {
        FileInputStream inputStream = new FileInputStream(inputFile);
        InputStreamReader streamReader = new InputStreamReader(inputStream);
        return new BufferedReader(streamReader);
    }
}