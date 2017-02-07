package org.samovich.cs6310;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * ${FILE_NAME}.
 *
 * @author Valery Samovich
 * @see
 */
public class Intersection {

    public static void main(String[] args) throws IOException {
        int lines = 0;
        ArrayList<String> courseIds = new ArrayList<String>();
        String splitBy = ",";
        String courseLine;
        String termLine;
        String l;
        String courseFile = "/Users/samov004/GitHub/java/src/main/resources/org/samovich/cs6310/assignment4/courses.csv";
        String termFile = "/Users/samov004/GitHub/java/src/main/resources/org/samovich/cs6310/assignment4/terms.csv";
        BufferedReader courseBufferedReader = getBufferedReader(courseFile);
        BufferedReader termBufferedReader = getBufferedReader(termFile);

        // get all course ids
        while ((l = termBufferedReader.readLine()) != null) {
            String[] t = l.split(splitBy);
            courseIds.add(t[0]);
            lines++;
        }
        System.out.println(courseIds);

        // loop over students records
        while ((courseLine = courseBufferedReader.readLine()) != null) {
            String[] courseValues = courseLine.split(splitBy);
            // loop over instructors records
            while ((termLine = termBufferedReader.readLine()) != null) {
                String[] termValues = termLine.split(splitBy);
                if (Arrays.asList(courseIds).contains(termValues[0])) {
                    if (courseValues[0].equals(termValues[0])) {
                        System.out.println(courseLine + "," + termValues[1]);
                    }
                } else {
                    System.out.println(courseLine);
                }
            }
            // return stream to top of file
            termBufferedReader = getBufferedReader(termFile);
        }
        courseBufferedReader.close();
        termBufferedReader.close();
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
