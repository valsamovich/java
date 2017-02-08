package org.samovich.cs6310.assignment4;

import org.samovich.cs6310.assignment4.legacy.Course;
import org.samovich.cs6310.assignment4.legacy.Instructor;

import java.util.Date;

/**
 * Record Class.
 * @author  Valery Samovich
 */
public class Record {

    // attributes
    public org.samovich.cs6310.assignment4.legacy.Student student;
    public Instructor instructor;
    public Course course;
    public String semester;
    public Boolean counselorApproved = false;
    public Date counselorUpdatedDate;
    public Date enrollmentDate;
    public Date completionDate;
    public String completionStatus;
    public char grade;

    // operations
    public void createRecord(){}
    public void updateRecord(){}
    public void enrollStudent(){}
    public void disenrollStudent(){}
}
