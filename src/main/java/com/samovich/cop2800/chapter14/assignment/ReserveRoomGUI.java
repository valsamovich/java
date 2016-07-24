package com.samovich.cop2800.chapter14.assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Filename ReserveRoomGUI.java
 * Created by Valery Samovich
 * Written on 7/23/2016
 */
public class ReserveRoomGUI extends JFrame implements ActionListener, ItemListener {
    // declare components
    private JLabel lblName;
    private JLabel lblNumberOfNights;
    private JLabel lblTypeOfRoom;
    private JLabel lblAmountOwed;
    private JTextField txtName;
    private JTextField txtNumberOfNights;
    private JTextField txtAmountOwed;
    private JButton btnReserve;
    private JButton btnExit;
    private JCheckBox chkBreakfastPkg;
    private JCheckBox chkDinnerPkg;
    private JComboBox<String> cmbTypeOfRoom;
    private JRadioButton rdNoSmoking;
    private JRadioButton rdSmoking;
    private Container container;

    /**
     * Constructor
     * @param title
     */
    public ReserveRoomGUI(String title) {
        initializeUserInterface();
        setSize(220, 330);
    }

    /**
     * Create user interface
     */
    public void initializeUserInterface() {
        container = this.getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.LEFT));
        // initialize GUI components
        lblName = new JLabel("Name:");
        txtName = new JTextField(10);
        lblNumberOfNights = new JLabel("Number of Nights:");
        txtNumberOfNights = new JTextField(5);
        lblTypeOfRoom = new JLabel("Type of Room:");
        cmbTypeOfRoom = new JComboBox<String>();
        cmbTypeOfRoom.addItem("Budget($100/night)");
        cmbTypeOfRoom.addItem("Business($150/night)");
        cmbTypeOfRoom.addItem("Delux($300/night)");
        chkBreakfastPkg = new JCheckBox("Breakfast Pkg($7.00 per day)");
        chkDinnerPkg = new JCheckBox("Dinner Pkg($15.00 per day)");
        rdNoSmoking = new JRadioButton("No Smoking");
        rdSmoking = new JRadioButton("Smoking($5.00 per day)");
        lblAmountOwed = new JLabel("Amount owed:");
        txtAmountOwed = new JTextField(5);
        btnReserve = new JButton("Reserve");
        btnExit = new JButton("Exit");
        // add components to layout
        container.add(lblName);
        container.add(txtName);
        container.add(lblNumberOfNights);
        container.add(txtNumberOfNights);
        container.add(lblTypeOfRoom);
        container.add(cmbTypeOfRoom);
        container.add(chkBreakfastPkg);
        container.add(chkDinnerPkg);
        container.add(rdNoSmoking);
        container.add(rdSmoking);
        container.add(lblAmountOwed);
        container.add(txtAmountOwed);
        container.add(btnReserve);
        container.add(btnExit);
    }

    /**
     * Display dialog box for click
     * @param event
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        // code to respond to the button click
        String strButtonText = btnReserve.getText();
        if (event.getActionCommand().equals(strButtonText)) {
            // the Reserve button was clicked
            JOptionPane.showMessageDialog(null,
                    "...",
                    "Message",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            System.exit(0);
        }

    }

    /**
     * Method update state for amount
     * @param event
     */
    @Override
    public void itemStateChanged(ItemEvent event) {

    }
}
