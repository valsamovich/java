/**
 * @file ExampleOverloading.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/01/02
 *
 * When a class has two or more methods by same name but different parameters, it
 * is known as method overloading. It is different from overriding. In overriding
 * a method has same method name, type, number of parameters etc.
 */

package com.samovich.java.basics.methods;

public class ExampleOverloading {

    public static void main(String[] args) {

        int a = 11;
        int b = 6;
        double c = 7.3;
        double d = 9.4;

        int result1 = minFunction(a, b);
        // Same function name with different parameters
        double result2 = minFunction(c, d);

        System.out.println("Minimum value = " + result1);
        System.out.println("Minimum value = " + result2);
    }

    /*
     * For integer.
     */
    public static int minFunction( int n1, int n2) {

        int min;

        if (n1 > n2) {
            min = n2;
        } else {
            min = n1;
        }
        return min;

    }

    /*
     * For double.
     */
    public static double minFunction(double n1, double n2) {

        double min;

        if (n1 > n2) {
            min = n2;
        } else {
            min = n1;
        }
        return min;

    }

}
