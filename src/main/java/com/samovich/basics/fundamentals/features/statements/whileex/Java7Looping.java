/**
 * @file Java7Looping.java
 * @author Valery Samovich
 * @version 1
 * @date 2014/01/09
 */

package com.samovich.basics.fundamentals.features.statements.whileex;

public class Java7Looping {

    public static void main(String[] args) {

        int intArray[] = {1, 2, 3, 4, 5};
        int index = 0;
        do {
            while (index < 10) {
                System.out.println(index++ + " ");
            }
        } while (index < intArray.length);

    }

}
