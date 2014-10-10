/**
 * @file GenericMethodExample.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 08/13/2014
 */
package com.valerysamovich.java.generics.methods;

public class GenericMethodExample {

    /**
     * Generic method printArray
     * @param inputArray
     */
    public static < E > void printArray(E[] inputArray){
        
        // Display Array elements
        for (E element : inputArray) {
            System.out.printf("%s", element);
        }
        System.out.println();
    }
    
    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        
        // Create arrays of Integer, Double and Character
        Integer[] intArray = {1, 2, 3, 4};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        
        System.out.println("Array integerArray contains:");
        printArray(intArray); // pass an Integer array
        
        System.out.println("Array doubleArray contains:");
        printArray(doubleArray); // pass a Double array
        
        System.out.println("Array charArray contains:");
        printArray(charArray); // pass a Character array
        
    }

}
