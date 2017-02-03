/**
 * @file StaticExample.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 11/22/2014
 */

package org.samovich.technologies.basics.concepts.classes.staticex.example;

// static is one per class, but not one per object
public class StaticExample {
    
    // static data
    static int staticVariable;
    
    int nonStaticVariable;
    
    // static method
    static public void  staticMethod(){
        System.out.println("staticVariable = " + staticVariable);
        staticVariable++;
        // static methods can only access other static data & methods
    }
    
    public void  nonStaticMethod(){
        System.out.println("nonStaticVariable = " + nonStaticVariable);
        nonStaticVariable++;
    }
    
    static{
        System.out.println("Static block of code");
    }
    
    StaticExample(){
        System.out.println("Contructor");
    }
}
