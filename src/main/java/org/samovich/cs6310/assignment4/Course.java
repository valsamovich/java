package org.samovich.cs6310.assignment4;

/**
 * @author Valery Samovich
 * @see
 */
public class Course {
    public Long courseId;
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
}
