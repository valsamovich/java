package org.samovich.cop2800.chapter5;

/**
 * Filename ShortCircuitTestAnd.java
 * Created by Valery Samovich
 * Written on 5/31/2016
 */
public class ShortCircuitTestAnd {
    public static void main(String[] args) {
        if (falseMethod() && trueMethod()) {
            System.out.println("Both are true");
        } else {
            System.out.println("Both are not true");
        }
    }

    private static boolean trueMethod() {
        System.out.println("True method");
        return true;
    }

    private static boolean falseMethod() {
        System.out.println("False method");
        return false;
    }
}
