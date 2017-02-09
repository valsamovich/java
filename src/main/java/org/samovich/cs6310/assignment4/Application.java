package org.samovich.cs6310.assignment4;

import java.util.Collection;

public class Application {

    static final String BASE_PATH = "/Users/samov004/GitHub/java/src/main/resources/org/samovich/cs6310/assignment4/";

    public static void main(String[] args) {

        System.out.println(Student.loadStudents().size());
        System.out.println(Instructor.loadInstructors().size());
        System.out.println(String.valueOf(Instructor.instructorAsStudent(Instructor.loadInstructors(), Student.loadStudents())));
        System.out.println(Course.loadCourses().size());
        Collection<Course> coursesWithTerms = Course.applyTerms(Term.loadTearms());
        for (Course c : coursesWithTerms) {
            System.out.println(c);
        }

        /*for (Course c : courses) {
            for (Term t : terms) {
                if (c.getCourseId().equals(t.getUuid())) {
                    System.out.println(c.getCourseId()
                            + "," + c.getCourseTitle()
                            + "," + t.getTermDesignator());
                }
            }
        }*/
    }
}
