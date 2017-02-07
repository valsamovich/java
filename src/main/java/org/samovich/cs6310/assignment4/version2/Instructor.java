package org.samovich.cs6310.assignment4.version2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Valery Samovich
 * @see
 */
public class Instructor extends Person {

    public static void loadInstructors() {
        try {
            FileInputStream fis = new FileInputStream("/Users/samov004/GitHub/java/src/main/resources/org/samovich/cs6310/assignment4/instructors.csv");
            BufferedReader in = new BufferedReader(new InputStreamReader(fis));
            List<Instructor> Instructors = new ArrayList<Instructor>();
            String line;
            while ((line = in.readLine()) != null) {
                String[] InstructorDetails = line.split(",");
                Instructor record = new Instructor();
                record.setUuid(InstructorDetails[0]);
                record.setName(InstructorDetails[1]);
                record.setHomeAddress(InstructorDetails[2]);
                record.setPhoneNumber(InstructorDetails[3]);
                Instructors.add(record);
            }
            System.out.println(Instructors.size());
        } catch (Exception e) {
        }
    }
}
