package com.samovich.cop2800.chapter7.assignment;

/**
 * Filename PasswordChecker.java
 * Created by Valery Samovich
 * Written on 6/17/2016
 */
public class PasswordChecker {

    private PasswordChecker (){
    }

    public static boolean checkPassword (String password){
        if(password.length() < 8){
            return false;
        } else {
            //TODO:add password logic
        }
        return true;
    }
}
