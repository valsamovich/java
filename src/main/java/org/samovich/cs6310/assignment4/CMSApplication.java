package org.samovich.cs6310.assignment4;

import java.io.*;
import java.net.URL;

/**
 * Main Class for Course Management System Application.
 * @author  Valery Samovich
 * @see     System
 */
public class CMSApplication {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello, I'm a CMR!");

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("./students.txt")));
        int lines = 0;
        while (reader.readLine() != null) lines++;
        reader.close();
        System.out.println(lines);
    }
}
