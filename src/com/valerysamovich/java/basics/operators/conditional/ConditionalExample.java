/**
 * @file ConditionalExample.java
 * @author - Valery Samovich
 * @version 1.0
 * @date 07/14/2014
 */

package com.valerysamovich.java.basics.operators.conditional;

public class ConditionalExample {

    public static void main(String[] args) {
        
        int value1 = 1;
        int value2 = 2;
        
        if ((value1 == 1) && (value2 == 2)) {
            System.out.println("Value 1 is 1 and Value 2 is 2");
        }
        if((value1 == 1) || (value2 == 1)) {
            System.out.println("Value 1 is 1 or Value 2 is 1");
        }
    }
}
