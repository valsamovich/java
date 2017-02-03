package org.samovich.cop2800.chapter15;

import javax.swing.*;
import java.awt.*;

/**
 * Filename JScrollDemo.java
 * Created by Valery Samovich
 * Written on 7/26/2016
 */
public class JScrollDemo extends JFrame{
    private JPanel jPanel = new JPanel();
    private JScrollPane jScrollPane = new JScrollPane(jPanel,
            ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
    private JLabel jLabel = new JLabel("Four score and seven");
    private Font bigFont = new Font("Arial", Font.PLAIN, 20);
    private Container container;

    /**
     * Constructor
     */
    public JScrollDemo() {
        super("JScrollDemo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        container = getContentPane();
        jLabel.setFont(bigFont);
        container.add(jScrollPane);
        jPanel.add(jLabel);
    }

    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        final int WIDTH = 180;
        final int HEIGHT = 100;
        JScrollDemo jScrollDemo = new JScrollDemo();
        jScrollDemo.setSize(WIDTH, HEIGHT);
        jScrollDemo.setVisible(true);
    }
}
