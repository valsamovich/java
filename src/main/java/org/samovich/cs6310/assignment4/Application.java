package org.samovich.cs6310.assignment4;

public class Application {

    public static void main(String[] args) {
        Student.loadStudents();
        Instructor.loadInstructors();
        Course.loadCourses();
    }

}