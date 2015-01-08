/**
 * @file ArrayListDemo.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 08/22/2014
 */

package com.samovich.java.specialized.collections.classes.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {

    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        
        // Create an array list
        ArrayList myArrayList = new ArrayList();
        // Prints the size of initialized ArrayList
        System.out.println("Initial size of myArrayList: " + myArrayList.size());
        
        // Add elements to the ArrayList
        myArrayList.add("C");
        myArrayList.add("A");
        myArrayList.add("B");
        myArrayList.add(1, "A2");
        // Prints the content of the Array List
        System.out.println("Contents of myArrayList: " + myArrayList);
        
        // Remove elements from the ArrayList
        myArrayList.remove("C");
        myArrayList.remove("B");
        System.out.println("Contents of myArrayList: " + myArrayList);
        System.out.println("Initial size of myArrayList: " + myArrayList.size());
        
    }

}
