package org.samovich.cop2800.chapter15;

import javax.swing.*;
import java.awt.*;

/**
 * Filename <filenme>.java
 * Created by Valery Samovich
 * Written on 7/26/2016
 */
public class JFrameWithPanels extends JFrame{
    // declare fields, objects
    private final int WIDTH = 250;
    private final int HEIGHT = 120;
    private JButton buttonl = new JButton("One");
    private JButton button2 = new JButton("Two");
    private JButton button3 = new JButton("Three");

    /**
     * Constructor
     */
    public JFrameWithPanels() {
        super("JFrame with Panels");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(jPanel1);
        container.add(jPanel2);
        jPanel1.add(buttonl);
        jPanel1.setBackground(Color.BLUE);
        jPanel2.add(button2);
        jPanel2.add(button3);
        jPanel2.setBackground(Color.BLUE);
        setSize(WIDTH, HEIGHT);
    }

    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        JFrameWithPanels jFrameWithPanels = new JFrameWithPanels();
        jFrameWithPanels.setVisible(true);
    }

}
