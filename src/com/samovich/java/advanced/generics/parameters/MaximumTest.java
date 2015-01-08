/**
 * @file MaximumTest.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 08/14/2014
 */

package com.samovich.java.advanced.generics.parameters;

public class MaximumTest {
    
    /**
     * Determines the largest of three Comparable objects
     * @param x
     * @param y
     * @param z
     * @return
     */
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        
        // Assume x is initially the largest 
        T max = x;
        
        if (y.compareTo(max) > 0) {
            // Y is the largest so far
            max = y;
        }
        if (z.compareTo(max) > 0) {
            // Z is the largest one
            max = z;
        }
        
        // Returns the largest object
        return max;
    }
    
    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        
        System.out.printf("Max of %d, %d and %d is %d\n\n", 
                3, 4, 5, maximum(3, 4, 5));
        System.out.printf("Max of %.1f, %.1f and %.1f is %.1f\n\n", 
                6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7));
        System.out.printf("Max of %s, %s and %s is %s\n", 
                "pear", "apple", "orange", maximum("pear", "apple", "orange"));

    }

}
