/**
 * @file StringWithPlaceholder.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 08/27/2014
 */

package com.samovich.java.basics.strings;

import static org.testng.Assert.assertEquals;

public class StringWithPlaceholder {

    public static void main(String[] args) {
        
        String s = "hello %s!";
        s = String.format(s, "world");
        assertEquals(s, "hello world!");
        System.out.println(s);

    }

}
