/**
 * @file Child.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 11/22/2014
 *
 * Java Constructor chaining.
 */

package com.samovich.java.oop.constructors.chaining;

public class Child {

    // Main Method.
    public static void main(String[] args) {

        // Creating the Parent Object.
        Parent object = new Parent(8, 9);
        // Call(invoke) show method.
        object.show();

    }
}
