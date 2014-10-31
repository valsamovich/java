/**
 * Example is demonstrate the do-while control flow statement. Do-while 
 * evaluates its expression at the bottom of the loop. Therefore, the statement 
 * within the do block are always executed at least once.
 * 
 * @file DoWhileExample.java
 * @author - Valery Samovich
 * @version 1.0
 * @date 07/24/2014
 */

package com.valerysamovich.java.basic.statements.exampledowhile;

public class DoWhileExample {

    public static void main(String[] args) {
        
        int count = 1;
        
        // do-while statement
        do {
            System.out.println("Count is : " + count);
            count++;
        } while (count < 11);
    }

}
