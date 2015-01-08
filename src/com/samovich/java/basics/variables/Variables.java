package com.samovich.java.basics.variables;

public class Variables {

    public static void main(String[] args) {
        
        /*
         * "int"  - primitive data type of java field
         * "gear" - program field
         * "1"    - initial value of field gear
         */
        int gear = 1;
        
        // literals
        boolean result = true;
        char capitalC = 'C';
        byte b = 100;
        short s = 10000;
        int i = 100000;
        
        // variables
        int myVariable;
        myVariable = 5;
        myVariable = 10;
        
        // myVariable = myVariable + 1;
        myVariable += 1; 
        
        System.out.println(gear);
        System.out.println(myVariable);
        
        String hello = "Hello, "; // string 
        String name = "Valery!";
        System.out.println(hello + name);

    }

}
