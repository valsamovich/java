package com.valerysamovich.java.basic.arrays;

public class ArrayCopyDemo {

    public static void main(String[] args) {
        
        // char array       0   1   2   3   4   5   6   7   8   9   10  11  12
        char[] copyFrom = {'d','e','c','a','f','f','e','i','n','a','t','e','d'};
        
        char[] copyTo = new char[7];
        
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));
    }

}
