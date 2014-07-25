/**
 * Example is demonstrate the syntax and use the while statement. The while
 * statement continually executes a block of statements while a particular 
 * condition is true.
 * 
 * @file WhileExample.java
 * @author - Valery Samovich
 * @version 1.0
 * @date 07/24/2014
 */

package com.valerysamovich.java.trail.basic.statements.examplewhile;

public class WhileExample {
    
    /*
     * Main method
     */
    public static void main(String[] args) {
        
        // vars
        int count = 1;
        
        // The while statement evaluates expression, which must a boolean true
        while (count < 11) {
            System.out.println("Count is " + count);
        }

    }

}
