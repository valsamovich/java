package org.samovich.cs6310.assignment4;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private static final String STUDENT_FILE = "students.csv";
    private String jobInfo;
    public void selectCourse(){}

    public static List<Student> loadStudents () {
        try {
            List<String> lines = Files.readAllLines(Paths.get(Application.BASE_PATH, STUDENT_FILE));
            List<Student> students = new ArrayList<>();
            for(String line : lines) {
                String[] array = line.split(",");
                Student user = loadStudent(array);
                students.add(user);
            }
            return students;
        } catch (IOException e){
            throw new UncheckedIOException(e);
        }
    }

    private static Student loadStudent(String[] array) {
        Student user = new Student();
        user.setUuid(Long.valueOf(array[0]));
        user.setName(array[1]);
        user.setHomeAddress(array[2]);
        user.setPhoneNumber(array[3]);
        return user;
    }
}
