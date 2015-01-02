/**
 * @file ExampleMinNumber.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 11/26/2014
 */

package com.valerysamovich.java.basics.methods;

public class ExampleMinNumber {

    public static void main(String[] args) {
        
        int a = 11;
        int b = 6;
        int c = minFunction(a, b);
        System.out.println("Minimum value = " + c);
        
    }

    /*
     * Return the minimum of two numbers
     */
    private static int minFunction(int n1, int n2) {
        
        int min;
        
        if(n1 > n2) {
            min = n2;
        } else {
            min = n1;
        }
        
        return min;
    }
}
