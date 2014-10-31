/**
 * @file ExpressionExample.java
 * @author - Valery Samovich
 * @version 1.0
 * @date 07/14/2014
 */

package com.valerysamovich.java.basic.expressions;

public class ExpressionExample {

    public static void main(String[] args) {
        
        int value1 = 1;
        int value2 = 2;
        
        int[] count = new int[5];
        int i = 2;
        count[0] = ++i;
        
        // arithmetic expression with float cast
        float result = (float) (1.2 + 2.5);
        
        // equal expression
        if (value1 == value2) {
            System.out.println("The value1 is equal value2.");
        }else{
            System.out.println("The value1 is not equal value2.");
        }
        
        System.out.println("Element count at index 0: " + i + ".");
        System.out.println(result);
        
    }
}
