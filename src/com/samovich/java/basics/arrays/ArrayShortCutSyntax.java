package com.samovich.java.basics.arrays;

public class ArrayShortCutSyntax {

    public static void main(String[] args) {
        int[] anArray = {
                100, 200, 300,
                400, 500, 600,
                700, 800, 900, 1000
                };
        
        // loop throw the array;
        for (int i = 0; i < anArray.length; i++) {
            System.out.println("anArray values: " + anArray[i]);
        }

    }

}
