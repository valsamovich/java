/**
 * @file Introductions.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/04/07
 */

/**
 * TeamTreehouse. Java Basics.
 */
package com.samovich.basics.introduction.treehouse;


import java.io.Console;

public class Introductions {

    public static void main(String[] args) {
        Console console = System.console();
        // Welcome to the Introductions program!
        String firstName = "Valery";
        // thisIsAnExampleOfCamelCasing
        console.printf("Hello, my name is %s\n", firstName);
    }

}
