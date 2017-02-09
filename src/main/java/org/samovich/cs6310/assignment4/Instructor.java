package org.samovich.cs6310.assignment4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Instructor extends Person {

    private static final String INSTRUCTORS_FILE = "instructors.csv";

    public static List<Instructor> loadInstructors () {
        try {
            FileInputStream fis = new FileInputStream(Application.BASE_PATH + INSTRUCTORS_FILE);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            List<Instructor> instructors = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                String[] array = line.split(",");
                Instructor user = loadInstructor(array);
                instructors.add(user);
            }
            return instructors;
        } catch (IOException e){
            throw new UncheckedIOException(e);
        }
    }

    private static Instructor loadInstructor(String[] array) {
        Instructor user = new Instructor();
        user.setUuid(Long.valueOf(array[0]));
        user.setName(array[1]);
        user.setHomeAddress(array[2]);
        user.setPhoneNumber(array[3]);
        return user;
    }

    public static int instructorAsStudent(List<Instructor> instructors, List<Student> students) {
        int instructorAsStudent = 0;
        for (Student s : students) {
            for (Instructor i : instructors) {
                if (s.getUuid().equals(i.getUuid())) {
                    instructorAsStudent++;
                }
            }
        }
        return instructorAsStudent;
    }

}
