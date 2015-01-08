/**
 * @file ComparisonExample.java
 * @author - Valery Samovich
 * @version 1.0
 * @date 07/14/2014
 */

package com.samovich.java.basics.concepts.features.operators.relational;

public class ComparisonExample {

    public static void main(String[] args) {
        
        int value1 = 1;
        int value2 = 2;
        
        // full syntax with equal to operator - good practice
        if (value1 == value2) {
            System.out.println("value1 == value2");
        }
        
        // short syntax with rest operators - bad practice
        if (value1 != value2) System.out.println("value1 != value2");
        if (value1 > value2) System.out.println("value1 > value2");
        if (value1 < value2) System.out.println("value1 < value2");
        if (value1 <= value2) System.out.println("value1 <= value2");

    }

}
