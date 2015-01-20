/**
 * @file ArrayListForEach.java
 * @author Valery Samovich
 * @version 1
 * @date 2014/01/09
 */

/*
 *  Following code shows an example how to create a Collection of type List
 *  which is parameterized with <String> to indicate to the Java compiler
 *  that only Strings are allowed in this list.
 */
package com.samovich.java.basics.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListForEach {

    public static void main(String[] args) {

        // Create a list, use is ArrayList as concrete type
        // ArrayList<> infers the String type from the left side
        List<String> myList = new ArrayList<String>();
        
        myList.add("string1");
        myList.add("string2");
        myList.add("string3");

        // Loop over it and print the result to the console
        for(String value : myList) {
            System.out.println(value);
        }
    }
}
