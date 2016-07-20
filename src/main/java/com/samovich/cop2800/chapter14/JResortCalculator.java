package com.samovich.cop2800.chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Filename JResortCalculator.java
 * Created by Valery Samovich
 * Written on 7/19/2016
 */
public class JResortCalculator extends JFrame implements ItemListener {
    // declare constants, objects
    final int BASE_PRICE = 200;
    final int WEEKEND_PREMIUM = 100;
    final int BREACKFAST_PREMIUM = 20;
    final int GOLF_PREMIUM = 75;
    int totalPrice = BASE_PRICE;
    JCheckBox weekendBox = new JCheckBox("Weekend premium $" + WEEKEND_PREMIUM, false);
    JCheckBox breakfastBox = new JCheckBox("Breakfast $" + BREACKFAST_PREMIUM, false);
    JCheckBox golfBox = new JCheckBox("Golf $" + GOLF_PREMIUM, false);
    JLabel resortLabel = new JLabel("Resort Price Calculator");
    JLabel priceLabel = new JLabel("The price for your stay is");
    JTextField totPrice = new JTextField(4);
    JLabel optionExplainLabel = new JLabel("Base price for a room is $" + BASE_PRICE + ".");
    JLabel optionExplainLabel2 = new JLabel("Check the options you want.");

    /**
     * Constructor
     */
    public JResortCalculator () {
        super("Resort Price Estimator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(resortLabel);
        add(optionExplainLabel);
        add(optionExplainLabel2);
        add(weekendBox);
        add(breakfastBox);
        add(golfBox);
        add(priceLabel);
        add(totPrice);
        totPrice.setText("$" + totalPrice);
        weekendBox.addItemListener(this);
        breakfastBox.addItemListener(this);
        golfBox.addItemListener(this);
    }

    /**
     * Method that executes when  the user selects oe deselects
     * @param event
     */
    public void itemStateChanged (ItemEvent event) {
        Object source = event.getSource();
        int select = event.getStateChange();

        if(source == weekendBox) {
            if (select == ItemEvent.SELECTED) {
                totalPrice += WEEKEND_PREMIUM;
            } else {
                totalPrice -= WEEKEND_PREMIUM;
            }
        } else if(source == breakfastBox) {
            if(select == ItemEvent.SELECTED) {
                totalPrice += BREACKFAST_PREMIUM;
            } else {
                totalPrice -= BREACKFAST_PREMIUM;
            }
        } else { // if(source == golfBox) by default
            if (select == ItemEvent.SELECTED) {
                totalPrice += GOLF_PREMIUM;
            } else {
                totalPrice -= GOLF_PREMIUM;
            }
            totPrice.setText("$" + totalPrice);
        }
    }

    public static void main(String[] args) {
        // declare objects, fields
        JResortCalculator aFrame = new JResortCalculator();
        final int WIDTH = 300;
        final int HEIGHT = 200;
        aFrame.setSize(WIDTH, HEIGHT);
        aFrame.setVisible(true);
    }
}


