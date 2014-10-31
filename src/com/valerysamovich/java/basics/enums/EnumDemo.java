/**
 * @file EnumDemo.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 10/15/2014
 */

package com.valerysamovich.java.basics.enums;

/**
 * Enum showing topics covered under Tutorials
 */
enum Tutorials {
    topic1, topic2, topic3;
}

public class EnumDemo {

    /**
     * Main class
     * @param args
     */
    public static void main(String[] args) {
    
        /**
         * The java.lang.Enum.compareTo() method compares this enum with the 
         * specified object for order.Enum constants are only comparable to 
         * other enum constants of the same enum type. 
         * 
         * public final int compareTo(E o)
         * 
         * o - This is object to be compared
         */
        
        Tutorials t1, t2,t3;
        
        t1 = Tutorials.topic1;
        t2 = Tutorials.topic2;
        t3 = Tutorials.topic3;
        
        if(t1.compareTo(t2) > 0) {
            System.out.println(t2 + " completed before " + t1);
        }
        if(t1.compareTo(t2) < 0) {
            System.out.println(t1 + " completed before " + t2);
        }
        if(t1.compareTo(t3) == 0) {
            System.out.println(t1 + " completed before " + t3);
        }
    }

}
