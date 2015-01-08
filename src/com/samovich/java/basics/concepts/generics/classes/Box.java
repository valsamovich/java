/**
 * @file Box.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 08/15/2014
 */

package com.samovich.java.basics.concepts.generics.classes;

public class Box<T> {

    private  T t;
    
    /**
     * Add method
     * @param t
     */
    public void add(T t) {
        this.t = t;
    }
    
    /**
     * Retunt t paremeter
     * @return
     */
    public T get(){
        return t;
    }
    
    public static void main(String[] args) {
        
        // Objects declaration
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();
        
        // Add the values
        integerBox.add(new Integer(10));
        stringBox.add(new String("Hello World"));
        
        System.out.printf("Integer Value :%d\n\n", integerBox.get());
        System.out.printf("String Value :%s\n", stringBox.get());
    }

}
