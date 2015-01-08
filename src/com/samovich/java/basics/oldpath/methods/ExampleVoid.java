/**
 * @file ExampleVoid.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 11/29/2014
 *
 * The void keyword allows us to create methods which do not return a value. Here,
 * in the following example we're considering a void method methodRankPoints.
 * This method is a void method which does not return any value. Call to a void
 * method must be a statement i.e. methodRankPoints(255.7);. It is a Java statement
 * which ends with a semicolon as shown below.
 */

package com.samovich.java.basics.oldpath.methods;

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
