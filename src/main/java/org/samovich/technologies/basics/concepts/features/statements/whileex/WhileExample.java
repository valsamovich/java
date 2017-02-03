/**
 * Example is demonstrate the syntax and use of the while statement. The while
 * statement continually executes a block of statement(s) while a particular 
 * boolean condition is true. The while statement continues testing the 
 * expression and executing its block until the expression evaluates to false. 
 * Example is print the values from 1 to 10.
 * 
 * @file WhileExample.java
 * @author - Valery Samovich
 * @version 1.0
 * @date 07/24/2014
 */

package org.samovich.technologies.basics.concepts.features.statements.whileex;

public class WhileExample {
    
    public static void main(String[] args) {
        
        // variable
        int count = 1;
        
        /*

         */
        while (count < 11) {
            System.out.println("Count is " + count);
            count++;
        }

    }

}
