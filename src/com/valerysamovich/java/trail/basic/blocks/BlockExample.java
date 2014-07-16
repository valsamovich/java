/**
 * @file BlockExample.java
 * @author - Valery Samovich
 * @version 1.0
 * @date 07/14/2014
 */

package com.valerysamovich.java.trail.basic.blocks;

public class BlockExample {

    public static void main(String[] args) {
        
        boolean condition = true;
        
        // begin block 1
        if (condition) {
            System.out.println("Condition is true.");
        // end block 1 and begin block 2
        } else {
            System.out.println("Condition is false.");
        }
        // end block 2

    }

}
