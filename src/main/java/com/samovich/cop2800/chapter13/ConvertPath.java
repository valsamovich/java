package com.samovich.cop2800.chapter13;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Convert relative path to absolute path.
 * Filename ConvertPath.java
 * Created by Valery Samovich
 * Written on 7/12/2016
 */
public class ConvertPath {
    public static void main(String[] args) {
        String name;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a file name >> ");
        name = keyboard.nextLine();
        Path inputPath = Paths.get(name);
        Path fullPath = inputPath.toAbsolutePath();
        System.out.println("Full path is " + fullPath.toString());
    }
}
