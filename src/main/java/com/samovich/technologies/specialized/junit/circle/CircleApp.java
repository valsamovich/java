/**
 * @file CircleApp.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/02/03
 */

package com.samovich.specialized.junit.circle;

public class CircleApp {

    public static void main(String[] args) {

        Circle circle1 = new Circle(10);
        System.out.println(circle1);
        System.out.printf("Area: %.1f%n" ,circle1.area());

    }

}
