package com.valerysamovich.java.basics.arrays;

public class ArrayDemo {

    public static void main(String[] args) {
        
        // declares an array of integers
        int[] anArray;
        
        // allocates memory for 3 integers
        anArray = new int[3];
        
        // initialize first element
        anArray[0] = 10;
        // initialize second element
        anArray[1] = 20;
        // initialize the last element
        anArray[2] = 30;
        
        // print the output
        System.out.println("Element at index 0: " + anArray[0]);
        System.out.println("Element at index 1: " + anArray[1]);
        System.out.println("Element at index 2: " + anArray[2]);
        
        // for loop - iterating over an array
        for (int i = 0; i < anArray.length; i++) {
            System.out.println(anArray[i]);
        }
        
        // foreach - iterating over an array
        for(int number : anArray){
            System.out.println(number);
        }

    }

}
