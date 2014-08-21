/**
 * @file ColectionsDemo.java
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
public class CollectionsDemo {

    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        
        Map m1 = new HashMap();
        m1.put("Zara", "8");
        m1.put("Mahnaz", "31");
        m1.put("Ayan", "12");
        m1.put("Daisy", "14");
        
        System.out.println();
        System.out.println("Map Elements");
        System.out.println("\t" + m1);

    }

}
