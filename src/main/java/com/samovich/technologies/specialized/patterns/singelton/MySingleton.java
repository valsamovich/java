/**
 * @file MySingleton.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/02/16
 * 
 * In software engineering, the singleton pattern is a design pattern that 
 * restricts the instantiation of a class to one object. This is useful when
 * exactly one object is needed to coordinate actions across the system.
 */

package com.samovich.specialized.patterns.singelton;

public class MySingleton {
    
    private static MySingleton myObj;
    
    // Create private constructor
    private MySingleton() {}
    
    // Create a static method to get instance
    public static MySingleton getInstance() {
        if(myObj == null) {
            myObj = new MySingleton();
        }
        return myObj;
    }
    
    public void getSomething() {
        // Do something here
        System.out.println("I am here ...");
    }

    public static void main(String[] args) {
        MySingleton st = MySingleton.getInstance();
        st.getSomething();
    }
    
}
