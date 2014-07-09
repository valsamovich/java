package com.valerysamovich.java.lesson1.array;

public class Arrays {

    public static void main(String[] args) {
        
        int myValue = 5;
        
        int[] myArray = new int[4];
        myArray[0] = myValue;
        myArray[1] = 3;
        myArray[2] = 0;
        myArray[3] = 1;
        
        // for loop - iterating over an array
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        
        // foreach - iterating over an array
        for(int number : myArray){
            System.out.println(number);
        }

    }

}
