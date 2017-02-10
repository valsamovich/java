/**
 * @file InterfaceDemo.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/03/04
 *
 * In the Java programming Language, an interface is a reference type, similar
 * to a class, that can contain only constants, method signatures, default
 * methods, static methods, and nested types.
 */

package org.samovich.technologies.basics.concepts.inerfaces;

/**
 * Defining an Interface.
 */
public interface InterfaceDemo {

    // constant declarations.

    // base of natural logarithms.
    public static final double E = 2.718282;
    // all constants are implicitly public, static, and final.
    // they can be omitted.
     int F = 100;

    // method signatures: abstract, default, or static.
    void doSomething(int i, double x);
    int doSomethingElse(String s);

}
