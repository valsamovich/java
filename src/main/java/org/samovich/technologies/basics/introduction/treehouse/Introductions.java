/**
 * @file Introductions.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/04/07
 */

package org.samovich.technologies.basics.introduction.treehouse;

import java.io.Console;
import java.io.IOException;

public class Introductions {

    public static void main(String[] args) {
        Console console = System.console();
        // Welcome to the Introductions program!
        String firstName = console.readLine("What is your name? ");
        // thisIsAnExampleOfCamelCasing
        console.printf("Hello, my name is %s\n", firstName);
        console.printf("%s is learning how to write Java\n", firstName);
    }

}