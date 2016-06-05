package com.samovich.cop2800.chapter5.assignment;

import javax.swing.JOptionPane;

/**
 * Filename PetAdvice.java
 * Created by Valery Samovich
 * Written on 5/31/2016
 */
public class PetAdvice {

    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {

        // declare variables
        int validDwellingNumber;
        int validHoursPerWeek;

        // get valid values
        validDwellingNumber = PetAdvice.getDwellingNumber();
        validHoursPerWeek = PetAdvice.getHoursPerWeek();

        // get recommended pet based on dwelling and hours
        PetAdvice.getRecommendedPet(validDwellingNumber, validHoursPerWeek);

        // print the entered value
        System.out.println(validDwellingNumber);
        System.out.println(validHoursPerWeek);
    }

    /**
     * Process user input and return type of dwelling as a number, if it's valid.
     * @return dwellingNumber
     */
    private static int getDwellingNumber() {
        // declare variables
        String dwellingType;
        int dwellingNumber;

        // prompt the user to enter the value for dwelling
        dwellingType = JOptionPane.showInputDialog(
                null,
                "Enter 1 (apartment), 2 (house), 3 (dorm).",
                "Dwelling Type",
                JOptionPane.QUESTION_MESSAGE);

        // convert string to an number
        dwellingNumber = Integer.parseInt(dwellingType);

        // test if entered value is valid
        if (dwellingNumber != 1 && dwellingNumber != 2 && dwellingNumber != 3) {
            // display error message
            JOptionPane.showMessageDialog(
                    null,
                    "The value for dwelling type must be " +
                            "1 (apartment), 2 (house), or 3 (dorm)",
                    "Dwelling Type Error",
                    JOptionPane.ERROR_MESSAGE);
            // stop the application
            System.exit(0);
        }
        return dwellingNumber;
    }

    /**
     * Process user input for hours per week and return value as number, if it's valid.
     * @return hoursPerWeekAsNumber
     */
    private static int getHoursPerWeek(){
        // declare variables
        String hoursPerWeek;
        int hoursPerWeekAsNumber;

        // prompt the user to enter the value for hours
        hoursPerWeek = JOptionPane.showInputDialog(
                null,
                "Enter the number of hours per week you are home:",
                "Hours at Home",
                JOptionPane.QUESTION_MESSAGE);

        // convert string to an number
        hoursPerWeekAsNumber = Integer.parseInt(hoursPerWeek);

        // test if entered value is valid
        if (hoursPerWeekAsNumber < 0 || hoursPerWeekAsNumber > 168) {
            // display error message
            JOptionPane.showMessageDialog(
                    null,
                    "The number of hours per week you are home must be " +
                            "between 0 and 168 inclusive",
                    "Hours at Home Error",
                    JOptionPane.ERROR_MESSAGE);
            // stop the application
            System.exit(0);
        }
        return hoursPerWeekAsNumber;
    }

    /**
     * Accept two parameters and based on values determine the commended pet.
     * @param validDwellingNumber hold the dwelling number
     * @param validHoursPerWeek hold the hours per week
     */
    private static void getRecommendedPet(int validDwellingNumber, int validHoursPerWeek) {

        // declare variables
        String jOptionPaneTitle = "Recommended Pet";

        // conditional statements for apartment
        if (validDwellingNumber == 1) {
            if (validHoursPerWeek >= 10) {
                JOptionPane.showMessageDialog(
                        null,
                        "You should get a Cat!",
                        jOptionPaneTitle,
                        JOptionPane.INFORMATION_MESSAGE);
            }
            if (validHoursPerWeek < 10) {
                JOptionPane.showMessageDialog(

                        null,
                        "You should get a Hamster!",
                        jOptionPaneTitle,
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }

        // conditional statements for house
        if (validDwellingNumber == 2) {
            if (validHoursPerWeek >= 18) {
                JOptionPane.showMessageDialog(
                        null,
                        "You should get a Pot-bellied pig!",
                        jOptionPaneTitle,
                        JOptionPane.INFORMATION_MESSAGE);
            }
            if (validHoursPerWeek >= 10 && validHoursPerWeek <= 17 ) {
                JOptionPane.showMessageDialog(
                        null,
                        "You should get a Dog!",
                        jOptionPaneTitle,
                        JOptionPane.INFORMATION_MESSAGE);
            }
            if (validHoursPerWeek < 10 ) {
                JOptionPane.showMessageDialog(
                        null,
                        "You should get a Snake!",
                        jOptionPaneTitle,
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }

        // conditional statements for dormitory
        if (validDwellingNumber == 3) {
            if (validHoursPerWeek >= 6) {
                JOptionPane.showMessageDialog(
                        null,
                        "You should get a Fish!",
                        jOptionPaneTitle,
                        JOptionPane.INFORMATION_MESSAGE);
            }
            if (validHoursPerWeek < 6) {
                JOptionPane.showMessageDialog(
                        null,
                        "You should get a Ant farm!",
                        jOptionPaneTitle,
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }

}
