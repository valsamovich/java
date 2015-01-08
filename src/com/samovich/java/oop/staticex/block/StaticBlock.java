/**
 * @file StaticBlock.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 11/27/2014
 *
 * Example of Java Static block. Which is executed before main method executes.
 */

package com.samovich.java.oop.staticex.block;

public class StaticBlock {

    // Main method
    public static void main(String[] args) {

        System.out.println("main method is executed.");
    }

    /**
     * Static block.
     *
     * Can be used to check conditions before execution of main begin.
     */
    static {
        System.out.println("Static block is executed before main method.");
    }

}
