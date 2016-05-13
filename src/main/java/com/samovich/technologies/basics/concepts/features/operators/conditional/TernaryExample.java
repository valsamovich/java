/**
 * @file ConditionalExample.java
 * @author - Valery Samovich
 * @version 1.0
 * @date 07/14/2014
 */

package com.samovich.basics.concepts.features.operators.conditional;

public class TernaryExample {
    public static void main(String[] args) {
        
        // variables
        int value1 = 1;
        int value2 = 2;
        int result;
        
        boolean someCondition = true;
        
        // ? : - ternary syntax
        // how to read: if someCondition is true, assign the value1 to result.
        // otherwise, assign the value2 to result
        result = someCondition ? value1 : value2;

        // print the result
        System.out.println(result);
    }
}
