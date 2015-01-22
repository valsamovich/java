/**
 * @file HashMapDemo.java
 * @author Valery Samovich
 * @version 1
 * @date 2014/01/20
 */

package com.samovich.basics.collections.interfaces.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        
        // Create the map
        Map m1 = new HashMap();
        // Add values to the map
        m1.put("Zara", "8");
        m1.put("Mahnaz", "31");
        m1.put("Ayan", "12");
        m1.put("Daisy", "14");
        
        // Print the results
        System.out.println();
        System.out.println("Map Elements");
        System.out.println("\t" + m1);
        
        // Return the size of the map
        System.out.println(m1.size());

        HashMap hm = new HashMap();

        hm.put("Alex", 98765.45);
        hm.put("Linda", 108765.45);
        hm.put("John", 88765.45);

        System.out.println(hm.get("Linda"));

    }

}
