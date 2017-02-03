/**
 * @file StaticCounter.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/01/05
 */

package org.samovich.technologies.basics.concepts.classes.staticex.counter;

public class StaticCounter {

    static int count = 0;

    StaticCounter() {
        count++;
        System.out.println(count);
    }
}
