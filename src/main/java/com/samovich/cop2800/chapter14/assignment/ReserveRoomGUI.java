package com.samovich.cop2800.chapter14.assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Filename ReserveRoomGUI.java
 * Created by Valery Samovich
 * Written on 7/23/2016
 */
public class ReserveRoomGUI extends JFrame implements ActionListener{
    // declare components
    private JLabel lblName;
    private JLabel lblNumberOfNights;
    private JLabel lblTypeOfRoom;
    private JLabel lblAmmountOwed;
    private JTextField txtName;
    private JTextField txtNumberOfNights;
    private JButton btnReserve;
    private JButton btnExit;

    /**
     * Constructor
     * @param title
     */
    public ReserveRoomGUI(String title) {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setSize(240, 400);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO: code to respond to the button click
    }
}
