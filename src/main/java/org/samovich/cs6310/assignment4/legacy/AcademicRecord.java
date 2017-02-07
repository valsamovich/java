package org.samovich.cs6310.assignment4.legacy;

import java.util.Date;

/**
 * AcademicRecord Class.
 * @author  Valery Samovich
 */
public class AcademicRecord {

    // attributes
    public Student student;
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
