/**
 * @file SetDemo.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 08/21/2014
 */

package com.valerysamovich.java.advance.collections.interfaces.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    
    /**
     * Main method
     * @param args
     */
    public static void main(String args[]) {
        
        // Declared and initialized the int array
        int count[] = {34, 22, 10, 60, 30, 22};
        // Create the Set Integer Collection
        Set<Integer> set = new HashSet<Integer>();
        // Try catch block
        try {
            // For loop
            for (int i = 0; i < 5; i++) {
                set.add(count[i]);
            }
            // Prints the values from int array
            System.out.println(set);
            
            // TreeSet
            TreeSet sortedSet = new TreeSet<Integer>(set);
            System.out.println("The sorted list is: " + sortedSet);
            System.out.println("The first element of the set is: " +
                    (Integer)sortedSet.first());
            
        } catch (Exception e) {
            // statement(s)
        }
    }
}
