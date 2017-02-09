package org.samovich.cs6310.assignment4;

import java.io.*;
import java.util.*;

/**
 * @author Valery Samovich
 * @see
 */
public class Course implements Comparable<Course> {
    private static final String COURSES_FILE = "courses.csv";
    public Long courseId;
    public String courseTitle;
    public String description;
    public String format;
    public Boolean online = false;
    public List<Term> terms;

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

    public Course(Long courseId, String courseTitle) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public static List<Course> loadCourses() {
        try {
            FileInputStream fis = new FileInputStream(Application.BASE_PATH + COURSES_FILE);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            List<Course> courses = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                String[] array = line.split(",");
                Course course = loadCourse(array);
                courses.add(course);
            }
            return courses;
        } catch (IOException e){
            throw new UncheckedIOException(e);
        }
    }

    private static Course loadCourse(String[] array) {
        Course course = new Course();
        course.setCourseId(Long.valueOf(array[0]));
        course.setCourseTitle(array[1]);
        return course;
    }

    private static Map<Long, Course> mapCourses() {
        List<Course> courses = loadCourses();
        Map<Long, Course> courseMap  = new HashMap<>();
        for(Course c : courses) {
            courseMap.put(c.getCourseId(), c);
        }
        return courseMap;
    }

    public static Collection<Course> applyTerms(List<Term> terms) {
        Map<Long, Course> coursesMap = mapCourses();
        for(Term t : terms) {
            Course course = coursesMap.get(t.getUuid());
            if(null != course && null != t) {
                course.addTerm(t);
            }
        }
        List<Course> courses = new ArrayList<>(coursesMap.values());
        Collections.sort(courses);
        return  courses;
    }

    private void addTerm(Term t) {
        if (null == terms){
            terms = new ArrayList<>();
        }
        terms.add(t);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(courseId + "," + courseTitle );
        if(null != terms) {
            Collections.sort(terms);
            for(Term t: terms) {
                sb.append(",")
                .append(t);
            }
        }
        return sb.toString();
    }

    @Override
    public int compareTo(Course c) {
        return courseId.compareTo(c.courseId);
    }
}
