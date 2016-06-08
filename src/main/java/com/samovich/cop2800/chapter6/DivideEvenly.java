package com.samovich.cop2800.chapter6;

/**
 * Filename DivideEvenly.java
 * Created by Valery Samovich
 * Written on 6/7/2016
 */
public class DivideEvenly {
    public static void main(String[] args) {
        // loop
        final int LIMIT_1 = 100;
        int var1;
        System.out.print(LIMIT_1 + " is evenly divisible by ");
        for (var1 = 1; var1 <= LIMIT_1; ++var1)
            if (LIMIT_1 % var1 == 0)
                // display the number and a space
                System.out.print(var1 + " ");
        System.out.println();

        // nested loops
        final int LIMIT_2 = 100;
        int var2;
        int number;
        for(number = 1; number <= LIMIT_2; ++number) {
            System.out.print(LIMIT_2 + " is evenly divisible by ");
            for (var2 = 1; var2 <= number; ++var2) {
                if (number % var2 == 0)
                    // display the number and a space
                    System.out.print(var2 + " ");
            }
            System.out.println();
        }
    }
}
