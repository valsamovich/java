/**
 * @file TreeStory.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/05/11
 */

package com.samovich.basics.concepts.strings.treehouse;

import java.io.Console;
import java.util.Scanner;

public class TreeStory {

    public static void main(String[] args) {
        // __Name__ is a __adjective__ __noun__.
        // They are always __adverb__ __verb__.

        // Console console = System.console();
        // String name = console.readLine("Enter a name:  ");
        // String adjective = console.readLine("Enter an adjective:  ");
        // String noun = console.readLine("Enter a noun:  ");
        // String adverb = console.readLine("Enter an adverb:  ");
        // String verb = console.readLine("Enter a verb ending with -ing:  ");
        // console.printf("Your TreeStory:\n----------------\n");
        // console.printf("%s is a $s %s. ", name, adjective, noun);
        // console.printf("They are always %s %s.\n", adverb, verb);

        // Create the scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you? ");
        // Convert and store age as integer
        String ageScanner = scanner.nextLine();

        int age = Integer.parseInt(ageScanner);
        // Age validation.
        if (age < 13) {
            // Exit code
            System.out.println("You must be at least 13 to use this program.\n");
            System.exit(0);
        }

        System.out.println("Enter a name:  ");
        // Accept user input for name
        String name = scanner.nextLine();
        System.out.println("Enter an adjective:  ");
        String adjective = scanner.nextLine();

        System.out.println("Enter a noun: ");
        String noun = scanner.nextLine();
        // Noun validation.
        if(noun.equalsIgnoreCase("dork")) {
            System.out.println("This language is not allowed. Exiting. \n\n");
            System.exit(0);
        }

        System.out.println("Enter an adverb: ");
        String adverb = scanner.nextLine();
        System.out.println("Enter a verb ending with -ing:  ");
        String verb = scanner.nextLine();
        // Print the prototype
        System.out.println("Your TreeStory:\n--------------\n");
        System.out.println(name + " is a " + adjective + " " + noun + ".");
        System.out.println("He is always " + adverb + " " + verb + ".");
    }
}
