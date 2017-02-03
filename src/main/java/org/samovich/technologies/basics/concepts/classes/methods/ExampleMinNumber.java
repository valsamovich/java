/**
 * @file ExampleMinNumber.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 11/26/2014
 *
 * For using a method, it should be called. There are two ways in which a method
 * is called i.e. method returns a value or returning nothing (no return value).
 *
 * The process of method calling is simple. When a program invokes a method, the
 * program control gets transferred to the called method. This called method then
 * returns control to the caller in two conditions, when:
 *
 * - return statement is executed.
 * - reaches the method ending closing brace.
 */

package org.samovich.technologies.basics.concepts.classes.methods;

public class ExampleMinNumber {

    public static void main(String[] args) {

        int a = 11;
        int b = 6;
        int c = minFunction(a, b);
        System.out.println("Minimum value = " + c);

    }
    /*
     * Return the minimum of two numbers
     */
    private static int minFunction(int n1, int n2) {

        int min;

        if (n1 > n2) {
            min = n2;
        } else {
            min = n1;
        }

        return min;
    }
}
