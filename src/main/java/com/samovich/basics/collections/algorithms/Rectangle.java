/**
* @file Rectangle.java
* @author Valery Samovich
* @version 1
* @date 2015/02/06
*/

package com.samovich.basics.collections.algorithms;

public class Rectangle {

    private int width;
    private int length;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {

        return length * width;

    }
}

