/**
 * @file Circle.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/02/03
 */

package org.samovich.technologies.specialized.junit.circle;

public class Circle {

    // Field.
    private final double radius;

    // Parametrised constructor
    public Circle (double r) {
        if(r <= 0) {
            throw new IllegalArgumentException("Radius has to be grater than 0");
        }
        radius = r;
    }

    // Calculate area method.
    public double area() {
        return Math.pow(radius, 2) * Math.PI;
    }

    // To String method.
    public String toString() {
        return "Circle with radius " + radius;
    }
}
