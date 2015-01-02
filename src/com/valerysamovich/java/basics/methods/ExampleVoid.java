/**
 * @file ExampleVoid.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 11/29/2014
 */

package com.valerysamovich.java.basics.methods;

public class ExampleVoid {

    public static void main(String[] args) {
        methodRankPoints(255.7);
    }
    
    public static void methodRankPoints(double points) {
        
        if (points >= 202.5) {
            System.out.println("Rank: A1");
        } else if(points >= 122.4) {
            System.out.println("Rank: A1");
        } else {
            System.out.println("Rank: A3");
        }
        
    }
}
