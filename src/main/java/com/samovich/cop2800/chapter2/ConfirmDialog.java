package com.samovich.cop2800.chapter2;

import javax.swing.*;

/**
 * Filename ConfirmDialog.java
 * Created by Valery Samovich
 * Written on 5/16/16
 */
public class ConfirmDialog {

    public static void main(String[] args) {
        int response = 0;
        response = JOptionPane.showConfirmDialog(
                null,
                "Do you want to delete this customer?",
                "Confirm Delete",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.OK_OPTION){
            // execute some code to delete the customer
            System.out.println("You clicked the OK option.");
        } else if(response == JOptionPane.CANCEL_OPTION){
            // execute some code to skip deleting the customer
            System.out.println("You clicked the cancel option.");
        } else if(response == JOptionPane.CLOSED_OPTION) {
            // execute some code to skip deleting the customer
            System.out.println("You clicked the close option.");
        }
    }
}
