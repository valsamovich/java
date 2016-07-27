package com.samovich.cop2800.chapter15;

import javax.swing.*;
import java.awt.*;

/**
 * Filename JBorderLayout.java
 * Created by Valery Samovich
 * Written on 7/26/2016
 */
public class JGridLayout extends JFrame {
    // instantiate objects
    private JButton nb = new JButton("North");
    private JButton sb = new JButton("South");
    private JButton eb = new JButton("East");
    private JButton wb = new JButton("West");
    private JButton cb = new JButton("Center");

    /**
     * Constructor
     */
    public JGridLayout() {
        setLayout(new GridLayout(2, 3, 2, 4));
        add(nb);
        add(sb);
        add(eb);
        add(wb);
        add(cb);
    }

    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        JGridLayout jbl = new JGridLayout();
        jbl.setSize(250, 250);
        jbl.setVisible(true);
    }
}
