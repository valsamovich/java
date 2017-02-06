package org.samovich.cs6310.assignment4;

import java.io.IOException;

/**
 * Course Management System Application class.
 * @author  Valery Samovich
 * @see     System
 */
public class CMSApplication {

    /**
     * Main method.
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // print the number of students
        Student.getNUmberOfStudents();
        // print the number of instructors
        Instructor.getNUmberOfInstructors();
        // print the number of students as instructor
        Student.isInstructor();
        // print the number of courses
        Course.getNUmberOfCourses();
    }

}
