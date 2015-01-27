/**
 * @file Language.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 11/22/2014
 *
 * Java Constructor overloading
 */

package com.samovich.basics.fundamentals.classes.constructors.overloading;

public class Language {

    String name;

    // Constructor method.
    Language() {
        System.out.println("Constructor method called.");
    }

    // Constructor method with parameter.
    Language(String value) {
        name = value;
    }

    // Main method.
    public static void main(String[] args) {

        // Creating the language objects with Constructor without parameter.
        Language cpp = new Language();
        // Creating the language objects with Constructor and parameter.
        Language java = new Language("Java");

        cpp.setName("C++");

        cpp.getName();
        java.getName();
    }

    // Setter
    void setName(String value) {
        name = value;
    }

    // Getter
    void getName() {
        System.out.println("Language name: " + name);
    }
}
