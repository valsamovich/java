/**
 * @file Circle.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/01/31
 */

package com.samovich.basics.fundamentals.inerfaces;

public class Circle implements Comparable<Circle>{
    
    // Field.
    private double radius;
    
    // Constructor.
    public Circle(double r) {
        this.radius = r;
    }
    
    // Getter.
    public double getRadius() {
        return radius;
    }
    
    // Setter.
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public String toString() {
        return "C:" + radius;
    }

    @Override
    public int compareTo(Circle other) {
        if(other == null) {
            throw new NullPointerException("Can't compare with null");
        }
        
        // return (int) Math.signum(radius - other.radius);
        if(radius > other.radius) {
            return 1;
        } else if(radius < other.radius) {
            return -1;
        }

        return 0;
    }
    
}
