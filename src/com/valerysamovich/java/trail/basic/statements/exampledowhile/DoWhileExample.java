/**
 * Example is demonstrate the do-while example.
 * 
 * @file WhileExample.java
 * @author - Valery Samovich
 * @version 1.0
 * @date 07/24/2014
 */
package com.valerysamovich.java.trail.basic.statements.exampledowhile;

public class DoWhileExample {

    public static void main(String[] args) {
        
        int count = 1;
        
        /*
         * Do-while evaluates its expression at the bottom of the loop. 
         * Therefore, the statement within the do block are always executed at 
         * least once.
         */
        
        do {
            System.out.println("Count is : " + count);
            count++;
        } while (count < 11);
    }

}
