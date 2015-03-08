/**
 * @file PairApp.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/03/07
 */

package com.samovich.basics.concepts.generics.multiple;

public class PairApp {

    public static void main(String[] args) {
        
        OrderedPair<String, Integer> p1 = new OrderedPair<>("Even", 8);
        OrderedPair<String, String> p2 = new OrderedPair<>("Hello", "World!");
        
    }
}