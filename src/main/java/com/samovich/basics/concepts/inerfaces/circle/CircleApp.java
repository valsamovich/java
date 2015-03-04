/**
 * @file CircleApp.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/01/31
 */

package com.samovich.basics.concepts.inerfaces.circle;

import java.util.Arrays;

public class CircleApp {

    public static void main(String[] args) {
        
        // Declare and array of Circles and instantiate 4 circles 
        Circle[] circles = {
                new Circle(1.5),
                new Circle(3),
                new Circle(2.1),
                new Circle(0.7)
        };
        
        Arrays.sort(circles);
        
        // Printout an Array of circles
        System.out.println(Arrays.toString(circles));
        
    }
    
}
