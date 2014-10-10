/**
 * @file CompoundExample.java
 * @author - Valery Samovich
 * @version 1.0
 * @date 07/14/2014
 */

package com.valerysamovich.java.operators.arithmetic;

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
