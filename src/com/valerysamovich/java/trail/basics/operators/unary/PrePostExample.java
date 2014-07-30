/**
 * @file PrePostExample.java
 * @author - Valery Samovich
 * @version 1.0
 * @date 07/14/2014
 */

package com.valerysamovich.java.trail.basics.operators.unary;

public class PrePostExample {

    public static void main(String[] args) {
        
        int i = 3;
        // postfix
        i++; 
        
        // result is 4
        System.out.println(i);
        i++;
        
        // result is now 5
        System.out.println(i);
        
        // result is now 6 with prefix
        System.out.println(++i);
        
        // result is now 6
        System.out.println(i++);
        
        // result is now 7
        System.out.println(i);
    }
}
