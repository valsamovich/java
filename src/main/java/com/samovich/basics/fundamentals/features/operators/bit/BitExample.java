/**
 * @file BitExample.java
 * @author - Valery Samovich
 * @version 1.0
 * @date 07/14/2014
 */

package com.samovich.basics.fundamentals.features.operators.bit;

public class BitExample {

    public static void main(String[] args) {
        
        //variables
        int bitmask = 0x000F;
        int val = 0x2222;
        
        // prints "2"
        System.out.println(val & bitmask);

    }

}
