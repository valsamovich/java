package com.samovich.cop2800.chapter4;

/**
 * Filename DemoBlock.java
 * Created by Valery Samovich
 * Written on 5/24/2016
 */
public class DemoBlock {

    public static void main(String[] args) {
        System.out.println("Demonstrating block scope");

        // first block information
        int x = 1111;
        System.out.println("In first block x is " + x);

        {
            // second block information
            int y = 2222;
            System.out.println("In second block x is " + x);
            System.out.println("In second block x is " + y);
        }

        {
            // third block information
            int y = 3333;
            System.out.println("In third block x is " + x);
            System.out.println("In third block x is " + y);
            demoMethod();
            System.out.println("After method x is " + x);
            System.out.println("After method block y is " + y);
        }

        System.out.println("At the end x is " + x);
    }

    public static void demoMethod(){
        int x = 8888, y = 9999;
        System.out.println("In demoMethod x is " + x);
        System.out.println("In demoMethod block y is" + y);
    }
}
