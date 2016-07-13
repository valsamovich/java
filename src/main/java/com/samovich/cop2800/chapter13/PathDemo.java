package com.samovich.cop2800.chapter13;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Filename PathDemo.java
 * Created by Valery Samovich
 * Written on 7/12/2016
 */
public class PathDemo {
    public static void main(String[] args) {
        Path filepath = Paths.get("C:\\Java\\Chapter.13\\Data.txt");
        int count = filepath.getNameCount();
        System.out.println("Path is " + filepath.toString());
        System.out.println("File name is " + filepath.getFileName());
        System.out.println("There are " + count + " elements in the file path");
        for (int x = 0; x < count; ++x)
            System.out.println("Element " + x + " is " + filepath.getName(x));
    }
}
