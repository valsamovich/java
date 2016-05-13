/**
 * @file ExampleConstructor.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 11/26/2014
 *
 * A constructor initializes an object when it is created. It has the same name
 * as its class and is syntactically similar to a method. However, constructors
 * have no explicit return type.
 *
 * Typically, you will use a constructor to give initial values to the instance
 * variables defined by the class, or to perform any other startup procedures
 * required to create a fully formed object.
 *
 * All classes have constructors, whether you define one or not, because Java
 * automatically provides a default constructor that initializes all member
 * variables to zero. However, once you define your own constructor, the default
 * constructor is no longer used.
 */

package com.samovich.basics.concepts.classes.methods;

public class ExampleConstructor {

    public static void main(String[] args) {

        ConstructorDemo t1 = new ConstructorDemo();
        ConstructorDemo t2 = new ConstructorDemo();

        System.out.println(t1.x + " " + t2.x);
    }
}
