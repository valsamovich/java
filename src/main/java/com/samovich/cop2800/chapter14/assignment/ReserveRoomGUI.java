package com.samovich.cop2800.chapter14.assignment;

import org.apache.hadoop.yarn.webapp.ResponseInfo;

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
    // declare components, fields, objects, constants
    final int TAX_RATE = 7;
    final int BUDGET_ROOM = 100;
    final int BUSINESS_ROOM = 150;
    final int DELUXE_ROOM = 300;
    final int BREAKFAST_PKG = 7;
    final int DINNER_PKG = 15;
    final int SMOKING_ROOM = 5;
    int totalAmount = 0;
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
        // set default values
        txtNumberOfNights.setText("0");
        rdNoSmoking.setSelected(true);
        txtAmountOwed.setText("$" + totalAmount);
        // add action listener
        chkBreakfastPkg.addItemListener(this);
        chkDinnerPkg.addItemListener(this);
        rdNoSmoking.addItemListener(this);
        rdSmoking.addItemListener(this);
        btnReserve.addActionListener(this);
        btnExit.addActionListener(this);
    }

    /**
     * Display dialog box for click
     * @param event
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        // code to respond to the button click
        String strReserve = btnReserve.getText();
        String strExit = btnExit.getText();
        if (event.getActionCommand().equals(strReserve)) {
            // the Reserve button was clicked
            JOptionPane.showMessageDialog(null,
                    txtName.getText() + " has reserved a room for " +
                    txtNumberOfNights.getText() + " night(s) for a total of $" +
                    txtAmountOwed.getText(),
                    "Message",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        if (event.getActionCommand().equals(strExit)) {
            // the Exit button was clicked
            System.exit(0);
        }
    }

    /**
     * Method update state for amount
     * @param event
     */
    @Override
    public void itemStateChanged(ItemEvent event) {
        Object source = event.getSource();
        int select = event.getStateChange();
        // logic for breakfast package
        if (source == chkBreakfastPkg) {
            if (select == ItemEvent.SELECTED) {
                totalAmount += BREAKFAST_PKG;
            } else {
                totalAmount -= BREAKFAST_PKG;
            }
        }
        txtAmountOwed.setText("$" + totalAmount);
        // logic for dinner package
        if (source == chkDinnerPkg) {
            if (select == ItemEvent.SELECTED) {
                totalAmount += DINNER_PKG;
            } else {
                totalAmount -= DINNER_PKG;
            }
        }
        txtAmountOwed.setText("$" + totalAmount);
        // logic for nonsmoking option
        if (source == rdNoSmoking) {
            if (select == ItemEvent.SELECTED) {
                rdSmoking.setSelected(false);
            }
        }
        // logic for smoking option
        if (source == rdSmoking) {
            if (select == ItemEvent.SELECTED) {
                rdNoSmoking.setSelected(false);
                totalAmount += SMOKING_ROOM;
            } else {
                totalAmount -= SMOKING_ROOM;
            }
        }
        txtAmountOwed.setText("$" + totalAmount);
    }
}
