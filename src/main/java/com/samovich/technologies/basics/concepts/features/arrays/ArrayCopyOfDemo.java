package com.samovich.basics.concepts.features.arrays;

public class ArrayCopyOfDemo {

    public static void main(String[] args) {
        
        // char array       0   1   2   3   4   5   6   7   8   9   10  11  12
        char[] copyFrom = {'d','e','c','a','f','f','e','i','n','a','t','e','d'};
        
        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
        
        System.out.println(new String(copyTo));
    }

}
