package com.samovich.cop2800.chapter15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Filename JBorderLayout.java
 * Created by Valery Samovich
 * Written on 7/26/2016
 */
public class JCardLayout extends JFrame implements ActionListener{
    // instantiate objects
    private JButton nb = new JButton("North");
    private JButton sb = new JButton("South");
    private JButton eb = new JButton("East");
    private JButton wb = new JButton("West");
    private JButton cb = new JButton("Center");
    CardLayout cardLayout = new CardLayout();

    /**
     * Constructor
     */
    public JCardLayout() {
        setLayout(cardLayout);
        nb.addActionListener(this);
        sb.addActionListener(this);
        eb.addActionListener(this);
        wb.addActionListener(this);
        cb.addActionListener(this);
    }

    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        JCardLayout jbl = new JCardLayout();
        jbl.setSize(250, 250);
        jbl.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cardLayout.next(getContentPane());
    }
}
