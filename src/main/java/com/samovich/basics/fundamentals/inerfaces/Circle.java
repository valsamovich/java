/**
 * @file Circle.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/01/31
 */

package com.samovich.basics.fundamentals.inerfaces;

public class Circle {
    
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
    
}
