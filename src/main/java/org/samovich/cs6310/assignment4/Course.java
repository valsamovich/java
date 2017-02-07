package org.samovich.cs6310.assignment4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * ${FILE_NAME}.
 *
 * @author Valery Samovich
 * @see
 */
public class Course {
    public String courseId;
    public String courseTitle;
    public String description;
    public String format;
    public Boolean online = false;
    public String[] semesterOfffered;

    public void createCourse() {
    }

    public void updateCourse() {
    }

    public void deleteCourse() {
    }

    public void findByCourse() {
    }

    public Course() {
    }

    public Course(String courseId, String courseTitle) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public static void loadCourses() {
        try {
            FileInputStream fis = new FileInputStream("./courses.csv");
            BufferedReader in = new BufferedReader(new InputStreamReader(fis));
            List<Course> Courses = new ArrayList<Course>();
            String line;
            while ((line = in.readLine()) != null) {
                String[] CourseDetails = line.split(",");
                Course record = new Course();
                record.setCourseId(CourseDetails[0]);
                record.setCourseTitle(CourseDetails[1]);
                Courses.add(record);
            }
            System.out.println(Courses.size());
        } catch (Exception e) {
        }
    }
}
