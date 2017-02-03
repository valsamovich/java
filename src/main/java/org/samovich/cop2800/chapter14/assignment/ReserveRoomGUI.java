package org.samovich.cop2800.chapter14.assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DecimalFormat;

/**
 * Filename ReserveRoomGUI.java
 * Created by Valery Samovich
 * Written on 7/23/2016
 */
public class ReserveRoomGUI extends JFrame implements ActionListener, ItemListener {
    // declare components, fields, objects, constants
    DecimalFormat df2 = new DecimalFormat(".##");
    final double TAX_RATE = 7;
    final double BUDGET_ROOM_CHARGE = 100;
    final double BUSINESS_ROOM_CHARGE = 150;
    final double DELUXE_ROOM_CHARGE = 300;
    final double BREAKFAST_PKG = 7;
    final double DINNER_PKG = 15;
    final double SMOKING_ROOM = 5;
    final String STR_BUDGET_ROOM = "Budget ($100/night)";
    final String STR_BUSINESS_ROOM = "Business ($150/night)";
    final String STR_DELUXE_ROOM = "Deluxe ($300/night)";
    final int DEFAULT_NUMBER_OF_NIGHT = 0;
    final double DEFAULT_AMOUNT = 0.0;
    int intNumberOfNights = 0;
    double totalAmount = 0.00;
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
     *
     * @param
     */
    public ReserveRoomGUI() {
        initializeUserInterface();
        setSize(230, 330);
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
        txtNumberOfNights = new JFormattedTextField(5);
        lblTypeOfRoom = new JLabel("Type of Room:");
        cmbTypeOfRoom = new JComboBox<String>();
        cmbTypeOfRoom.addItem(STR_BUDGET_ROOM);
        cmbTypeOfRoom.addItem(STR_BUSINESS_ROOM);
        cmbTypeOfRoom.addItem(STR_DELUXE_ROOM);
        chkBreakfastPkg = new JCheckBox("Breakfast Pkg ($7.00 per day)");
        chkDinnerPkg = new JCheckBox("Dinner Pkg ($15.00 per day)");
        rdNoSmoking = new JRadioButton("No Smoking");
        rdSmoking = new JRadioButton("Smoking ($5.00 per day)");
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
        txtNumberOfNights.setText(String.valueOf(DEFAULT_NUMBER_OF_NIGHT));
        txtNumberOfNights.setColumns(5);
        rdNoSmoking.setSelected(true);
        txtAmountOwed.setText("$0.00");
        txtAmountOwed.setBackground(null);
        txtAmountOwed.setBorder(null);
        // add action listener
        cmbTypeOfRoom.addItemListener(this);
        chkBreakfastPkg.addItemListener(this);
        chkDinnerPkg.addItemListener(this);
        rdNoSmoking.addItemListener(this);
        rdSmoking.addItemListener(this);
        btnReserve.addActionListener(this);
        btnExit.addActionListener(this);
    }

    /**
     * Method update state for amount
     *
     * @param event
     */
    @Override
    public void itemStateChanged(ItemEvent event) {
        String selectedRoom = (String) cmbTypeOfRoom.getSelectedItem();
        Object source = event.getSource();
        int state = event.getStateChange();

        // logic for room type. not completed
        try {
            intNumberOfNights = Integer.parseInt(txtNumberOfNights.getText());
        } catch (NumberFormatException e){
            txtNumberOfNights.setText(String.valueOf(DEFAULT_NUMBER_OF_NIGHT));
        }

        // logic for room type
        if (source == cmbTypeOfRoom) {
            if (state == ItemEvent.SELECTED) {
                if (selectedRoom.equals(STR_BUDGET_ROOM)) {
                    totalAmount = DEFAULT_AMOUNT;
                    totalAmount = BUDGET_ROOM_CHARGE * intNumberOfNights +
                            intNumberOfNights * BUDGET_ROOM_CHARGE * TAX_RATE / 100;
                }
                if (selectedRoom.equals(STR_BUSINESS_ROOM)) {
                    totalAmount = DEFAULT_AMOUNT;
                    totalAmount = BUSINESS_ROOM_CHARGE * intNumberOfNights  +
                            intNumberOfNights * BUSINESS_ROOM_CHARGE * TAX_RATE / 100;
                }
                if (selectedRoom.equals(STR_DELUXE_ROOM)) {
                    totalAmount = DEFAULT_AMOUNT;
                    totalAmount = DELUXE_ROOM_CHARGE * intNumberOfNights  +
                            intNumberOfNights * DELUXE_ROOM_CHARGE * TAX_RATE / 100;
                }
            }
        }
        txtAmountOwed.setText("$" + df2.format(totalAmount));

        // logic for breakfast package
        if (source == chkBreakfastPkg) {
            if (state == ItemEvent.SELECTED) {
                totalAmount += BREAKFAST_PKG  * intNumberOfNights +
                        BREAKFAST_PKG  * intNumberOfNights * TAX_RATE / 100;
            } else {
                totalAmount -= BREAKFAST_PKG  * intNumberOfNights +
                        BREAKFAST_PKG  * intNumberOfNights * TAX_RATE / 100;
            }
        }
        txtAmountOwed.setText("$" + df2.format(totalAmount));

        // logic for dinner package
        if (source == chkDinnerPkg) {
            if (state == ItemEvent.SELECTED) {
                totalAmount += DINNER_PKG  * intNumberOfNights +
                        DINNER_PKG  * intNumberOfNights * TAX_RATE / 100;
            } else {
                totalAmount -= DINNER_PKG  * intNumberOfNights +
                        DINNER_PKG  * intNumberOfNights * TAX_RATE / 100;
            }
        }
        txtAmountOwed.setText("$" + df2.format(totalAmount));

        // logic for nonsmoking option
        if (source == rdNoSmoking) {
            if (state == ItemEvent.SELECTED) {
                rdSmoking.setSelected(false);
            }
        }
        // logic for smoking option
        if (source == rdSmoking) {
            if (state == ItemEvent.SELECTED) {
                rdNoSmoking.setSelected(false);
                totalAmount += SMOKING_ROOM  * intNumberOfNights;
            } else {
                totalAmount -= SMOKING_ROOM  * intNumberOfNights;
            }
        }
        txtAmountOwed.setText("$" + df2.format(totalAmount));
    }

    /**
     * Display dialog box for click
     *
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
                            txtNumberOfNights.getText() + " night(s) for a total of " +
                            txtAmountOwed.getText(),
                    "Message",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        if (event.getActionCommand().equals(strExit)) {
            // the Exit button was clicked
            System.exit(0);
        }
    }
}