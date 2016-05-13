/**
 * @file CircleTest.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/02/03
 */

package com.samovich.specialized.junit.circle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {

    private Circle c = new Circle(10);

    @Test(expected = IllegalArgumentException.class)
    public void testCircleWith0()  {
        new Circle(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCircleWithNegativeRadius()  {
        new Circle(-10);
    }

    @Test
    public void testArea() {
        double expected = 100 * Math.PI;
        double actual = c.area();
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testToString() {
        String expected = "Circle with radius 10.0";
        String actual = c.toString();
        assertEquals(expected, actual);
    }
}