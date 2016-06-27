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
        char[] examBeingGraded = {'A', 'C', 'C', 'D', 'B', 'D', 'A', 'D', 'D', 'A'};
        MCChecker checkerOne = new MCChecker(answerKeys, examBeingGraded);
        int[] numbers = checkerOne.problemsMissed();
        String correct = "correct";
        String incorrect = "incorrect";
        boolean incorrectArraySize = false;

        // run check for arrays sizes
        if (answerKeys.length != MCChecker.SIZE_OF_ARRAY ||
                examBeingGraded.length != MCChecker.SIZE_OF_ARRAY) {
            // display results
            System.out.println("The number correct is " + 0);
            System.out.println("The number incorrect is " + 0);
            System.out.println("The student passed? " + incorrectArraySize);
            System.out.println();
            System.out.println("Results by Question");
            System.out.println("Either the answer key or the exam was of the wrong size.");
        } else {
            System.out.println("The number correct is " + checkerOne.numberCorrect());
            System.out.println("The number incorrect is " + checkerOne.numberIncorrect());
            System.out.println("The student passed? " + checkerOne.isPassingGrade());
            System.out.println();
            System.out.println("Results by Question");
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == 1) {
                    System.out.print(i + 1 + ": " + correct + " ");
                }
                if (numbers[i] == 0) {
                    System.out.print(i + 1 + ": " + incorrect + " ");
                }
            }
        }
    }
}
