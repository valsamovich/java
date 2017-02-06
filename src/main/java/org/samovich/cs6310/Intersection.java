package org.samovich.cs6310;

import java.io.*;

/**
 * ${FILE_NAME}.
 *
 * @author Valery Samovich
 * @see
 */
public class Intersection {

    public static void main(String[] args) throws IOException {
        int intersectionRecords = 0;
        String splitBy = ",";
        String studentLine;
        String instructorLine;
        String studentFile = "/Users/samov004/GitHub/java/src/main/resources/org/samovich/cs6310/assignment4/students.csv";
        String instructorFile = "/Users/samov004/GitHub/java/src/main/resources/org/samovich/cs6310/assignment4/instructors.csv";
        BufferedReader studentBufferedReader = getBufferedReader(studentFile);
        BufferedReader instructorBufferedReader = getBufferedReader(instructorFile);

        // loop over students records
        while ((studentLine = studentBufferedReader.readLine()) != null) {
            String[] studentValues = studentLine.split(splitBy);
            // loop over instructors records
            while ((instructorLine = instructorBufferedReader.readLine()) != null) {
                String[] instructorValues = instructorLine.split(splitBy);
                if (studentValues[0].equals(instructorValues[0])) {
                    System.out.println("Equal!");
                    intersectionRecords++;
                }
            }
            // return stream to top of file
            instructorBufferedReader = getBufferedReader(instructorFile);
        }
        studentBufferedReader.close();
        System.out.println("Number in intersections     " + String.valueOf(intersectionRecords));
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
