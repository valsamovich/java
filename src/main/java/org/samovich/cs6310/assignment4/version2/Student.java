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
public class Student extends Person {
    public String jobInfo;
    public void selectCourse(){}

    public static void loadStudents() {
        try {
            FileInputStream fis = new FileInputStream("/Users/samov004/GitHub/java/src/main/resources/org/samovich/cs6310/assignment4/students.csv");
            BufferedReader in = new BufferedReader(new InputStreamReader(fis));
            List<Student> students = new ArrayList<Student>();
            String line;
            while ((line = in.readLine()) != null) {
                String[] studentDetails = line.split(",");
                Student record = new Student();
                record.setUuid(studentDetails[0]);
                record.setName(studentDetails[1]);
                record.setHomeAddress(studentDetails[2]);
                record.setPhoneNumber(studentDetails[3]);
                students.add(record);
            }
            System.out.println(students.size());
        } catch (Exception e) {
        }
    }
}
