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
    int correctAnswers = 0;
    int incorrectAnswers = 0;

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
        // loop over answers for for correct answers
        for (int i = 0; i < answerKeys.length; i++) {
            if (answerKeys[i] == examBeingGraded[i]) {
                ++correctAnswers;
            }
        }
        return correctAnswers;
    }

    /**
     * Public method named numberIncorrect that returns the number of incorrect
     * answers on the exam to be graded.
     * @return
     */
    public int numberIncorrect () {
        // loop over answers for for incorrect answers
        for (int i = 0; i < answerKeys.length; i++) {
            if (answerKeys[i] != examBeingGraded[i]) {
                ++incorrectAnswers;
            }
        }
        return incorrectAnswers;
    }

    /**
     * Public method named isPassingGrade that returns true if the number of
     * correct answers is at least equal to the passing percent described above.
     * @return
     */
    public boolean isPassingGrade () {
        // declare fields
        boolean examPass = false;
        double percentPass = correctAnswers;
        // move the decimal place in double
        percentPass /= SIZE_OF_ARRAY;
        // run check for boolean
        if (percentPass >= PERCENT_REQUIRED_TO_PASS) {
            return true;
        }
        return examPass;
    }

    /**
     * Public method named problemsMissed will return an integer array. Each
     * element in the array will have either a 0 or a 1. It will have a 0 if
     * that question was answered incorrectly. It will have a 1 if that question
     * was answered correctly.
     * @return
     */
    public int[] problemsMissed () {
        // declare fields
        int[] numbers = new int[SIZE_OF_ARRAY];
        // loop over answers
        for (int i = 0; i < numbers.length; i++) {
            if (answerKeys[i] != examBeingGraded[i]) {
                numbers[i] = 0;
            }
            if (answerKeys[i] == examBeingGraded[i]) {
                numbers[i] = 1;
            }
        }
        return numbers;
    }
}
