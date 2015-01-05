/**
 * @file StaticCounter.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/01/05
 */

package com.valerysamovich.java.oop.staticex.counter;

public class StaticCounter {

    static int count = 0;

    StaticCounter() {
        count++;
        System.out.println(count);
    }
}
