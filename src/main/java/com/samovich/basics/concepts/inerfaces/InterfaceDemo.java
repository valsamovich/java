/**
 * @file InterfaceDemo.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/03/04
 *
 * In the Java programming language, an interface is a reference type, similar
 * to a class, that can contain only constants, method signatures, default
 * methods, static methods, and nested types.
 */

package com.samovich.basics.concepts.inerfaces;

/**
 * Defining an Interface.
 */
public interface InterfaceDemo {

    // constant declarations.

    // base of natural logarithms
    double E = 2.718282;

    // method signatures
    void doSomething(int i, double x);
    int doSomethingElse(String s);

}
