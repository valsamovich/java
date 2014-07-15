package com.valerysamovich.java.trail.basic.operators.unary;

public class PrePostExample {

    public static void main(String[] args) {
        
        int i = 3;
        i++;
        
        // result is 4
        System.out.println(i);
        i++;
        
        // result is now 5
        System.out.println(i);
        
        // result is now 6
        System.out.println(++i);
        
        // result is now 6
        System.out.println(i++);
        
        // result is now 7
        System.out.println(i);
    }
}
