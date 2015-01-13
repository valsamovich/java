/**
 * @file Rectangle.java
 * @author Valery Samovich
 * @version 1
 * @date 2014/01/13
 */

package com.samovich.java.basics.concepts.objects;

public class Rectangle {

    // Public Fields.
    public int width = 0;
    public int height = 0;
    public Point origin;

    /*
     * Collection of four constructors.
     */
    public Rectangle() {
        origin = new Point(0, 0);
    }

    public Rectangle(Point p) {
        origin = p;
    }

    public Rectangle(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }

    public Rectangle(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }

    // A method for moving the rectangle
    public void move (int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    // A method for computing the area of the rectangle
    public int getArea() {
        return width * height;
    }
}
