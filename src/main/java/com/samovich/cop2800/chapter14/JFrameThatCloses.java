package com.samovich.cop2800.chapter14;

import javax.swing.*;

/**
 * Filename JFrameThatCloses.java
 * Created by Valery Samovich
 * Written on 7/19/2016
 */
public class JFrameThatCloses {
    public static void main(String[] args) {
        final int WIDTH = 250;
        final int HEIGHT = 250;
        JFrame aFrame = new JFrame("This is a Frame");
        aFrame.setSize(WIDTH, HEIGHT);
        aFrame.setVisible(true);
        aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
