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
    
    public static void main(String[] args) {
        
        // variable
        int count = 1;
        
        /*
         * The while statement evaluates expression, which must return a boolean
         * value. I f the expression to true, the while statement executes the 
         * statement(s) in the while block. The while statement continues 
         * testing the expression and executing its block until the expression
         * evaluates to false. Example is print the values from 1 to 10.
         */
        while (count < 11) {
            System.out.println("Count is " + count);
            count++;
        }

    }

}
