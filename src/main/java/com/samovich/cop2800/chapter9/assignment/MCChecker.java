package com.samovich.cop2800.chapter9.assignment;

/**
 * Filename MCChecker.java
 * Created by Valery Samovich
 * Written on 6/25/2016
 */
public class MCChecker {
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
    public MCChecker (char[] answerKeys, char[] examBeingGraded) {
        this.answerKeys = answerKeys;
        this.examBeingGraded = examBeingGraded;
    }

    /**
     * Public method named numberCorrect that returns the number of correct
     * answers on the exam to be graded.
     * @return
     */
    public int numberCorrect () {
        int correctAnswers = 0;
        return correctAnswers;
    }

    /**
     * Public method named numberIncorrect that returns the number of incorrect
     * answers on the exam to be graded.
     * @return
     */
    public int numberIncorrect () {
        int incorrectAnswers = 0;
        return incorrectAnswers;
    }

    /**
     * Public method named isPassingGrade that returns true if the number of
     * correct answers is at least equal to the passing percent described above.
     * @return
     */
    public boolean isPassingGrade () {
        // TODO: add logic
        return true;
    }

    /**
     * Public method named problemsMissedThis will return an integer array.
     * Each element in the array will have either a 0 or a 1. It will have a 0
     * if that question was answered incorrectly. It will have a 1 if that
     * question was answered correctly.
     * @return
     */
    public int[] problemsMissed() {
        // TODO: add array with flexible size
        int[] numbers = new int[0];
        return numbers;

    }
}
