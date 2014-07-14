package com.valerysamovich.java.trail.basic.operators;

public class CompoundExample {

    public static void main(String[] args) {
        
        // result is 4
        int compoundResult = 2 + 2;
        System.out.println(compoundResult);
        
        // result is now 10
        compoundResult += 2 + 4;
        System.out.println(compoundResult);
        
        // result is now 5
        compoundResult /= 2;
        System.out.println(compoundResult);

    }

}
