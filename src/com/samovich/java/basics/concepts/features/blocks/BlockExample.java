/**
 * @file BlockExample.java
 * @author - Valery Samovich
 * @version 1.0
 * @date 07/14/2014
 */

package com.samovich.java.basics.concepts.features.blocks;

public class BlockExample {

    public static void main(String[] args) {
        
        boolean condition = true;
        
        // start block 1
        if (condition) {
            System.out.println("Condition is true.");
        // end block 1 and start block 2
        } else {
            System.out.println("Condition is false.");
        }
        // end block 2
    }

}
