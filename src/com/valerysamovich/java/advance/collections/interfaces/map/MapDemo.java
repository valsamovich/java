/**
 * @file MapDemo.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 08/20/2014
 */

package com.valerysamovich.java.advance.collections.interfaces.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Class cCollectionsDemo
 *
 */
public class MapDemo {

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

    }

}
