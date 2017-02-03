package org.samovich.cop2800.chapter14;

/**
 * Filename <filenme>.java
 * Created by Valery Samovich
 * Written on 7/19/2016
 */
public class JActionWithComponentsApp {
    public static void main(String[] args) {
        // declare objects, fields
        JActionWithComponents aFrame = new JActionWithComponents();
        final int WIDTH = 350;
        final int HEIGHT = 100;
        aFrame.setSize(WIDTH, HEIGHT);
        aFrame.setVisible(true);
    }
}
