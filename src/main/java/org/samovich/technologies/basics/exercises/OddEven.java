/**
 * @file OddEven.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/01/21
 */

package org.samovich.technologies.basics.exercises;

public class OddEven {

    public static boolean evenNum (double num) {
        
        if (num % 2 == 0) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
        
    }
    
}
