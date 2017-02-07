package org.samovich.cs6310.assignment4.version1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Course Class.
 * @author  Valery Samovich
 */
public class Course {
    // attributes
    public String courseId;
    public String courseTitle;
    public String description;
    public String format;
    public Boolean online = false;
    public String[] semesterOfffered;

    // operations
    public void createCourse(){}
    public void updateCourse(){}
    public void deleteCourse(){}
    public void findByInstructor(){}

    static void getNUmberOfCourses() throws IOException {
        int lines = 0;
        FileInputStream inputStream = new FileInputStream("./courses.csv");
        InputStreamReader streamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        while (bufferedReader.readLine() != null) lines++;
        bufferedReader.close();
        System.out.println(lines);
    }

    public void displayCourses() throws IOException {

    }
}
