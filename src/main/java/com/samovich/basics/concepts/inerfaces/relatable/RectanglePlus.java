/**
 * @file RectanglePlus.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/03/04
 */

package com.samovich.basics.concepts.inerfaces.relatable;

import com.samovich.basics.concepts.objects.Point;

/**
 * Implementation of Relatable interface some Logic.
 */
public class RectanglePlus implements Relatable {

    public int width = 0;
    public int height = 0;
    public Point origin;

    // four constructors
    public RectanglePlus() {
        origin = new Point(0, 0);
    }

    public RectanglePlus(Point p) {
        origin = p;
    }

    public RectanglePlus(int w, int h) {

    }

    public int isLargerThan(Relatable other) {
        return 0;
    }
}
