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
        // Console console = System.console();
        // String name = console.readLine("Enter your name: ");
        // String adjective = console.readLine("Enter an adjective: ");
        // console.printf("%s is very %s", name, adjective);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter an adjective: ");
        String adjective = scanner.nextLine();
        System.out.println(name + " is very " + adjective + "!");
    }
}
