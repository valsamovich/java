package org.samovich.cop2800.chapter14;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Filename JActionWithComponents.java
 * Created by Valery Samovich
 * Written on 7/19/2016
 */
public class JActionWithComponents extends JFrame implements ActionListener {
    // declare components
    JLabel label = new JLabel("Enter your name");
    JTextField field = new JTextField(12);
    JButton button = new JButton("OK");

    /**
     * Constructor
     */
    public JActionWithComponents() {
        super("Frame with Components");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(label);
        add(field);
        add(button);
        button.addActionListener(this);
        field.addActionListener(this);
    }

    /**
     * Method change text and button after click
     * @param e
     */
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == button) {
            label.setText("You clicked button");
        } else {
            label.setText("You pressed Enter");
        }
        label.setText("Thank you");
        button.setText("Done");
    }
}
