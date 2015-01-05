/**
 * @file Counter.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/01/05
 */

package com.valerysamovich.java.oop.staticex.counter;

public class Counter {

    public static void main(String[] args) {

        System.out.println("Non Static Objects:");

        // Non Static Object Counters
        NonStaticCounter c1 = new NonStaticCounter();
        NonStaticCounter c2 = new NonStaticCounter();
        NonStaticCounter c3 = new NonStaticCounter();

        System.out.println(" ");

        System.out.println("Static Objects:");
        // Static Object Counters
        StaticCounter c4 = new StaticCounter();
        StaticCounter c5 = new StaticCounter();
        StaticCounter c6 = new StaticCounter();

    }

}
