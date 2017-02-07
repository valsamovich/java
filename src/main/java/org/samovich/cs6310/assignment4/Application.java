package org.samovich.cs6310.assignment4;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Instructor> instructors = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        List<Course>  courses = new ArrayList<>();
        List<Term> terms = new ArrayList<>();
        final String STUDENT_FILE = "students.csv";
        final String INSTRUCTORS_FILE = "instructors.csv";
        final String COPURSES_FILE = "students.csv";
        final String TERM_FILE = "term.csv";
        final String BASE_PATH = "/Users/samov004/GitHub/java/src/main/resources/org/samovich/cs6310/assignment4/";

        try {
            FileInputStream fis = new FileInputStream(BASE_PATH + STUDENT_FILE);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));

            String line;
            while ((line = br.readLine()) != null) {
                String[] array = line.split(",");
                Student user = new Student();
                user.setUuid(Long.valueOf(array[0]));
                user.setName(array[1]);
                user.setHomeAddress(array[2]);
                user.setPhoneNumber(array[3]);
                students.add(user);
            }
        } catch (Exception e) {
        }

        try {
            FileInputStream fis = new FileInputStream(BASE_PATH + INSTRUCTORS_FILE);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));

            String line;
            while ((line = br.readLine()) != null) {
                String[] array = line.split(",");
                Instructor user = new Instructor();
                user.setUuid(Long.valueOf(array[0]));
                user.setName(array[1]);
                user.setHomeAddress(array[2]);
                user.setPhoneNumber(array[3]);
                instructors.add(user);
            }
        } catch (Exception e) {
        }

        System.out.println(students.size());
        System.out.println(instructors.size());
    }
}
