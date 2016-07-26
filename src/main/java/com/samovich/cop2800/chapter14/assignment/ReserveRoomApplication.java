package com.samovich.cop2800.chapter14.assignment;

import javax.swing.*;

/**
 * Filename ReserveRoomApplication.java
 * Created by Valery Samovich
 * Written on 7/23/2016
 */
public class ReserveRoomApplication {
    public static void main(String[] args) {
        // instantiate an object of the ReserveRoomGUI
        ReserveRoomGUI reserveRoomGUI = new ReserveRoomGUI();
        reserveRoomGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        reserveRoomGUI.setVisible(true);
        reserveRoomGUI.setTitle("Reserve Room");
    }
}
