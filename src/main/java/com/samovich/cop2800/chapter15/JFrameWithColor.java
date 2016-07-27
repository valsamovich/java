package com.samovich.cop2800.chapter15;

import javax.swing.*;
import java.awt.*;

/**
 * Filename JFrameWithColor.java
 * Created by Valery Samovich
 * Written on 7/26/2016
 */
public class JFrameWithColor extends JFrame {

    private final int SIZE = 180;
    private Container container = getContentPane();
    private JButton button = new JButton("Press me");

    /**
     * Constructor
     */
    public JFrameWithColor() {
        super("Frame");
        setSize(SIZE, SIZE);
        container.setLayout(new FlowLayout());
        container.add(button);
        container.setBackground(Color.YELLOW);
        button.setBackground(Color.RED);
        button.setForeground(Color.WHITE);
    }

    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {
        JFrameWithColor jFrameWithColor = new JFrameWithColor();
        jFrameWithColor.setVisible(true);
    }
}
