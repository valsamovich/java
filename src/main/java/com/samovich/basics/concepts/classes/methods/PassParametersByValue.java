/**
 * @file PassParametersByValue.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 11/29/2014
 *
 * While working under calling process, arguments is to be passed. These should
 * be in the same order as their respective parameters in the method specification.
 * Parameters can be passed by value or by reference.
 *
 * Passing Parameters by Value means calling a method with a parameter. Through
 * this the argument value is passed to the parameter.
 */

package com.samovich.basics.concepts.classes.methods;

public class PassParametersByValue {

    public static void main(String[] args) {

        int a = 30;
        int b = 45;

        System.out.println("Before swapping, a = " + a + " and b = " + b);

        // Invoke the swap method.
        swapFunction(a, b);
        System.out.println(
                "\n**Now, Before and after swapping values will be same here**");
        System.out.println("After swapping, a = " + a + " and b is " + b);
    }

    public static void swapFunction(int a, int b) {

        System.out.println("Before swapping(inside), a = " + a + " and b = " + b);

        // Swap n1 with n2
        int c = a;
        a = b;
        b = c;

        System.out.println("After swapping(inside), a = " + a + " and b = " + b);
    }
}
