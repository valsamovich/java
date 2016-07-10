package com.samovich.cop2800.chapter12.assignment;

/**
 * Filename InvalidProductionArgumentException.java
 * Created by Valery Samovich
 * Written on 7/10/2016
 */
public class InvalidProductionArgumentException extends Exception {
    public InvalidProductionArgumentException(){};
    public InvalidProductionArgumentException(String message) {
        super(message);
    }
}
