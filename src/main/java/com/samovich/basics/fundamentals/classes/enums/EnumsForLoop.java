/**
 * @file EnumsForLoop.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/01/28
 */

package com.samovich.basics.fundamentals.classes.enums;

enum Directions {
    
    UP, DOWN, LEFT, RIGHT;
    
}

public class EnumsForLoop {

    public static void main(String[] args) {
        
        for (Directions element : Directions.values()) {
            System.out.printf("%s", element + " ");
        }
        
    }
    
}
