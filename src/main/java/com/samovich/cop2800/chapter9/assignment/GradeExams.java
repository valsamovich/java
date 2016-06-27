package com.samovich.cop2800.chapter9.assignment;

/**
 * Filename GradeExams.java
 * Created by Valery Samovich
 * Written on 6/25/2016
 */
public class GradeExams {
    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        // declare fields
        char[] answerKeys = {'A', 'B', 'C', 'D', 'B', 'A', 'A', 'A', 'D', 'B'};
        char[] examBeingGraded = {'B', 'C', 'D', 'A', 'A', 'B', 'B', 'B', 'A', 'B'};
        MCChecker checkerOne = new MCChecker(answerKeys, examBeingGraded);
        int[] numbers = new int[9];
        String correct = "correct";
        String incorrect = "incorrect";

        // display results
        System.out.println("The number correct is " + checkerOne.numberCorrect());
        System.out.println("The number incorrect is " + checkerOne.numberIncorrect());
        System.out.println("The student passed? " + checkerOne.isPassingGrade());
        System.out.println();
        System.out.println("Results by Questions");
        checkerOne.problemsMissed();
    }

}
