/**
 * @file RectangleApp.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/02/06
 */

package com.samovich.basics.collections.algorithms;

import java.util.Scanner;

public class RectangleApp {

    public static void main(String[] args) {

        // Display new rectangle from data provided by the user
        Scanner input = new Scanner(System.in);
        System.out.println("Length: ");
        int length = input.nextInt();
        System.out.println("Width: ");
        int width = input.nextInt();

        Rectangle myRectangle = new Rectangle(length, width);

        // Display length, width, and are of the rectangle
        System.out.printf("Length:%d Width:%d Area:%d%n",
                myRectangle.getLength(), myRectangle.getWidth(),
                myRectangle.getArea());

        // Double the size of the rectangle length
        int doubleLength = myRectangle.getLength() * 2;
        myRectangle.setLength(doubleLength);

        // Display the are of the modified rectangle
        System.out.printf("After length was doubled:%d%n", myRectangle.getArea());
    }

}
