package com.samovich.technologies.programs;

/**
 * Filename ConvertCharToASCII
 * Created by Valery Samovich
 * Written on 5/20/16
 */
public class ConvertCharToASCII {

    public static void main(String[] args) {

        // convert character to ascii
        char character = 'A';
        int ascii1 = (int) character;
        System.out.println("Converted ASCCI Character: " + ascii1);

        // convert string to ascii
        System.out.print("Converted ASCCI String: " );
        String string = "java-004";
        for (int x = 0; x < string.length(); x++){
            char z = string.charAt(x);
            int y = (int) z;

            System.out.print(y);
        }
    }
}
