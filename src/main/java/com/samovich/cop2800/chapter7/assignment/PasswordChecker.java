package com.samovich.cop2800.chapter7.assignment;

/**
 * Filename PasswordChecker.java
 * Created by Valery Samovich
 * Written on 6/17/2016
 */
public class PasswordChecker {

    /**
     * Constructor
     */
    private PasswordChecker () {
    }

    /**
     * Method design to check the String argument and verify the String contains
     * the following:
     *  - at least one uppercase letter
     *  - at least one lower case letter
     *  - at least one number
     *  - at least one special character (not a number, space, or letter)
     *  - must have 8 or more characters (password can't have any spaces)
     * @param password
     * @return
     */
    public static boolean checkPassword (String password) {
        // declare fields
        char character;
        int uppercaseLetter = 0;
        int lowercaseLetter = 0;
        int number = 0;
        int specialCharacter = 0;

        // check password for length
        if (password.length() >= 8) {
            // loop over each character
            for (int i = 0; i < password.length(); i++) {
                character = password.charAt(i);
                // check password for space
                if (Character.isSpaceChar(character)) {
                    return false;
                }
                // check password for uppercase letter
                if (Character.isUpperCase(character)) {
                    uppercaseLetter++;
                }
                // check password for lowercase letter
                if (Character.isLowerCase(character)) {
                    lowercaseLetter++;
                }
                // check password for number
                if (Character.isDigit(character)) {
                    number++;
                }
                // check for special character
                if (!Character.isDigit(character) && !Character.isLetter(character)) {
                    specialCharacter++;
                }
            }
            // run check on all counts
            if (uppercaseLetter < 1 ||
                    lowercaseLetter < 1 ||
                    number < 1 ||
                    specialCharacter < 1) {
                return false;
            }
        } else {
            return false;
        }
        return true;
    }
}
