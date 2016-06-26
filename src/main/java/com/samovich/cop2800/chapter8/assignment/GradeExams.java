package com.samovich.cop2800.chapter8.assignment;

/**
 * Filename GradeExams.java
 * Created by Valery Samovich
 * Written on 6/25/2016
 */
public class GradeExams {
    // declare fields
    private char[] answerKeys;
    private char[] examBeingGraded;
    public static final int SIZE_OF_ARRAY = 10;
    public static final double PERCENT_REQUIRED_TO_PASS = 0.7;

    /**
     * Public constructor
     * @param answerKeys
     * @param examBeingGraded
     */
    public GradeExams (char[] answerKeys, char[] examBeingGraded) {
        this.answerKeys = answerKeys;
        this.examBeingGraded = examBeingGraded;
    }

    /**
     * Public method named numberIncorrect that returns the number of incorrect
     * answers on the exam to be graded.
     * @return
     */
    public int numberIncorrect () {
        int numberOfIncorrectAnswers = 0;
        return numberOfIncorrectAnswers;
    }
}
