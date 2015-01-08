/**
 * @file SmallBox.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 11/22/2014
 */

package com.samovich.java.oop.constructors.box;

public class SmallBox {
    
    int length;
    int width;
    
    /*
     * Constructor Method:
     * 1. constructor is a method that has the same name as the class.
     * 2. It is executed when an object is created.
     * 3. It is used to set default values. 
     * 4. does not return anything including void.
     */
    SmallBox(){ 
        this.length = 5;
        this.width = 6;
        System.out.println("Constructor fired");
    }
    
    // Constructor Method with parameters.
    SmallBox(int length, int width){ 
        this.length = length;
        this.width = width;
    }
    
    void calculateArea(){
        System.out.println("Area = " + (length * width));
    }
}
