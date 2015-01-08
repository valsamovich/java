/**
 * @file UnaryExample.java
 * @author - Valery Samovich
 * @version 1.0
 * @date 07/14/2014
 */

package com.samovich.java.basics.concepts.features.operators.unary;

public class UnaryExample {

    public static void main(String[] args) {
        
        // result is 1
        int result = +1;
        System.out.println(result);
        
        // result is now 0
        result--;
        System.out.println(result);
        
        // result is now 1
        result++;
        System.out.println(result);
        
        // result is now -1
        result = -result;
        System.out.println(result);
        
        boolean success = false;
        
        //false
        System.out.println(success);
        
        // true
        System.out.println(!success);

    }

}
